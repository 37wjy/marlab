import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//2.)Writea Java Program to count the number of words in a string using HashMap.
public class q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input a string : ");
        String s=br.readLine();
        HashMap<String,Integer> map=new HashMap<>();
        String[] strings=s.split("\\s+");
        for (String string : strings) {
            if (map.get(string)==null) 
                map.put(string, 1);
            else
                map.put(string, map.get(string)+1);
        }
        System.out.println(map);
    }
}