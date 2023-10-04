package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhone {
    public int number ;
    public int euro = 0;
public String[] myArrayList;
    public MobilePhone(int number) {
        myArrayList = new String[5];
        this.number = number;
        this.euro = euro;
        System.out.println("Il tuo numero: " +this.number);
        System.out.println("Il tuo credito: " +this.euro + "$");
        System.out.println(myArrayList);
    }
    public void Call(String nome, int numero) {
    String callEnter = "Chiamata a: " + nome + " Numero: " + numero;
    myArrayList = new String[]{callEnter};
        System.out.println(Arrays.toString(myArrayList));
    }
}
