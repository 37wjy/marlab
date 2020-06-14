import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// 5.)WriteaJavaProgramtoiterateArrayListusingfor-loop,while-loop,andadvancefor-loop.

public class q5 {
    static ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5));

    public static void main(String[] args) {
        for (int i = 0; i < arr.size() ; i++) {
            System.out.print(arr.get(i));
        }
        Iterator it=arr.iterator();
        while (it.hasNext()) {
            System.out.print((Integer)it.next());
        }
        for (int a : arr) {
            System.out.print(a);
        }
    }
}