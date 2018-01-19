import java.util.Scanner;
class Jurusan{
    
    Scanner scan = new Scanner (System.in);
    int jurus,nilai;
    String jawab,jawab1,jawab2;
    Akademik akad = new Akademik();
    void pilihjurusan(){
    

 System.out.println("=======   Pilih Jurusan    =======");
 System.out.println("====  1. Teknik Informatika   ====");
 System.out.println("====  2. Teknik Industri      ====");
 System.out.println("====  3. Ilmu Komunikasi      ====");
 System.out.println("==================================");
 System.out.print("Masukkan Pilihan Anda : ");
 jurus = scan.nextInt();
 nilai=0;
 switch ( jurus ){

case 1 :
        System.out.println("=======       Soal Test      =======");
        System.out.println("1. yang termasuk alat input =         ");
        System.out.println("a. printer   b.monitor   c.keyboard  ");
        System.out.print("Jawaban no 1 : ");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }
        if( jawab.equalsIgnoreCase("c")){
            nilai = nilai + 35;
        }

        System.out.println("2. yang termasuk alat output =         ");
        System.out.println("a. monitor   b.mouse   c.cpu  ");
        System.out.print("Jawaban no 2 : ");
        jawab1 = scan.nextLine();
        if(jawab1.isEmpty()){
            jawab1 = scan.nextLine();
        }
        if (jawab1.equalsIgnoreCase("a")){
            nilai = nilai + 35;
        }
        System.out.println("3. yang bukan tipe jaringan =         ");
        System.out.println("a. lan   b.man   c.utp  ");
        System.out.print(" jawaban no 3  : ");
        jawab2 = scan.nextLine();
        System.out.println("");
        if(jawab2.isEmpty()){
            jawab2 = scan.nextLine();
        }
        if( jawab2.equalsIgnoreCase("c")){
            nilai = nilai + 30;
        } 

        // if ( nilai >=70 && nilai <=100){
        //     System.out.println(" Selamat anda lulus dengan nilai" + nilai);
        // }
        // else{
        //     System.out.println("Maaf anda Tidak Lulus karna Nilai anda " +nilai);
        // System.out.println("=======================================");        
        // }
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("======= test selesai =======");
        System.out.println("============================");
        akad.informasi();
    break;

case 2 :
        System.out.println("======== Soal Test ========");
        System.out.println("1. 25 X  25 =              ");
        System.out.println("a. 725    b. 625   c.825   ");
        System.out.print("Jawaban no 1 : ");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        } 
        if( jawab.equalsIgnoreCase("b")){
            nilai = nilai + 30;
        }
        System.out.println("2. 233 + 54 X 20 =         ");
        System.out.println("a.1313    b.1231   c.1314  ");
        System.out.print("Jawaban no 2 : ");
        jawab1 = scan.nextLine();
        if(jawab1.isEmpty()){
            jawab1 = scan.nextLine();
        }
        if(jawab1.equalsIgnoreCase("a")){
            nilai = nilai + 35;
        }
        System.out.println("3. 10005 + 205 - 789  =    ");
        System.out.println("a.9321   b.9421   c.8421   ");
        System.out.print(" jawaban no  3 :          ");
        jawab2 = scan.nextLine();
        if(jawab2.isEmpty()){
            jawab2 = scan.nextLine();
        }
        if (jawab2.equalsIgnoreCase("b")){
            nilai = nilai + 45;
        }
       // if ( nilai >=70 && nilai <=100){
        //     System.out.println(" Selamat anda lulus dengan nilai" + nilai);
        // }
        // else{
        //     System.out.println("Maaf anda Tidak Lulus karna Nilai anda " +nilai);
        // System.out.println("=======================================");        
        // }
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("======= test selesai =======");
        System.out.println("============================");
        akad.informasi();
    break;

case 3 :
        System.out.println("========= Soal Test  =========");
        System.out.println("1. warna primer adalah =      ");
        System.out.println("a.biru   b.putih  c.ungu      ");
        System.out.print("Jawaban no 1 : ");
        jawab = scan.nextLine();
        if(jawab.isEmpty()){
            jawab = scan.nextLine();
        }
        if ( jawab.equalsIgnoreCase("b")){
            nilai = nilai + 35;
        }
       
        System.out.println("2. biru + merah   =           ");
        System.out.println("a.hijau   b.pink   c.magenta  ");
        System.out.print("Jawaban no 2 : ");
        jawab1 = scan.nextLine();
        if(jawab1.isEmpty()){
            jawab1 = scan.nextLine();
        }
        if ( jawab1.equalsIgnoreCase("c")){
            nilai = nilai + 35;
        }
        System.out.println("3. kuning + biru      =       ");
        System.out.println("a.orange    b.hijau   c.merah ");
        System.out.print(" jawaban no 3 :                 ");
        jawab2 = scan.nextLine();
        if(jawab1.isEmpty()){
            jawab1 = scan.nextLine();
        }
        if ( jawab2.equalsIgnoreCase("b")){
            nilai = nilai + 30;
        }
        // if ( nilai >=70 && nilai <=100){
        //     System.out.println(" Selamat anda lulus dengan nilai" + nilai);
        // }
        // else{
        //     System.out.println("Maaf anda Tidak Lulus karna Nilai anda " +nilai);
        // System.out.println("=======================================");        
        // }
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("======= test selesai =======");
        System.out.println("============================");
        akad.informasi();
        break;    
        
}
}
 }   