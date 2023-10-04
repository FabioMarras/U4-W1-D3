package Package;

public class Rettangolo {
    private int altezza;
    private int larghezza;
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

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
}
