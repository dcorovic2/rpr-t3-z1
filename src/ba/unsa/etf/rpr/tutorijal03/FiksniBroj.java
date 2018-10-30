package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class FiksniBroj extends TelefonskiBroj​ {
    public String broj;
    public Grad mjesto;
    public enum Grad {SARAJEVO, TUZLA, ZENICA, BIHAC, ORASJE, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, LIVNO, BRCKO}
    public static HashMap<Grad, String> vrijednost = new HashMap<>();
    static {
        vrijednost.put(Grad.SARAJEVO, "033");
        vrijednost.put(Grad.TUZLA, "035");
        vrijednost.put(Grad.ZENICA, "032");
        vrijednost.put(Grad.BIHAC, "037");
        vrijednost.put(Grad.ORASJE, "031");
        vrijednost.put(Grad.GORAZDE, "038");
        vrijednost.put(Grad.TRAVNIK, "030");
        vrijednost.put(Grad.MOSTAR, "036");
        vrijednost.put(Grad.SIROKIBRIJEG, "039");
        vrijednost.put(Grad.LIVNO, "034");
        vrijednost.put(Grad.BRCKO, "049");
    }

    FiksniBroj(Grad grad, String broj){
        mjesto = grad;
        this.broj = broj;

    }
    public String ispisi(){
        String s = new String();
        s += vrijednost.get(mjesto);
        s += "/";
        s += broj;
        return s;
    }

    public int hashCode(){
        return TelefonskiBroj​.class.hashCode();
    }
}
