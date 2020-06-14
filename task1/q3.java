import java.util.HashMap;
import java.util.Iterator;

//3.)Write a Java Program to iterate HashMap using While and advance for loop.

public class q3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Iterator it=map.entrySet().iterator();
        while (it.hasNext()) {
            int key=(int) it.next();
            System.out.println(key+" "+map.get(key));
        }
        for (int key : map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
    }
}