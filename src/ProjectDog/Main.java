package ProjectDog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Miki", "Black", 10);
        System.out.println(dog2.toString());
        System.out.println("Imię: "+dog2.getName());
        System.out.println("Kolor: "+dog2.getColor());
        System.out.println("Szybkość: "+dog2.getSpeed()+" m/s");

        System.out.println(dog2.hashCode());
    }
}
