package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj​ {
    enum Grad {SARAJEVO, TUZLA, ZENICA, BIHAC, ORASJE, GORAZDE, TRAVNIK, MOSTAR, SIROKIBRIJEG, LIVNO, BRCKO};
    FiksniBroj(Grad grad, String broj){
        super(broj);
    }
    public String ispisi(){
        System.out.println();
    }

    public int hashCode(){
        return TelefonskiBroj​.class.hashCode();
    }
}
