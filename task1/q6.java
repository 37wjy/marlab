import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//WriteaJavaProgramtofindtheduplicatecharactersinastring.

public class q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input a string : ");
        String s = br.readLine();
        String ns="";
        for (int i=0;i<s.length();i++) {
            ns=ns+s.charAt(i)+s.charAt(i);
        }
        System.out.println(ns);
    }
}