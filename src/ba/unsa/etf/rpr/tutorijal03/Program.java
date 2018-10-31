package ba.unsa.etf.rpr.tutorijal03;

import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.BIHAC;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;

public class Program {

    public static void main(String[] args) {
		/*Imenik imenik = new Imenik();
		imenik.dodaj("Dalila Corovic", new FiksniBroj(SARAJEVO, "123-123"));
		imenik.dodaj("Dodati korisnik", new FiksniBroj(BIHAC, "525-485"));
		imenik.dodaj("Anonimni kornsik", new MobilniBroj(62, "888-666"));
		imenik.dodaj("Strani korisnik", new MedunarodniBroj("+1", "25 85-75-89"));

		String slovo = imenik.naSlovo('D');
		System.out.println(slovo);

		Set<String> brojeviIzGrada = imenik.izGrada(BIHAC);
		for(String broj: brojeviIzGrada){
			System.out.println(broj + ",");
		}*/

		Imenik imenik = new Imenik();
		imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
		imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
		imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
		imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
		imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
		Set<TelefonskiBroj> set = imenik.izGradaBrojevi(SARAJEVO);
		String result = "";
		for (TelefonskiBroj​ broj: set) {
			System.out.println(broj.ispisi() + ",");
		}
		//assertEquals("033/123-156,033/123-456,033/123-656,", result);


	}
}
