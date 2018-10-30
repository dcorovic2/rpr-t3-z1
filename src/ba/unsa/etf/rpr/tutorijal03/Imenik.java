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
            return tb.ispisi();
        }

    public String naSlovo(char s){
        int brojac = 1;
        String s1 = new String();
        for (HashMap.Entry<String, TelefonskiBroj​> entry : imeBroj.entrySet()) {
            if(entry.getKey().charAt(0) == s){
                s1 += String.valueOf(brojac);
                s1 += ". ";
                s1 += entry.getKey();
                s1 += " - ";
                s1 += entry.getValue().ispisi();
                brojac++;

                return s1;
            }
        }
        return s1;
    }
/*
    public Set<String> izGrada(FiksniBroj.Grad g){

    }

    public Set<TelefonskiBroj​> izGradaBrojevi(FiksniBroj.Grad g){

    }*/
}
