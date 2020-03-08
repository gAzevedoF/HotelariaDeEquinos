
public class Dono {

	private String nome;
	private String cpf;
	private String celular;
	private String endereco;

	public Dono(String nome, String cpf, String celular, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.endereco = endereco;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "====Dados do Dono==== \nNome: " + nome + "\nCPF: " + cpf + "\nCelular: " + celular + "\nEndereco: "
				+ endereco;
	}

}
