# Mortgage Payment Calculator

This is a simple Java program that calculates the monthly mortgage payment based on the loan amount (principal), annual interest rate, and the loan term in years. The formula used to calculate the mortgage payment is derived from the standard mortgage payment equation.

## Formula

The formula used to calculate the monthly mortgage payment (M) is:

\[
M = \frac{P \times r \times (1 + r)^n}{(1 + r)^n - 1}
\]

Where:
- **M** = Monthly mortgage payment
- **P** = Principal loan amount (total amount borrowed)
- **r** = Monthly interest rate (annual interest rate divided by 12)
- **n** = Total number of payments (loan term in years multiplied by 12)

## Usage

### Prerequisites

- Java Development Kit (JDK) installed on your system
- A Java IDE or a text editor with the ability to run Java programs

### Running the Program

1. Clone this repository or download the `MortgageCalculator.java` file.

2. Open the file in your Java IDE or text editor.

3. Modify the values of `principal`, `annualInterestRate`, and `years` in the code to match your loan details:
    ```java
    double principal = 500000000; // Example: Rp 500,000,000
    double annualInterestRate = 6; // Example: 6%
    int years = 20; // Example: 20 years
    ```

4. Run the program. The monthly mortgage payment will be printed to the console.

### Example

Here is an example of how the program can be used:

```java
public class MortgageCalculator {

    public static void main(String[] args) {
        // Principal loan amount (P)
        double principal = 500000000; // Rp 500,000,000
        
        // Annual interest rate (6%)
        double annualInterestRate = 6; // 6%
        
        // Loan term in years
        int years = 20;
        
        // Calculate monthly interest rate (r)
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        
        // Calculate total number of payments (n)
        int totalPayments = years * 12;
        
        // Calculate monthly mortgage payment (M) using the formula
        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);
        
        // Display the monthly mortgage payment
        System.out.printf("Monthly mortgage payment: Rp %.2f\n", monthlyPayment);
    }
}
