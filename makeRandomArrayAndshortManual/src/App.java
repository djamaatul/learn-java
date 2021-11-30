//by djamaatul 1 November 2021//

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
    /*------------------ MEMBUAT RANDOM ARRAY ---------------*/
    System.out.print("Jumlah Array Random :" ); 
    Scanner key = new Scanner(System.in); //Scanner Input
    int value = key.nextInt(); //INPUT JUMLAH ARRAY RANDOM
    
    Random acak = new Random(); //fungsi acak;
    int[] arr = new int[value];   //variable untuk meyimpan deret angka array

    System.out.print("\nArray Awal : " ); 

    for (int i = 0; i < arr.length; i++) {  //perulangan menyimpan angka random ke array arr dan string
        arr[i] = acak.nextInt(10);  //memasukan data random ke setiap blok array
        System.out.print(arr[i]);   //print array awal
    }

    /*------------------ MEMBUAT RANDOM ARRAY ---------------*/
    
    /*-------------- SHIFT ARRRAY JIKA N > N+1 -------------s-*/
    for (int j = 0; j < arr.length; j++) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] >= arr[(i+1)]){  
                int cache = arr[i+1]; //simpan n+1 ke cache
                arr[(i+1)] = arr[i]; //simpan n ke n+1
                arr[i] = cache;  //simpan cache ke n
                
            }
        }    
    }
/*-------------- SHIFT ARRRAY JIKA N > N+1 -------------s-*/


    System.out.print("\nArray Akhir : " ); 
    for (int i = 0; i < arr.length; i++) { //print array akhir
        System.out.print(arr[i]);

    }
    System.out.println();
    }
}