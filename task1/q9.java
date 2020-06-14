//HowtofindMissingIntegersinGivenArrayofNumberswithDuplicatesinJAVA.

/**
 * q9
 */
public class q9 {

    public static void main(String[] args) {
        int[] a={1,4,2,5,6,4,3,2,5,1,6};
        int r=0;
        for (int i : a) {
            r^=i;
        }
        System.out.println(r);
    }    
}