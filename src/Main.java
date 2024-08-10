
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    final int MIN = 1000;
    final int MAX = 1_000_000;

    System.out.println("Welcome Mortgage-Calculator");
    Scanner scanner = new Scanner(System.in);

    int principal = 0;
    float monthlyInterest = 0;
    int numberOfPayments = 0;
    do {
      System.out.print("Principal ($1K - $1M): ");
      principal = scanner.nextInt();
      if (principal >= MIN && principal <= MAX)
        break;
      System.out.println("Enter a number between 1,000 and 1,000,000");
    } while (true);

    do {
      System.out.print("Annual Interest Rate: ");
      float annualInterest = scanner.nextFloat();
      if (annualInterest >= 1 && annualInterest <= 30) {
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Enter a value between 1 and 30");
    } while (true);

    do {
      System.out.print("Period (Years): ");
      byte years = scanner.nextByte();
      if (years >= 1 && years <= 30) {
        numberOfPayments = years * MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Enter a value between 1 and 30");
    } while (true);

    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

    System.out.print("Mortgage: " + mortgageFormatted);
  }
}
