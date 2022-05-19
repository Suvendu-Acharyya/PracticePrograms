public class SumOfDigitsFromAlphaNumeric {
    public static void main(String[] args) {
        try {
            String s = "1234";

            boolean r = s.matches("[0-9]+");
            if (r == true) {
                int n = Integer.parseInt(s);
                int rm, sm = 0;
                while (n > 0) {
                    rm = n % 10;
                    n = n / 10;
                    sm = sm + rm;
                }
                System.out.println("Sum of digits  :" + sm);
            } else {
                System.out.println("Containing chars and digits\n Enter a number");
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }
}
