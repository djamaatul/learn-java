//by djamaatul 1 November 2021//

import java.util.* ;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.print("Array Awal : " ); 
        Scanner key = new Scanner(System.in); //Scanner Input
        String value = key.nextLine(); //INPUT your array random
        int[] angka = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {  //perulangan menyimpan angka random ke array arr dan string
            angka[i] = value.charAt(i) - '0';
        }

    urut(angka);    //Fungsi Urut Array

    }

//////////////////////////////FUNCTION///////////////////////////////////////////////////////////////////////
public static void urut(int[] arrai){                                                                      //
                                                                                                           //
    /*-------------- SHIFT ARRRAY JIKA N > N+1 -------------s-*/                                           // 
                                                                                                           //
    for (int j = 0; j < arrai.length; j++) { //perulangan cek awal lagi                                    //
        for (int i = 0; i < arrai.length-1; i++) { //perulangan cek n >= n+1 ,lalu tukar/shift ke kanan    //
            if(arrai[i] >= arrai[(i+1)]){                                                                  //
                int cache = arrai[i+1]; //simpan n+1 ke cache                                              //
                arrai[(i+1)] = arrai[i]; //simpan n ke n+1                                                 // 
                arrai[i] = cache;  //simpan cache ke n                                                     //
                                                                                                           //
            }                                                                                              //
        }                                                                                                  //
    }
/*-------------- SHIFT ARRRAY JIKA N > N+1 -------------s-*/


    System.out.print("Array Akhir : " ); 
    for (int i = 0; i < arrai.length; i++) { //print array akhir
        System.out.print(arrai[i]);

    }
    System.out.println();
}

//////////////////////////////FUNCTION//////////////////////////
}






