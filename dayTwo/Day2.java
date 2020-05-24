package dayTwo;

import java.util.Scanner;
import java.lang.Math;

public class Day2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = ((double)tip_percent/100)*meal_cost;
        double tax = ((double)tax_percent/100)*meal_cost;

        double cost_unrounded = meal_cost + tip + tax;

        System.out.println(Math.round(cost_unrounded));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
