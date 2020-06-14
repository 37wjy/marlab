import java.util.Arrays;

//WriteaJavaProgramtofindthesecondhighestnumberinanarray.

public class q7 {
    public static void main(String[] args) {
        int[] a={1,4,1,5,6,8,5,43,6,56,54,3,2,5,56};Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}