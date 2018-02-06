package biblioteca;
import java.util.ArrayList;
public class ColecaoLivro {
	
	private ArrayList<Livro> colLivro;
	private ArrayList<Livro> emprestimoLivro;
	
	public ColecaoLivro() {
		colLivro = new ArrayList<Livro>();
	}
	
	public void adicionaLivro(Livro livro) {
		colLivro.add(livro);
	}
	
	public void removelivroPorISBN(String isbn){
		for (Livro l: colLivro){
			if (l.getIsbn().equals(isbn)){
				colLivro.remove(l);
			}
		}
	}
	
	//a ser desenvolvido
	/*public void buscaLivroPorTitulo() {
		
	}*/
	
}
