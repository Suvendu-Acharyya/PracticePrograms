import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        String st, stArray[], stArrayNew[];
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();
        stArray = st.split("\\s+");
        stArrayNew = new String[stArray.length];

        for (int i = stArray.length - 1, j = 0; i >= 0; i--, j++) {
            if (i != 0)
                stArrayNew[j] = stArray[i].concat(" ");
            else
                stArrayNew[j] = stArray[i];

        }
        for (int i = 0; i < stArrayNew.length; i++)
            System.out.print(stArrayNew[i]);
        // System.out.println("New String: " + st);
        sc.close();

    }

}
