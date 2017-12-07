class PenggunaanThis {

	String nama;

	public PenggunaanThis () {
		this("Udin");

		nama = "BUCE";
	}

	public PenggunaanThis(String nama) {
		this.nama = nama;
	}

	public static void main(String[] args) {
		PenggunaanThis dis = new PenggunaanThis();
		System.out.println(dis.nama);


		VariabelStatic statik = new VariabelStatic();

		System.out.println(statik.angka());

		System.out.println(VariabelStatic.jurusan);

		VariabelStatic.getName();
	}
}