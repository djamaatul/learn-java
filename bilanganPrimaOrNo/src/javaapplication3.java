/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author djamaatul
 */
public class javaapplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException ,Exception {
        // TODO code application logic here
        
        //ambil input angka
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka :");
        int angka = input.nextInt();
        boolean prima = false ;
        
        //cek jika angka < 0 adalah bukan prima;
        if(angka <= 1){
            System.err.println("Bilangan Prima harus lebih dari nol");
                prima = false;
        }else{
        //cek faktor dari angka
            for(int i = 2 ;i <= angka ;i++){
                if(angka ==2 || angka == 3 || angka ==5){
                    prima = true;
                break;
                }else{
                    if(angka%2 == 0 || angka%3 ==0 || angka%5 ==0){
                        prima = false;
                    }else{
                        prima = true;
                    }                    
                } 
            }
        if(prima){
           System.out.println(angka + " adalah prima");
        }else{
              System.err.println(angka + " bukan prima");
        }
        
        }
    
    }
}