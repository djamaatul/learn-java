//by djamaatul 27 OKTOBER 2021//

import java.util.* ;

public class App {
    public static void main(String[] args) throws Exception {

    orang dika = new orang("dika",100);
    orang diki = new orang("diki",100);

    Scanner baca  = new Scanner(System.in);
    Scanner baca2  = new Scanner(System.in);

    while(true){
    System.out.print("Pilih Pemain :");
    String ambil = baca.next();
    
    
    switch (ambil) {
        case "dika":
            System.out.println("Pilih Kegiatan :");
            System.out.println("1.makan");
            System.out.println("2.Olahraga");
            System.err.println("3.status");
            System.out.print("Pilih Nomor Kegiatan : ");
             int b = baca.nextInt();

            if(b == 1){
                dika.makan(50);
                
            }else if(b == 2){

                
                System.out.println("Olahraga :");
                String aa = baca2.nextLine();
                dika.olahraga(aa);
            
            }else if(b ==3){
                dika.status();
            }
                
                break;

        case "diki":
            System.out.println("Pilih Kegiatan :");
            System.out.println("1.makan");
            System.out.println("2.Olahraga");
            System.err.println("3.status");
            System.out.print("Pilih Nomor Kegiatan : ");
              b = baca.nextInt();

            
            if(b == 1){
                diki.makan(50);
                
            }else if(b == 2){

                
                System.out.println("Olahraga :");
                String aa = baca2.nextLine();
                dika.olahraga(aa);
            
            }else if(b ==3){
                
                diki.status();
            }
                
                break;
        default:
            break;
        }
    }
}
    
}