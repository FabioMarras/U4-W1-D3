package Package;

public class Utente {
    private int codiceCliente = 123;
    private String nomeCognome = "Mario Rossi";
    private String email = "Mario@gmail.com";
    private String dataIscrizione = "01/02/2021";

    @Override
    public String toString() {
        return "Utente{" +
                "codiceCliente=" + codiceCliente +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                '}';
    }
}
