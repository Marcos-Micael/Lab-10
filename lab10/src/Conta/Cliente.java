package Conta;

public class Cliente {

	private String cpf;
	private String nome;
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
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
	
}
