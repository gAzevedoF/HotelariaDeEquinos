import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hotelaria {
	private Cavalo[] cocheiras;
	private String[] servicos;
	private int index;

	public Hotelaria(int capacidade) {
		cocheiras = new Cavalo[capacidade];
		servicos = new String[capacidade];

	}

	public boolean addCavalo(Cavalo c) {
		if (this.cocheiras == null) {
			cocheiras[0] = c;
			return true;
		}
		for (int i = 0; i < cocheiras.length; i++) {
			if (cocheiras[i] == null) {
				cocheiras[i] = c;
				return true;
			}
		}

		return false;
	}

	public boolean carregarCavalos(File file) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				if (index < cocheiras.length) {
					String[] cols = line.split(";");
					Cavalo horse = new Cavalo(new Dono(cols[0], cols[1], cols[2], cols[3]), cols[4],
							Integer.parseInt(cols[5]), cols[6], Double.parseDouble(cols[7]), cols[8], cols[9]);

					System.out.println(horse);
					cocheiras[index] = horse;
					index++;

				}
			}

		}
		return true;
	}

	public void save(File file) throws IOException {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			for (int i = 0; i < index; i++) {
				bw.write((cocheiras[i]).toCommaText());
				bw.newLine();
			}
		}
	}

	public void remove() {
		System.out.println("Selecione o Cavalo a ser removido: ");
		listar();
		Scanner n = new Scanner(System.in);
		int resposta = n.nextInt();

		cocheiras[resposta - 1] = null;
		System.out.println("Cavalo Removido!!");
		n.close();
	}

	public void listar() {
		System.out.println("Lista de Cavalos:");
		for (int i = 0; i < cocheiras.length; i++) {
			if (cocheiras[i] == null) {
				System.out.println(i + 1 + " - Cocheira Vazia\n");
			} else {
				System.out.println(i + 1 + ": \n" + cocheiras[i] + "\n");
			}
		}
	}

	public void addServicos(int cocheira) {
		System.out.println(
				"Selecione o Servi�o: \n1 - Inje��o Intravenosa/muscular\n2 - Dosagem de Verm�fego\n3 - Aluguel de cavalo\n4 - Encilhar Cavalo\n5 - Aula de Equita��o");

		Scanner n = new Scanner(System.in);
		String resposta = n.next();
		if (servicos[cocheira - 1] == null) {
			servicos[cocheira - 1] = resposta;
		} else {
			servicos[cocheira - 1] += resposta;
		}
		n.close();
	}

	public void fecharFatura(int cocheira) {
		System.out.println("===FATURA DO M�S===");
		double valorCocheira = 0;
		String sexo = cocheiras[cocheira - 1].getSexo();
		if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("MC")) {
			valorCocheira = 350;
		} else {
			valorCocheira = 450;
		}

		System.out.println("Valor da Cocheira: R$" + valorCocheira);
		System.out.println("Servi�os Adicionais: ");

		double valorServicos = 0;
		for (int i = 0; i < servicos[cocheira - 1].length(); i++) {
			if (servicos[cocheira - 1].charAt(i) == '1') {
				System.out.println("Inje��o Intravenosa/muscular: R$10,00");
				valorServicos += 10;
			}
			if (servicos[cocheira - 1].charAt(i) == '2') {
				System.out.println("Dosagem de Verm�fego: R$10,00");
				valorServicos += 10;
			}
			if (servicos[cocheira - 1].charAt(i) == '3') {
				System.out.println("Aluguel de Cavalo: R$50,00");
				valorServicos += 50;
			}
			if (servicos[cocheira - 1].charAt(i) == '4') {
				System.out.println("Encilhar Cavalo: R$10,00");
				valorServicos += 10;
			}
			if (servicos[cocheira - 1].charAt(i) == '5') {
				System.out.println("Aula de Equita��o: R$50,00");
				valorServicos += 50;
			}
		}
		System.out.println("\nTOTAL: R$" + (valorCocheira + valorServicos));

		servicos[cocheira] = "";
	}

}
