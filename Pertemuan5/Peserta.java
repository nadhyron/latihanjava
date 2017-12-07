import java.util.Scanner;
import java.util.Random;

class Peserta {
	
	String id_peserta;
	String no_registrasi;
	String nama;
	String asal_sekolah;
	String pendidikan;
	String alamat;
	char jenis_kelamin;
	String username;
	String password;
	boolean status = false;

	void login() {

	}

	boolean auth(String emailf, String password) {
		return true;
	}

	void daftar() {
		Scanner scan =  new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("*  Silahkan lengkapi formulir pendaftaran *");
		System.out.println("*  -------------------------------------- *");
		System.out.print("Nama Peserta : ");
		nama = scan.nextLine();
		System.out.print("Asal Sekolah : ");
		asal_sekolah = scan.nextLine();
		System.out.print("Pendidikan Terakhir : ");
		pendidikan = scan.nextLine();
		System.out.print("Alamat : ");
		alamat = scan.nextLine();
		System.out.print("Jenis Kelamin (L/P) : ");
		jenis_kelamin = scan.next().charAt(0);

		System.out.println();

		System.out.println("* --Lengkapi informasi login akun-------- *");
		System.out.print("Username : ");
		username = scan.nextLine();
		System.out.print("Password : ");
		password = scan.nextLine();
		
		System.out.println();

		if (!nama.isEmpty() || !asal_sekolah.isEmpty() || !pendidikan.isEmpty() || !alamat.isEmpty() || !username.isEmpty() || !password.isEmpty()) {
			this.generateNoregister();
			status = true;
		} else {
			System.out.println("*  -------------------------------------- *");
			System.out.println("*  Anda gagal daftar peserta maba.  :(    *");
		}	

		System.out.println();

	}

	void generateNoregister() {
		Random rand = new Random();
		no_registrasi = "REG-" + rand.nextInt(99999);

	}

	void isRegister() {
		if (status) {
			System.out.println("*  -------------------------------------- *");
			System.out.println("*  Anda berhasil daftar.                  *");
			System.out.println("No registrasi anda : " + no_registrasi);
			System.out.println();
		}
	}


}