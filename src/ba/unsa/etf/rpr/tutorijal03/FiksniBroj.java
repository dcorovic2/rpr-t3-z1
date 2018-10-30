package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class FiksniBroj extends TelefonskiBroj​ {
    public String mjesto, broj;
    public HashMap<Grad, String> vrijednost = new HashMap<>();
    enum Grad {SARAJEVO, TUZLA, ZENICA, BIHAC, ORASJE, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, LIVNO, BRCKO}

    FiksniBroj(Grad grad, String broj){
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
        mjesto = grad.name();
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
