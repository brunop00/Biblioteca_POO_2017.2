package biblioteca;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate data = null; 
		data = LocalDate.now();
		ColecaoLivro c = new ColecaoLivro();
		c.adicionaLivro(new Livro("chico tripa", "marieta vai com as outras", "romance", data, "livro excelente", "marietalivros", "9353829fiiefn" ));
		c.adicionaLivro(new Livro("chico tripa", "dndndfgndfthnd", "romance", data, "livro excelente", "berbdfbdfb", "vsdfbsdfsd" ));
		c.adicionaLivro(new Livro("chico tripa", "sfbxcvxdgvsd", "romance", data, "livro excelente", "marietalivros", "mryndcbsda" ));
		c.adicionaLivro(new Livro("chico tripa", "derndenr", "romance", data, "livro excelente", "marietalivros", "nmrtdfbe" ));
		
		c.salvaEmXML();
	

	}

}
