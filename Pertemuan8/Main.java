class Main {
	public static void main(String[] args) {
		Main method = new Main();
		method.tampilTeks("Mari belajar mewarnai dan menari");
		System.out.println(method.kembalikanNilai(90,9));
	}

	void tampilTeks(String text) {
		System.out.println(text);
	}

	int kembalikanNilai(int nilai, int nilai2) {
		return nilai * nilai2;
	}

	int kembalikanNilai(int nilai) {
		return nilai * 2;
	}
}

