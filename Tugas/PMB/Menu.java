import java.util.Scanner;
public class Menu {

 public static void main(String args[]){
     Scanner input = new Scanner (System.in);
     int pilihan ;
    
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
        Maba maba = new Maba();
        maba.Daftar();
        break ;
    
    case 2 :
        Perwalian perwalian = new Perwalian();
        perwalian.Wali();
        break ;

    case 3 :
        System.exit(0);
        break ;

  
        
                    }  

         }
}