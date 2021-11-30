
import java.util.*;
import java.io.*;


public class Main {
  public static void main(String[] args)  throws IOException,Exception  {
      
      String pilih = "";
      boolean onMenu = true;
      Scanner sc = new Scanner(System.in);
      
      while(onMenu){
            System.out.println("1. Login ");
            System.out.println("2. Register ");
            System.out.println("3. Ubah password ");
            
            try{
            System.out.print("Masukan Opsi\t : ");
            pilih = sc.nextLine();
            }catch(InputMismatchException e){
                System.err.println("Error1:input salah ,ketik nomor !");
            }
            
            switch(pilih){
                
                case "1" :
                
                    String username,password ;

                    Scanner sc2 = new Scanner(System.in);
                    System.out.print("==================Login===================\n");
                    System.out.print("Masukan Username : ");
                    username = sc2.nextLine();

                    System.out.print("Masukan password : ");
                    password = sc2.nextLine();
                    System.out.print("==========================================\n");

                    login(username,password);

                    onMenu = yesOrNo("kembali lagi ke menu");
                break;
                
                case "2" :
                    
                    Scanner sc3 = new Scanner(System.in);
                    System.out.print("==================Login===================\n");
                    System.out.print("Masukan Username : ");
                    username = sc3.nextLine();

                    System.out.print("Masukan password : ");
                    password = sc3.nextLine();
                    System.out.print("==========================================\n");
                    register(username,password);
                    onMenu = yesOrNo("kembali lagi ke menu");
                break;
                
                case "3" :
//                    forgotPassword();
                    System.err.println("COMMING SOON !");
                break;
                default :
                    System.err.println("Error3:tidak pilihan");
                break;
            }
            
            
      }
      new ProcessBuilder("clear");
    }   
//    public static void forgotPassword() throws IOException{
//        String username,password;
//        
//        Scanner sc5 = new Scanner(System.in);
//        System.out.println("masukan username :");
//        username = sc5.nextLine();
//        System.out.println("Masukan password baru :");
//        password  = sc5.nextLine();
//        
//            FileReader user = new FileReader("user.txt");
//            BufferedReader data = new BufferedReader(user);
//            
//            Scanner sc6 = new Scanner(data);
//            
//            while(sc6.hasNext()){
//                String x = sc6.nextLine();
//                String[] arr = x.split(",");
//                if(arr[0] == username){
//                        FileWriter s = new FileWriter("user.txt",true);
//                        BufferedWriter reg = new BufferedWriter(s);
//                        
//                        
//                }
//                
//            }
//            
//            
//        
//        while()
//        
//        
//    }
    public static void register(String username,String password) throws IOException{
        FileWriter data = new FileWriter("user.txt",true);
        BufferedWriter reg = new BufferedWriter(data);
        
        String buff = username + "," + password;
        
        reg.newLine();
        reg.write(buff);
        reg.flush();
        
    }
    public static void login(String username,String password)throws IOException{
        
        try{
            FileReader user = new FileReader("user.txt");
            BufferedReader data = new BufferedReader(user);
            
            Scanner sc3 = new Scanner(data);
            boolean  islogged = false;
            while(sc3.hasNext()){
                String b = sc3.nextLine();
                String[] arr = b.split(",");     
                if(arr[0].equalsIgnoreCase(username) && arr[1].equalsIgnoreCase(password)){
                    System.out.println("Login Succes ..");
                    islogged = true;
                    break;
                }else{

                }
                
            }
            
                    if(islogged == false){
                        System.out.println("username atau password salah !");
                        boolean ulangi = yesOrNo("Ulangi");
                            if(ulangi){
                String x,y ;
                
                Scanner sc2 = new Scanner(System.in);
                System.out.print("==================Login===================\n");
                System.out.print("Masukan Username : ");
                x = sc2.nextLine();
                
                System.out.print("Masukan password : ");
                y = sc2.nextLine();
                System.out.print("==========================================\n");

                login(x,y);
                            }

                    }
            
        }catch(IOException e){
            System.err.println("Error0:database tidak ditemukan");
            FileWriter data = new FileWriter("user.txt",true);
            BufferedWriter reg = new BufferedWriter(data);
        }
        

    }            
    public static boolean yesOrNo(String answer){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n" +answer + " ? (y/n) :");
       
        boolean x;
        
        
       return x = sc.nextLine().equalsIgnoreCase("y");
    }
    public static void loading(String alert,boolean progress){
        System.out.print(alert);
        if(progress){
            for(int i = 0 ; i <= 20 ; i++){
                System.out.print("|");
                try{
                Thread.sleep(20);
                }catch(Exception e){

                }
            }
        }else{
             try{
                Thread.sleep(1000);
                }catch(Exception e){

                }
        }
    }
}