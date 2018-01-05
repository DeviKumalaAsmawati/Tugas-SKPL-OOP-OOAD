import java.util.Scanner;
class Jurusan{
    
    Scanner scan = new Scanner (System.in);
    int jurus;
    String jawab;
    void pilihjurusan(){
    

 System.out.println("=======   Pilih Jurusan    =======");
 System.out.println("====  1. Teknik Informatika   ====");
 System.out.println("====  2. Teknik Industri      ====");
 System.out.println("====  3. Ilmu Komunikasi      ====");
 System.out.println("==================================");
 System.out.print("Masukkan Pilihan Anda : ");
 jurus = scan.nextInt();

 switch ( jurus ){

case 1 :
        System.out.println("=======       Soal Test      =======");
        System.out.println(" yang termasuk alat input =         ");
        System.out.println("a. scaner   b.monitor   c.keyboard  ");
        System.out.print(" jawaban anda = ");
        jawab = scan.nextLine();
        System.out.println("");
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }

    break;

case 2 :
        System.out.println("======= Soal Test =======");
        System.out.println(" 25 X  25 =               ");
        System.out.println("a. 725    b. 625   c.825  ");
        System.out.print(" jawaban anda = ");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }

    break;
case 3 :
        System.out.println("======= Soal Test  =======");
        System.out.println(" warna primer adalah =    ");
        System.out.println("a.biru   b.putih  c.ungu  ");
        System.out.print(" jawaban anda = ");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }        
    break;    
        }



    }
}