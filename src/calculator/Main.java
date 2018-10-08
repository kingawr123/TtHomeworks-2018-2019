package calculator;

import java.util.Scanner;

public class Main {
    static double firstNumber = 0, secondNumber = 0, thirdNumber = 0;
    static String firstOperator = "";
    static String secondOperator = "";
    static int angle = 0;
    static String trigonometryOperator = "";

    public static void main(String[] args) {

        switch (chooseCalculate()){
            case "z":

                TwoOperationsCalculator twoOperationsCalculator = new TwoOperationsCalculator();

                twoOperationsCalculator.takeNumbersAndOperators();

                try {
                    double firstResult = twoOperationsCalculator.calculatResult(firstNumber, secondNumber, firstOperator);
                    System.out.println(twoOperationsCalculator.calculatResult(firstResult, thirdNumber, secondOperator));

                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case "t":

                TrigonometryCalculator trigonometryCalculator = new TrigonometryCalculator();

                trigonometryCalculator.takeNumberAndOperator(angle, trigonometryOperator);

                System.out.println(trigonometryCalculator.trigonometryResult(angle, trigonometryOperator));
                break;
                default:
                    System.out.println("Error");
                    break;
        }
    }

    private static String chooseCalculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chesz zrobić działanie trygonometryczne, czy zwykłe?");
        System.out.println("Trygonometryczne = 't', Zwykłe = 'z'");
        return  scanner.next();
    }
}