package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
    private HashMap<String, TelefonskiBroj​> imeBroj = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj​ broj​){
        if(broj​ instanceof FiksniBroj) {
            FiksniBroj fb = (FiksniBroj) broj​;
            imeBroj.put(ime, fb);
        }
        if(broj​ instanceof MobilniBroj){
            MobilniBroj mb = (MobilniBroj) broj​;
            imeBroj.put(ime, broj​);
        } else {
            MedunarodniBroj mb = (MedunarodniBroj) broj;
            imeBroj.put(ime, broj​);
        }

    }

    public String dajBroj(String ime){

    }

    public naSlovo(char s){

    }

    public Set<String> izGrada(FiksniBroj.Grad g){

    }

    public Set<TelefonskiBroj​> izGradaBrojevi(FiksniBroj.Grad g){

    }
}
