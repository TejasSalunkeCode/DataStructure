
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
      //  int [][]arr2=new int[3][]; 

         int [][]arr={
            {1,2,3},//0th index
            {4,5},//1st index
            {6,7,8,9}//2nd index
        };
  
      // System.out.println(arr[1][0]);//4
        int [][]arr3=new int[2][4];
         System.out.println(arr3.length);

      for (int i = 0; i < arr3.length; i++) {
    for(int j=0;j<arr3[i].length;j++){
        arr3[i][j]=sc.nextInt();
    }
      }

      
      // for (int i = 0; i < arr3.length; i++) {
      //   for(int j=0;j<arr3[i].length;j++){
      //      System.err.print(arr3[i][j]+" ");
        
      //   }
      //   System.out.println();
      //     }


      // for (int i = 0; i < arr3.length; i++) {
      //   System.out.println(Arrays.toString(arr[i]));
      // }
        

      for(int []a: arr3){
        System.out.println(Arrays.toString(a));
      }
    } 
}
