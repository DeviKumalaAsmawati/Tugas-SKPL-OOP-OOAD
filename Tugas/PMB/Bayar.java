import java.util.Scanner;
class Bayar{
    String biaya;
    Jurusan jurusan = new Jurusan();

    void pembayaran(){
    Scanner scan = new Scanner (System.in);

	System.out.print("Masukan Biaya Pendaftaran :");
	biaya = scan.nextLine();
    
    System.out.println(" Transaksi telah Berhasil ");

    jurusan.pilihjurusan();

    }

}