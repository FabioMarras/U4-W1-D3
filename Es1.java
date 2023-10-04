import Rettangolo.Rettangolo;

public class Es1 {
    public static void main(String[] args){
        Rettangolo primo = new Rettangolo(10, 5);
        primo.StampaRettangolo();
        Rettangolo secondo = new Rettangolo(9,5);
        secondo.StampaRettangolo();
        int AreaSum = primo.Area() + secondo.Area();
        int PerimetroSum = primo.Perimetro() + secondo.Perimetro();
        System.out.println("Area sommata: " + AreaSum + " Perimetro sommato: " + PerimetroSum);
    }
}
