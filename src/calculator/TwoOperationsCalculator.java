package calculator;

import java.util.Scanner;
import static calculator.Main.*;

public class TwoOperationsCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public double calculatResult(double firstNumber, double secondNumber, String operator) throws IllegalArgumentException {
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

    public void takeNumbersAndOperators(){

        firstNumber = getNumber();

        firstOperator = getOperator();

        secondNumber = getNumber();

        secondOperator = getOperator();

        thirdNumber = getNumber();
    }

    private double getNumber() {

        System.out.println("Podaj liczbę:");
        return scanner.nextDouble();
    }

    private String getOperator() {

        System.out.println("'+' = dodawanie; '-' = odejmowanie; '*' = mnożenie; '/' = dzielenie; '%' = reszta z dzielenia; '^' = potęgowanie");
        System.out.println("Wybierz działanie:");
        return scanner.next();
    }
}
