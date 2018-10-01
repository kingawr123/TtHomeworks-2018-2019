package calculator;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        double firstNumber = getNumber();

        String firstOperator = getOperator();

        double secondNumber = getNumber();

        String secondOperator = getOperator();

        double thirdNumber = getNumber();

        try {
            double firstResult = calculatResult(firstNumber, secondNumber, firstOperator);
            double endResult = calculatResult(firstResult, thirdNumber, secondOperator);

            System.out.println(endResult);
        }
        catch(IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

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
                return pow(firstNumber, secondNumber) ;
            default:
                throw new IllegalArgumentException("Operator '"+ operator +"' jest zły");
        }
    }

    private static double getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        return scanner.nextDouble();
    }

    private static String getOperator (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz działanie:");
        System.out.println("'+' = dodawanie; '-' = odejmowanie; '*' = mnożenie; '/' = dzielenie; '%' = reszta z dzielenia; '^' = potęgowanie");
         return scanner.next();
    }
}
