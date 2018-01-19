import java.util.Scanner;
class Perwalian{
    
    Scanner scan = new Scanner (System.in);
        int nim;
	    String nama;
	    String jurusan;
		String biaya;
		int semester;

    void Wali(){

    System.out.println("================================");
    System.out.println("======== Form Perwalian ========");
	System.out.println("");

	System.out.print("Masukan NIM     :");
	nim = scan.nextInt();
	System.out.print("Masukan Nama    :");
	nama = scan.nextLine();
	System.out.print("Masukan jurusan :");
    jurusan = scan.nextLine();
	System.out.println("Biaya Perwalian Rp 450000");
	System.out.print("Masukan Biaya Perwalian :");
	biaya = scan.nextLine();
	if(biaya.isEmpty()){
            biaya = scan.nextLine();
        }
	if ( biaya.equalsIgnoreCase("450000")){
        System.out.println("     Transaksi telah Berhasil     ");
        System.out.println("==================================");
    } else {
        System.out.println("  Seusaikan Pembayaran yang telah ditentukan   ");
    	System.out.println("===============================================");
        Wali();
    }
	System.out.println("");

	System.out.println ("============Form Perwalian========== ");
	System.out.println ();
	System.out.println("Masukan Kode Semester teknik informatika 1-2-3 : ");
	System.out.println("Masukan Kode Semester teknik industri 4-5-6 : ");
	System.out.println("Masukan Kode Semester teknik ilmu komunikasi 7-8 : ");
	semester = scan.nextInt();

	switch ( semester ){
    
    case 1 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Pemograman 1                   2 SKS");
			System.out.println("Fisika 1                       2 SKS");
			System.out.println("Kalkulus 1                     2 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 2 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Pemograman 2                   3 SKS");
			System.out.println("Web 1                          3 SKS");
			System.out.println("Kalkulus 2                     2 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 3 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Delphi                         3 SKS");
			System.out.println("Web 2                          3 SKS");
			System.out.println("Sistem Oprasi                  2 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 4 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Pemograman(VB)                 3 SKS");
			System.out.println("Orkom & Arkom                  2 SKS");
			System.out.println("Statistika                     2 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 5 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Intelegensi Buatan             3 SKS");
			System.out.println("Interaksi Manusia dan Komputer 3 SKS");
			System.out.println("Teori Graph                    2 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 6 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Struktur Data                   2 SKS");
			System.out.println("Logika Boolean                  3 SKS");
			System.out.println("Teknik Kompilasi                3 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 7 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Jaringan Komputer              3 SKS");
			System.out.println("Pengantar TI                   2 SKS");
			System.out.println("Teori Otomata                  3 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	 case 8 :
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       = ");
			System.out.println(nim);
			System.out.print("| Nama      = ");
			System.out.println(nama);
			System.out.print("| Semester  = ");
			System.out.println(semester);
			System.out.println("============Mata kuliah=============");
			System.out.println("Pengantar Bisnis                3 SKS");
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();
			break ;
	


			}
    }
}