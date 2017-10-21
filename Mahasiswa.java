	public class mahasiswa{
		public static void main (String[] args){
		System.out.println ("int adalah method utama");
		
		mahasiswa Nhadiron = new mahasiswa();
		Nhadiron.printNama();
		System.out.println(Nhadiron.calculateumur());
	}
		
	public void printNama() {
		System.out.println("Nhadiron");
	}
	public int calculateumur(){
		int tahun_lahir = 1992;
		int tahun_sekarang = 2017;
		
		int umur;
		umur = tahun_sekarang - tahun_lahir;
		
		return umur;
	}
	}
	
	