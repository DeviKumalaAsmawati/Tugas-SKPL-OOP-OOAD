import java.util.Scanner;
public class Main {

 public static void main(String args[]){
     Perwalian perwalian = new Perwalian();
     Maba maba = new Maba();
     
     Scanner input = new Scanner (System.in);
     int pilihan ;
    boolean loop = true;
    while(loop){
        System.out.println("========================");
        System.out.println("=======Menu Utama=======");
        System.out.println("====  1. Pmb        ====");
        System.out.println("====  2. Perwalian  ====");
        System.out.println("====  3. Keluar     ====");
        System.out.println("========================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();

        switch ( pilihan ){
            
            case 1 :
                maba.Daftar();
                break ;
            case 2 :
                perwalian.Wali();
                break ;
            case 3 :
                System.exit(0);
                break ;
        }
    }
   
}
}