//by djamaatul 27 OKTOBER 2021//

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    boolean ulang = true;
    while(ulang){
    System.out.println("== Warung Nasi Pak JOJO ==");  ///// PrintMenu list
    System.out.println("=========================");
    System.out.println("1.Nasi Goreng   Rp.10.000");
    System.out.println("2.Baso          Rp.13.000");
    System.out.println("3.Batagor       Rp.6.000");
    System.out.println("4.Sate          Rp.20.000");
    System.out.println("=========================");

    int makanan,jumlah,uang;                    //Variable Nomor menu,jumlah dan uang
    Scanner typing = new Scanner(System.in);    
    System.out.print("Pilih No Makanan : ");
    makanan = typing.nextInt();                //Input User nomor makanan
    System.out.print("Jumlah Pesanan : ");
    jumlah = typing.nextInt();                 //Input User Jumlah
    System.out.print("Uang Anda      :");
    uang = typing.nextInt();                 //Input User Uang


    pesan(makanan,jumlah,uang); //Fungsi Pesan Makanan
    
    String bool = "";
    
    System.out.print("Mau Pesan Lagi ? yes atau no :");

    bool = typing.next();
    
    if(bool.equalsIgnoreCase("no")){
        ulang = false;
    }else if(bool.equalsIgnoreCase("yes")){
        ulang = true;
    }

    }
}
    
///////////////////////////// FUNCTION ////////////////////////////////////////////////
    private static void pesan(int nomor, int jumlah,int uang){
    float nasiGoreng = 10000f, /////////Variable Harga Makanan
     baso = 13000f, 
     batagor = 6000f,
     sate = 20000f,
     hasil = 0f,kembalian = 0f; //Variable Aritmatika Hasil

        switch (nomor) {                    /////Switch Case nomor makanan mana yang dipilih
            case 1:                             ///Example : Jika Pilih Nasi goreng * Jumlah pesanan
                hasil = nasiGoreng * jumlah;        
                break;
            case 2:
            hasil = baso * jumlah;
                break;
            case 3:
            hasil = batagor * jumlah;
                break;
            case 4:
            hasil = sate * jumlah;
                break;
            default:
            System.out.println("Tidak ada menu !1!");  //Ga ada menu nya Njir
                break;
        }

        kembalian = (float) uang - hasil;
        System.out.printf("Total Pembayaran : Rp.%.2f \n" , hasil);
        System.out.printf("Kembalian        : Rp.%.2f \n" , kembalian );
        System.out.print("Terimakasih Sudah Memesan :) \n" );
    }
}

