import Package.Articolo;
import Package.ECommerce;
import  Package.Utente;
public class Es3 {
    public static void main(String[] args){
        Articolo primo = new Articolo();
        primo.setPrezzo(3);
        System.out.println(primo);
        Articolo secondo = new Articolo();
        secondo.setPrezzo(10);
        System.out.println(secondo);
        primo.total(primo.prezzo, secondo.prezzo);
        Utente primo1 = new Utente();
        System.out.println(primo1);
    }
}
