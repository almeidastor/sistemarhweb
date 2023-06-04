package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
	
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
		
		public boolean autenticarUsuario(Usuario usuario) {
			
	        String query = "SELECT COUNT(*) FROM login WHERE cpf = ? AND senha = ?";

	        try (Connection con = conectar();
	             PreparedStatement stmt = con.prepareStatement(query)) {
	        	
	            stmt.setString(1, usuario.getNome());
	            stmt.setString(2, usuario.getSenha());

	            ResultSet rs = stmt.executeQuery();

	            if (rs.next()) {
	                int count = rs.getInt(1);
	                return count > 0;
	            }
	           

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }

	}

	