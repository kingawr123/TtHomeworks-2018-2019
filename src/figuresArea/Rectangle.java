package figuresArea;

import java.util.Scanner;

public class Rectangle implements Figure{
    Scanner scanner = new Scanner(System.in);

    @Override
    public double area() {
        System.out.println("Podaj 2 boki:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        return  countArea(a, b);
    }

    private double countArea(double a, double b){
        return a*b;
    }
}
