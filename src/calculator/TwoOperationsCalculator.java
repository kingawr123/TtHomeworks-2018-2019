package calculator;

import java.util.Scanner;

public class TwoOperationsCalculator {

    public static Scanner scanner = new Scanner(System.in);

    public static double calculatResult(double firstNumber, double secondNumber, String operator) throws IllegalArgumentException {

        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "%":
                return firstNumber % secondNumber;
            case "^":
                return Math.pow(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("Operator '" + operator + "' jest zły");
        }
    }

    public static double getNumber() {

        System.out.println("Podaj liczbę:");
        return scanner.nextDouble();
    }

    public static String getOperator() {

        System.out.println("'+' = dodawanie; '-' = odejmowanie; '*' = mnożenie; '/' = dzielenie; '%' = reszta z dzielenia; '^' = potęgowanie");
        System.out.println("Wybierz działanie:");
        return scanner.next();
    }
}
