import java.util.Scanner;
class Bayar{
    String biaya;
    Jurusan jurusan = new Jurusan();
    Scanner scan = new Scanner (System.in);

    void pembayaran(){
    System.out.println("Biaya Pendaftaran = Rp.150000");
	System.out.print("Masukan Biaya Pendaftaran : ");
	biaya = scan.nextLine();
    if(biaya.isEmpty()){
            biaya = scan.nextLine();
        }
    if ( biaya.equalsIgnoreCase("150000") ){
        System.out.println("     Transaksi telah Berhasil     ");
        System.out.println("==================================");
        jurusan.pilihjurusan();
    } else {
        System.out.println("  Seusaikan Pembayaran yang telah ditentukan   ");
    	System.out.println("===============================================");
        pembayaran();
    }
    }

}