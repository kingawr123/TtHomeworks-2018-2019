package calculator;

import java.util.Scanner;

public class TrigonometryCalculator {

    public static Scanner scanner = new Scanner(System.in);

    public static double trigonometryResult(double number, String operator) {

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
    public static double getAngle() {

        System.out.println("Podaj kąt:");
        return scanner.nextDouble();
    }

    public static String getTrigonometryOperator() {

        System.out.println("'s' = sinus; 'c' = cosinus");
        System.out.println("Wybierz działanie:");
        return scanner.next();
    }
}
