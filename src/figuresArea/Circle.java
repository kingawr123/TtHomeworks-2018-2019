package figuresArea;

import java.util.Scanner;

public class Circle implements Figure {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double area() {
        System.out.println("Podaj promień:");
        double r = scanner.nextDouble();

        return countArea(r);
    }

    private double countArea(double r){
        return Math.pow(r,2)*Math.PI;
    }
}
