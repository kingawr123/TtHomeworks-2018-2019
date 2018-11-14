package pojazd;

public class Main {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd("Kinga Kruk", 2,100);
        przerywnik();
        System.out.println(pojazd.toString());
        pojazd.przyspiesz(60);
        pojazd.wsiadzDoPojazdu();
        przerywnik();
        Pojazd pojazd2 = new Pojazd("Ola Kołderka", 6,150);
        przerywnik();
        System.out.println(pojazd2.toString());
        pojazd2.wsiadzDoPojazdu();
        pojazd2.wysiadzZPojazdu();
        pojazd2.wysiadzZPojazdu();
        pojazd2.przyspiesz(160);
        pojazd2.zwolnij(30);
        pojazd2.zmienWlasciciela("Michał Olechnik");


    }
    private static void przerywnik(){
        System.out.println("____________________________________________________________________________");
        System.out.println("");
    }
}
