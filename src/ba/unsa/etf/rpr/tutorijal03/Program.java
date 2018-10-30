package ba.unsa.etf.rpr.tutorijal03;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;

public class Program {

    public static void main(String[] args) {
		Imenik imenik = new Imenik();
		imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
		imenik.dodaj("Hana Hanic", new FiksniBroj(SARAJEVO, "123-156"));
		imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-456"));
		System.out.println(imenik.dajBroj("Meho Mehic"));
	}
}
