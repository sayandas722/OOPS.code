import java.util.*;

public class ReveerseWordsInAString {
    public static String reverseWords(String s) {
        int len = s.length();

        String temp = "", res = "";
        for(int i = len - 1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch != ' '){
                temp = ch + temp;
            }
            else{
                res = res + " " + temp;
                temp = "";
            }
        }

        res = res + " " + temp;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reverse Order: " + reverseWords(s));
    }
}
