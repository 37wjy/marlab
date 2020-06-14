//WriteaJavaProgramtoremoveallwhitespacesfromastringwithoutusingreplace.

public class q8 {
    public static void main(String[] args) {
        String s="dadsad daf efafwe faw";
        String[] st=s.split(" ");
        for (String string : st) {
            System.out.print(string);
        }
    }
}