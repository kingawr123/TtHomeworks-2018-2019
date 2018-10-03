package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        switch (chooseCalculate()){
            case "z":

                TwoOperationsCalculator twoOperationsCalculator = new TwoOperationsCalculator();

                double firstNumber = twoOperationsCalculator.getNumber();

                String firstOperator = twoOperationsCalculator.getOperator();

                double secondNumber = twoOperationsCalculator.getNumber();

                String secondOperator = twoOperationsCalculator.getOperator();

                double thirdNumber = twoOperationsCalculator.getNumber();

                try {
                    double firstResult = twoOperationsCalculator.calculatResult(firstNumber, secondNumber, firstOperator);
                    double endResult = twoOperationsCalculator.calculatResult(firstResult, thirdNumber, secondOperator);

                    System.out.println(endResult);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case "t":

                TrigonometryCalculator trigonometryCalculator = new TrigonometryCalculator();

                double angle = trigonometryCalculator.getAngle();
                String trigonometryOperator = trigonometryCalculator.getTrigonometryOperator();

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