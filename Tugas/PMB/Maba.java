import java.util.Scanner;
class Maba{
	String no_reg;
	String nama;
	String alamat;	
	
	void Daftar(){
	Scanner scan = new Scanner (System.in);

	System.out.print("Masukan No_Registrasi :");
	no_reg = scan.nextLine();
	System.out.print("Masukan Nama Lengkap  :");
	nama = scan.nextLine();
	System.out.print("Masukan Alamat        :");
	alamat = scan.nextLine();
	
	
	}
}
