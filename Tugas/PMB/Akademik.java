import java.util.Scanner;
class Akademik {
    
    Scanner scan = new Scanner (System.in);
    String nama,nim ;
    Final Double n_akhir , nilai ;

    void informasi(){

    System.out.println("================================");
    System.out.println("=======  Data Mahasiswa ========");
	System.out.println("");

	System.out.print("Masukan No_Reg      :");
	nim = input.nextLine();
	System.out.print("Masukan Nama        :");
	nama = input.nextLine();
	System.out.print("Masukan Nilai Test  :");
    nilai = input.nextint();
	    
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" dengan NIM "+no_reg+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
    System.out.println("=======================================");
	System.out.println("=======================================");

    }

}

}