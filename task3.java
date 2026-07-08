import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== Currency Converter ==========");

        System.out.print("Enter Base Currency (USD, INR, EUR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter Target Currency (USD, INR, EUR): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double rate = 0;

        if(base.equals(target)) {
            rate = 1;
        }
        else if(base.equals("USD") && target.equals("INR")) {
            rate = 86.25;
        }
        else if(base.equals("INR") && target.equals("USD")) {
            rate = 1.0 / 86.25;
        }
        else if(base.equals("USD") && target.equals("EUR")) {
            rate = 0.85;
        }
        else if(base.equals("EUR") && target.equals("USD")) {
            rate = 1.18;
        }
        else if(base.equals("INR") && target.equals("EUR")) {
            rate = 0.0098;
        }
        else if(base.equals("EUR") && target.equals("INR")) {
            rate = 101.50;
        }
        else {
            System.out.println("Currency pair not supported.");
            return;
        }

        double convertedAmount = amount * rate;

        System.out.println("\n========== Result ==========");
        System.out.printf("%.2f %s = %.2f %s%n",
                amount, base, convertedAmount, target);

        sc.close();
    }
}
