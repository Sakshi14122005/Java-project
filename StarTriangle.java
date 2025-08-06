package Loop;

public class StarTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int a = 1; a <= rows; a++) {
            for (int b = rows; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
