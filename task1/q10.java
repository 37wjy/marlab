import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

//Write a Java Program to Find the Most Repeated Word in Text File

public class q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input a string : ");
        String s=br.readLine();
        HashMap<String,Integer> map=new HashMap<>();
        String[] str=s.split(" ");
        for (String string : str) {
            if (map.get(string) != null) {
                map.put(string, map.get(string)+1);
            }
            else{
                map.put(string, 1);
            }
        }
        List<HashMap.Entry<String, Integer>> list = new ArrayList<HashMap.Entry<String, Integer>>(map.entrySet());
        list.sort(new Comparator<HashMap.Entry<String, Integer>>() {
            @Override
            public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(list.get(0).getKey());
    }
}