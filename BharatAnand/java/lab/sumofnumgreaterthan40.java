public class sumofnumgreaterthan40 {

    public static void main(String arg[]) {
        int sum = 0;

        for (int i = 41; i < 250; i++) {

            if (i % 5 == 0) {
                sum = sum + i;
            }

        }

        System.out.println("the sum of intergers from 40 to 250 that are divisible by 5 \n" + sum);
        System.out.println("\nBharat Anand");
        System.out.println("500083620");
    }
}
