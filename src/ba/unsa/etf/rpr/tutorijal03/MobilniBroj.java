package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public int compareTo(Object o){
        MobilniBroj mb = (MobilniBroj) o;
        return this.broj.compareTo(mb.broj);
    }

    public String ispisi(){
        String s = new String();
        s += "0";
        s += String.valueOf(mobilnaMreza);
        s += "/";
        s += broj;
        return s;
    }

    public int hashCode(){
        return 0;
    }
}
