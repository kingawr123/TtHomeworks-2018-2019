package figuresArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figure;
        double result = 0;
        
        while (true) {
            System.out.println("Jaką liczysz figurę? P = prostokąt K = kwadrat O = koło W = wynik i wyjście");
            String charcter = scanner.next();
            if (charcter.equals("W")){
                System.out.println("Wynik = " + result);
                break;
            }
            if (charcter.equals("P")) {
                figure = new Rectangle();
                result = figure.area();
                System.out.println("Wynik = " + result);
            }
            if (charcter.equals("K")) {
                figure = new Square();
                result = figure.area();
                System.out.println("Wynik = " + result);
            }
            if (charcter.equals("O")){
                figure = new Circle();
                result = figure.area();
                System.out.println("Wynik = " + result);
            }
        }
    }
}
