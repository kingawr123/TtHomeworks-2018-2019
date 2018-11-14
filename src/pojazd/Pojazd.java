package pojazd;

public class Pojazd {
    private int obecnaPredkosc = 0;
    private int maxPredkosc;
    private int maxIloscPasazerow;
    private int obecnaIloscPasazerow = 0;
    private String imieINazwiskoWlasciciela;

    {
        obecnaPredkosc = 0;
        obecnaIloscPasazerow = 0;
    }

    Pojazd(String imieINazwiskoWlasciciela, int maxIloscPasazerow, int maxPredkosc){
        this.imieINazwiskoWlasciciela = imieINazwiskoWlasciciela;
        this.maxIloscPasazerow = maxIloscPasazerow;
        this.maxPredkosc = maxPredkosc;
        wyswietlMaxPredkosc();
        wyswietlMaxIloscPasazerow();
    }

    public void przyspiesz(int p){
        if (p<=maxPredkosc-obecnaPredkosc){
            obecnaPredkosc = obecnaPredkosc + p;
            System.out.println("Przyśpieszyłeś o "+p+" km/h");
            wyswietlPredkosc();
        }
        else{
            obecnaPredkosc = maxPredkosc;
            System.out.println("Nie możesz przekraczać prędkości!");
            wyswietlPredkosc();
        }
    }

    public void zwolnij(int z){
        if (z>obecnaPredkosc){
            obecnaPredkosc = 0;
            System.out.println("Zatrzymałeś się");
        }
        else{
            obecnaPredkosc -= z;
            System.out.println("Zwolniłeś o "+z+ " km/h");
            wyswietlPredkosc();
        }
    }

    public void wsiadzDoPojazdu(){
        if (obecnaIloscPasazerow < maxIloscPasazerow){
            obecnaIloscPasazerow++;
            wyswietlLiczbePasazerow();
        }
        else System.out.println("Nie można wsiąść do pojazdu. Za dużo pasażerów!");
    }

    public void wysiadzZPojazdu(){
        if (obecnaIloscPasazerow>0){
            obecnaIloscPasazerow--;
            wyswietlLiczbePasazerow();
        }
        else System.out.println("Nikogo nie ma w pojeździe!");
    }

    public void zmienWlasciciela(String imieINazwiskoWlasciciela){
        this.imieINazwiskoWlasciciela = imieINazwiskoWlasciciela;
        wyswietlImieINazwiskoWlasciciela();
    }

    private void wyswietlPredkosc(){
        System.out.println("Prędkość: "+obecnaPredkosc+" km/h");
    }
    private void wyswietlLiczbePasazerow(){
        System.out.println("liczba Pasażerów: "+obecnaIloscPasazerow);
    }
    private void wyswietlImieINazwiskoWlasciciela(){
        System.out.println("Właściciel: "+imieINazwiskoWlasciciela);
    }
    private void wyswietlMaxPredkosc(){ System.out.println("Maksymalna prędkość pojazdu: " + maxPredkosc +"km/h"); }
    private void wyswietlMaxIloscPasazerow(){System.out.println("Maksymalna ilość pasażerów: "+ maxIloscPasazerow);}

    @Override
    public String toString() {
        return "Pojazd:{" +
                "obecnaPredkosc=" + obecnaPredkosc + " km/h"+
                ", obecnaIloscPasazerow=" + obecnaIloscPasazerow +
                ", imieINazwiskoWlasciciela='" + imieINazwiskoWlasciciela + '\'' +
                '}';
    }
}
