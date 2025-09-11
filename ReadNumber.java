package code;

import java.io.*;

public class ReadNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, sum = 0, n, i;
        float avg;

        System.out.print("How many numbers? ");
        n = Integer.parseInt(br.readLine());

        System.out.println("Enter the numbers:");
        for (i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            sum += num;
        }

        avg = (float) sum / n;  
        System.out.println("Sum = " + sum + ", Average = " + avg);
    }
}
