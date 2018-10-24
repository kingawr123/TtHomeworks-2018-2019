package calculator;

import java.util.Scanner;
import static calculator.Main.*;

public class TrigonometryCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public double trigonometryResult(double number, String operator) {

        switch (operator) {
            case "s":
                return Math.sin(number);
            case "c":
                return Math.cos(number);
            default:
                System.out.println("Error");
                return 0;
        }
    }
    public void takeNumberAndOperator(){
        angle = getAngle();
        trigonometryOperator = getTrigonometryOperator();
    }

    private static double getAngle() {
        System.out.println("Podaj kąt:");
        return scanner.nextDouble();
    }

    private static String getTrigonometryOperator() {
        System.out.println("'s' = sinus; 'c' = cosinus");
        System.out.println("Wybierz działanie:");
        return scanner.next();
    }
}
