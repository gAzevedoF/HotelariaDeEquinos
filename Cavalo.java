
public class Cavalo {
	private Dono dono;
	private String nome;
	private int idade;
	private String sexo;
	private double peso;
	private String cabanha;
	private String rp;

	public Cavalo(Dono dono, String nome, int idade, String sexo, double peso, String cabanha, String rp) {
		super();
		this.dono = dono;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.cabanha = cabanha;
		this.rp = rp;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCabanha() {
		return cabanha;
	}

	public void setCabanha(String cabanha) {
		this.cabanha = cabanha;
	}

	public String getRp() {
		return rp;
	}

	public void setRp(String rp) {
		this.rp = rp;
	}

	@Override
	public String toString() {
		return dono + "\n=====Dados do Cavalo====\nNome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nCabanha: "
				+ cabanha + "\nRP: " + rp;
	}

	public String toCommaText() {

		return dono.getNome() + ";" + dono.getCpf() + ";" + dono.getCelular() + ";" + dono.getEndereco() + ";" + nome
				+ ";" + idade + ";" + peso + ";" + cabanha + ";" + rp + ";";
	}

}
