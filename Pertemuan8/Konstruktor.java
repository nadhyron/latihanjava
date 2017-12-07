// Konstruktor

// adalah prosedur atau aksi yang dibuat pada saat objek di ciptakan
// konstruktor memiliki nama yg sama dengan nama kelas
// ketika objek dibuat new maka konstruktor akan di panggil
// konstruktor sudah dibuat/sudah ada walaupun tidak didefinisikan oleh programmer
// class Mahasiswa construktor ny Mahasiswa()

public class Konstruktor {

	String nama;

	Konstruktor (String text) {
		this.nama = text;
		this.printNama();
	}

	public static void main(String[] args) {
		Konstruktor konstruk = new Konstruktor("Jajang");

	}

	public void printNama () {
		System.out.println(nama);
	}
}