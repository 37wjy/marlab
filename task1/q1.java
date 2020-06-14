import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//WriteaJavaProgramtoreverseastringwithoutusingStringinbuiltfunctionreverse.

/**
 * q1
 */
public class q1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input a string : ");
        String s=br.readLine();
        String re="";
        for (int i = s.length()-1; i >= 0; i--) {
            re=re+s.charAt(i);
        }
        System.out.println("string reversed : "+re);
    }

}