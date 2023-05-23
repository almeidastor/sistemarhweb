package model;

public class JavaBeans {
	private String nome;
	private String cpf;
	private String telefone1;
	
	
	
	public JavaBeans() {
		super();
		
	}
	
	
	public JavaBeans(String nome, String cpf, String telefone1) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone1 = telefone1;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
}
