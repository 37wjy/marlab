import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4.)WriteaJavaProgramtofindwhetherastringornumberispalindromeornot.

/**
 * q4
 */
public class q4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input a string : ");
        String s=br.readLine();
        System.out.println(fp(s) ? "true" : "false");
    }

    static boolean fp(String s) {
        for (int i = 0; i < s.length()/2-1; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}