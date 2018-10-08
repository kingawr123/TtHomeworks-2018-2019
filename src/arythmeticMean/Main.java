package arythmeticMean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double addResult = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę cyfr:");
        int numbers = scanner.nextInt();

        int[] array = new int[numbers];

        System.out.println("Podaj wartości:");
        for(int i = 0; i < array.length; i++){
            addResult += array[i] = scanner.nextInt();
        }
        System.out.println(addResult / numbers);
    }
}
