import java.util.*;

public class PalindromeCheck {
    String str = null;
    String result = null;

    PalindromeCheck(String s) {
        this.str = s;
        result = null;
    }

    public String palindromeCheck() {
        int l = str.length();
        int i, j;
        for (i = 0, j = (l - 1); i < l; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                result = "Not a palindrome text";
            }
        }
        if (result == null)
            result = "Its a Palindrome text";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println("Enter a String to check palindrome :");
            s = sc.nextLine();
            s = s.toUpperCase();
            PalindromeCheck pcheck = new PalindromeCheck(s);
            System.out.println(pcheck.palindromeCheck());
        } while (!s.isEmpty());
        sc.close();
    }
}
