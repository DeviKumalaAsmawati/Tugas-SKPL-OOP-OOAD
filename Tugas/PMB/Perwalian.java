import java.util.Scanner;
class Perwalian{
    
    Scanner scan = new Scanner (System.in);
        String nim;
	    String nama;
	    String jurusan;
		int semester;

    void Wali(){

    System.out.println("================================");
    System.out.println("======== Form Perwalian ========");
	System.out.println("");

	System.out.print("Masukan NIM     :");
	nim = scan.nextLine();
	System.out.print("Masukan Nama    :");
	nama = scan.nextLine();
	System.out.print("Masukan jurusan :");
    nama = scan.nextLine();
	System.out.println("");

			System.out.println ("Form Perwalian ");
			System.out.println ();
			System.out.print ("Masukan Kode Semester 1-2-3-4-5-6-7-8 : ");
			semester = scan.nextInt();
			System.out.println();
			System.out.println("|============= Form KRS=============|");
			System.out.println("|---------------------");
			System.out.print("| NIM       =                         |");
			System.out.println(nim);
			System.out.print("| Nama      =                         |");
			System.out.println(nama);
			System.out.print("| Semester  =                         |");
			System.out.println(semester);
			System.out.println();
			System.out.println();	
			System.out.println(" ( Mahasiswa )       ( Dosen Wali ) |");
			System.out.println("|-----------------------------------|");
			System.out.println("|===================================|");
			System.out.println();


        
    }
}