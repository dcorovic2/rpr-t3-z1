package ba.unsa.etf.rpr.tutorijal03;

public class TelefonskiBroj​ {
    protected String broj;
    TelefonskiBroj​(String broj){
        this.broj = broj;
    }

    public abstract String ispisi();
    public abstract int hashCode();
}
