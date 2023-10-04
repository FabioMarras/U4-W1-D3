package Rettangolo;

public class Rettangolo {
    public int altezza;
    public int larghezza;
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public void StampaRettangolo(){
        System.out.println("area: " + (this.altezza * this.larghezza)/2);
        System.out.println("perimetro: " + (this.altezza + this.larghezza)*2);
    };
    public int Area() {
        return (this.altezza * this.larghezza)/2;
    }
    public int Perimetro() {
        return (this.altezza + this.larghezza)*2;
    }
    public int[] StampaDueRettangoli(){
        int Area = Area() ;
        int Perimetro = Perimetro();
        int[] Somma = {Area, Perimetro};
        return Somma;
    };

}
