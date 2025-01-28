import java.util.Arrays;
import java.util.Scanner;;
public class input {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int []arr= new int[5];
    //    arr[0]=22;
    //    arr[2]=13;
    //    arr[3]=87;
    //    arr[4]=9;
    

       //[22,13,87,9,34]
    //    System.out.println(arr[0]);

       for (int i = 0; i < arr.length; i++) {
         arr[i]=sc.nextInt();
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }

       System.out.println("Print using inhance forLoop");
      for(int num: arr){
        System.out.print(num+" ");//here num represent element of the array
    
      }
        
        //This is simplest meathod
    System.out.println("This is simplest meathod");
    System.out.print(Arrays.toString(arr)+"");
  



//string :
          String[] str=new String[3];
          for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
          }
          System.out.println(Arrays.toString(str));

    }
}
