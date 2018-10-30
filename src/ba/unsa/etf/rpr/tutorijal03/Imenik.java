package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
        HashMap<String, TelefonskiBroj​> imeBroj = new HashMap<>();

        void dodaj (String ime, TelefonskiBroj​ broj​){
            imeBroj.put(ime, broj​);
        }

        String dajBroj (String ime){
            TelefonskiBroj​ tb = imeBroj.get(ime);
            //if(tb instanceof FiksniBroj){
            return tb.ispisi();
       /* }
        if(tb instanceof MobilniBroj){
            return tb.ispisi();
        }*/

        }
/*
    public naSlovo(char s){

    }

    public Set<String> izGrada(FiksniBroj.Grad g){

    }

    public Set<TelefonskiBroj​> izGradaBrojevi(FiksniBroj.Grad g){

    }*/
}
