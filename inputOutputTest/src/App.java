
import java.util.*;
import java.io.*;


public class App {
  public static void main(String[] args)  throws IOException,Exception  {
      
      int pilih;
      boolean onMenu = true;
      Scanner sc = new Scanner(System.in);
      while(onMenu){
            System.out.println("1. Login ");
            System.out.println("2. Register ");
            
            
            System.out.print("Masukan Opsi\t : ");
            pilih = sc.nextInt();
      
            if(pilih == 1){
                
                String username,password ;
                
                Scanner sc2 = new Scanner(System.in);
                System.out.print("==================Login===================\n");
                System.out.print("Masukan Username : ");
                username = sc2.nextLine();
                
                System.out.print("Masukan password : ");
                password = sc2.nextLine();
                System.out.print("==========================================\n");
                
                login(username,password);
                
                onMenu = yesOrNo("mau ulang lagi");
                
            } else if(pilih == 2) {

                onMenu = yesOrNo("mau ulang lagi");
            } else{
                System.out.println("tidak pilihan");

            }
      }

    }   
    public static void login(String username,String password)throws IOException{
        
        try{
            FileInputStream user = new FileInputStream("user.txt");
            BufferedInputStream data = new BufferedInputStream(user);
        }catch(IOException e){
            System.err.println("Error 0 ; database tidak ditemukan");
        }
        
        loading();
        System.out.println("masuk");
    }            
    
    public static boolean yesOrNo(String answer){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print(answer + " ? (y/n) :");
        
        String b = sc.nextLine();
        
        
       if(b.equalsIgnoreCase("y")) {
           return true;
       }else{
           return false;
       }
    }
    public static void loading(){
      System.out.println("LOADING ..");
        for(int a = 0 ; a <= 5 ; a++){
        for(int i = 0 ; i <= 20 ; i++){
            System.out.print(".");
            try{
            Thread.sleep(20);
            }catch(Exception e){

            }
        }
        System.out.println("SUKSES ");
        
      }
    }
}