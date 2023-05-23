package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3307/nefertitiestetica?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "1234";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public void inserirFuncionario(JavaBeans funcionario) {
		String create = "INSERT INTO funcionario (nome,cpf,telefone1) values (?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, funcionario.getNome());
			pst.setString(2, funcionario.getCpf());
			pst.setString(3, funcionario.getTelefone1());

			pst.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
