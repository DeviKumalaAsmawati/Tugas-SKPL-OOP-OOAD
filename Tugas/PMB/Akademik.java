import java.util.Scanner;
class Akademik {
    
    Scanner scan = new Scanner (System.in);
    String nama ;
    String no_reg ;
    String alamat ;
    int nilai ;
    void informasi(){

    System.out.println("================================");
    System.out.println("=======  Data Mahasiswa ========");
	System.out.println("");

	System.out.print("Masukan No_Reg      :");
	no_reg = scan.nextLine();
    if(no_reg.isEmpty()){
            no_reg = scan.nextLine();
        }
	System.out.print("Masukan Nama        :");
	nama = scan.nextLine();
    if(nama.isEmpty()){
            nama = scan.nextLine();
        }
    System.out.print("Masukan Alamat      :");
	alamat = scan.nextLine();
    if(alamat.isEmpty()){
            alamat = scan.nextLine();
        }
	System.out.print("Masukan Nilai Test  :");
    nilai = scan.nextInt();
    if ( nilai >=70 && nilai <=100 ){
            System.out.println(" NIM Anda Adalah : 10123" + no_reg);
            System.out.println("=================================="); 
        }
        else{
            System.out.println("           Maaf anda Tidak Lulus     ");
            System.out.println("    Anda tidak dapat masuk di kampus ini     ");
        System.out.println("=======================================");        
        }
    
  }

}