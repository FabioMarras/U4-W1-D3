package Package;

public class Articolo {
    private int codiceArticolo = 22;
    private String descrzioneArticolo = "bello";
    public int prezzo = 1;
    private int pezziDisponibili = 2;

    public void total(int n1, int n2){
        System.out.println(n1 + n2);
    }
    public void Prodotto(int codiceArticolo, String descrzioneArticolo, int prezzo, int pezziDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrzioneArticolo = descrzioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public void setDescrzioneArticolo(String descrzioneArticolo) {
        this.descrzioneArticolo = descrzioneArticolo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    @Override
    public String toString() {
        return "ECommerce{" +
                "codiceArticolo= " + codiceArticolo +
                ", descrzioneArticolo= '" + descrzioneArticolo + '\'' +
                ", prezzo= " + prezzo +
                ", pezziDisponibili= " + pezziDisponibili +
                '}';
    }


}
