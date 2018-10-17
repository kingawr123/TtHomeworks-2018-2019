package figuresArea;

import java.util.Scanner;

public class Square implements Figure {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double area() {
        System.out.println("Podaj bok:");
        double a = scanner.nextDouble();

        return counteArea(a);
    }

    private double counteArea(double a){
        return a*a;
    }
}
