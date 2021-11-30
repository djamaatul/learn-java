/*author djamaatul*/

import java.util.Arrays;

public class App{
    public static void main(String[] args) {
        
        int[] arr1 = {0,1,0,1};
        int[] arr2 = {0,0,1,1};
        int[] arr3 = new int[arr1.length];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        //invert ARRAY1
        System.out.print("\ninvert array1\t\t :");
        arr3 = invert(arr1);
        System.out.println(Arrays.toString(arr3));

        //invert ARRAY2
        System.out.print("\ninvert array2\t\t :");
        arr3 = invert(arr2);
        System.out.println(Arrays.toString(arr3));

        //AND
        System.out.print("\narray1 AND array2\t :");

        for(int i = arr1.length-1; i >= 0;i--){
            arr3[i] = (arr1[i]*arr2[i]);
        }

        System.out.println(Arrays.toString(arr3));

        //NAND
        System.out.print("\narray1 NAND array1\t :");

        System.out.println(Arrays.toString(invert(arr3)));

        //OR
        System.out.print("\narray1 OR array1\t :");
        for(int i = arr1.length-1; i >= 0;i--){
            arr3[i] = (arr1[i]+arr2[i]);
            if(arr3[i] == 2){
                arr3[i] = 1;


            }
        }
        System.out.println(Arrays.toString(arr3));

        //NOR
        System.out.print("\narray1 NOR array1\t :");
        System.out.println(Arrays.toString(invert(arr3)));

        //XOR
        System.out.print("\narray1 XOR array1\t :");
        for(int i = arr1.length-1; i >= 0;i--){
            if(arr1[i] == arr2[i]){
                arr3[i] = 0;
            }else{
                arr3[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr3));

        //XNOR ARRAY2
        System.out.print("\narray1 XNOR array1\t :");
        System.out.println(Arrays.toString(invert(arr3)));
    }

    public static int[] invert(int[] arr){
        int[] arr1 = new int[arr.length];

        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] == 0 ){
                arr1[i] = 1;
            }else{
                arr1[i] = 0;
            }
        }
        return arr1;
    }
}

