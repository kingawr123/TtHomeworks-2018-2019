package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        switch (chooseCalculat()){
            case "z":
                double firstNumber = getNumber();

                String firstOperator = getOperator();

                double secondNumber = getNumber();

                String secondOperator = getOperator();

                double thirdNumber = getNumber();

                try {
                    double firstResult = calculatResult(firstNumber, secondNumber, firstOperator);
                    double endResult = calculatResult(firstResult, thirdNumber, secondOperator);

                    System.out.println(endResult);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case "t":
                double angle = getAngle();
                String trigonometryOperator = getTrigonometryOperator();
                System.out.println(trigonometryResult(angle, trigonometryOperator));
                break;
                default:
                    System.out.println("Error");
                    break;
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
                return Math.pow(firstNumber, secondNumber) ;
            default:
                throw new IllegalArgumentException("Operator '"+ operator +"' jest zły");
        }
    }

    public static double trigonometryResult(double number, String operator){

        if ("s".equals(operator)) {
            return Math.sin(number);
        } else {
            if ("c".equals(operator)) {
                return Math.cos(number);
            } else {
                return 0;
            }
        }
    }

    private static double getNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        return scanner.nextDouble();
    }

    private static double getAngle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kąt:");
        return scanner.nextDouble();
    }

    private static String getTrigonometryOperator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("'s' = sinus; 'c' = cosinus");
        System.out.println("Wybierz działanie:");
        return scanner.next();
    }

    private static String getOperator (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("'+' = dodawanie; '-' = odejmowanie; '*' = mnożenie; '/' = dzielenie; '%' = reszta z dzielenia; '^' = potęgowanie");
        System.out.println("Wybierz działanie:");

         return scanner.next();
    }

    private static String chooseCalculat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chesz zrobić działanie trygonometryczne, czy zwykłe?");
        System.out.println("Trygonometryczne = 't', Zwykłe = 'z'");
        return  scanner.next();
    }
}