import java.io.File;

public class TESTE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotelaria c = new Hotelaria(20);

		try {
			c.carregarCavalos(new File("C:/temp/documentoHot.txt"));
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println();
		System.out.println();

		c.addServicos(1);
		System.out.println();
		System.out.println();
		c.fecharFatura(1);

	}
}
