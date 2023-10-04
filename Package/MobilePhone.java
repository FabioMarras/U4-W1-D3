package Package;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    public int number ;
    public int euro = 0;
//    public String call() {
//        String prima = "20 minuti al numero XX" ;
//        String seconda = "30 minuti al numero YY";
//        return prima + seconda;
//    }
    public MobilePhone(int number, String c) {
        List myArrayList = new ArrayList();
        myArrayList.add(c);
        myArrayList.add("30 minuti al numero YY");
        this.number = number;
        this.euro = euro;
        System.out.println("Il tuo numero: " +this.number);
        System.out.println("Il tuo credito: " +this.euro + "$");
        System.out.println(myArrayList);
    }
}
