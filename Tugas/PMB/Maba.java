import java.util.Scanner;
class Maba{
	String no_reg;
	String nama;
	String alamat;	
	Scanner scan = new Scanner (System.in);
	Bayar bayar = new Bayar();
	Jurusan jurusan = new Jurusan();
	Akademik akademik = new Akademik();
	void Daftar(){
		 
	// Akademik akademik = new Akademik();
	
	System.out.println("================================");
    System.out.println("======= Form Pendaftaran =======");
	System.out.println("");

	System.out.print("Masukan No_Registrasi :");
	no_reg = scan.nextLine();
	System.out.print("Masukan Nama Lengkap  :");
	nama = scan.nextLine();
	System.out.print("Masukan Alamat        :");
	alamat = scan.nextLine();
	
	System.out.println("================================");
	System.out.println("================================");

	bayar.pembayaran();
	jurusan.pilihjurusan();
	akademik.informasi();
	
	
	}
}
