import java.util.Scanner;

public class contoh2{
public static void main (String[]args)
{
Scanner input = new Scanner
(System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean menikah;
	
System.out.print("Masukan Nama : ");
nama = input.nextLine();

System.out.print("Masukan jenis Kelamin : ");
jenisKelamin = input.next().charAt(0);

System.out.print("Masukan tinggi Badan : ");
tinggiBadan = input.nextInt();

System.out.print("Masukan status menikah : ");
menikah = input.nextBoolean();

System.out.println(nama);
System.out.println(jenisKelamin);
System.out.println(tinggiBadan);
System.out.println(menikah);
}
}
