package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj​ {
    private String drzava, broj;

    MedunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }

    public String ispisi(){
        String s = new String();
        s += drzava;
        s += broj;

        return s;
    }

    public int hashCode(){
        return TelefonskiBroj​.class.hashCode();
    }
}
