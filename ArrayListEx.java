import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    ArrayList<Integer> list  =new ArrayList<>(5);

    // list.add(67);
    // list.add(43);
    // list.add(12);
    // list.add(54);
    // list.add(98);
    // list.add(11);
    // list.add(45);
 

    // System.out.println(list.contains(43));
    // System.out.println(list);
    // list.set(0,78);//change value
    // list.remove(3);
    //  System.out.println(list);

    for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
    }
    for (int i = 0; i < 5; i++) {
        System.out.println(list.get(i));
    }
    System.out.println(list);
    }
}
