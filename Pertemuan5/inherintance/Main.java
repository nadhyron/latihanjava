import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dosen dosen = new Dosen();

		dosen.mengajar();

		dosen.printNama();

		String nama;

		Scanner scan = new Scanner(System.in);

		nama = scan.nextLine();

		dosen.setNamaDosen(nama);

		dosen.printNama();

	}
}