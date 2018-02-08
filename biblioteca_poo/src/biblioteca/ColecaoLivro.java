package biblioteca;

import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.*;
import java.time.LocalDate;

public class ColecaoLivro {
	
	private ArrayList<Livro> colLivro;
	private ArrayList<Livro> emprestimoLivro;
	
	
	public ColecaoLivro() {
		colLivro = new ArrayList<Livro>();
	}
	
	public void adicionaLivro(Livro livro) {
		colLivro.add(livro);
	}
	
	public void removelivroPorISBN(String isbn) throws Exception{
		for (Livro l: colLivro){
			if (l.getIsbn().equals(isbn)){
				colLivro.remove(l);
			}
		}
		throw new Exception("Não existe livro com esse ISBN: " + isbn);
	}
	
	//a ser desenvolvido
	public Livro buscaLivroPeloTitulo(String livro) throws Exception{
		for (Livro l: colLivro){
			if (l.getTitulo().equals(livro)){
				return l;
			}
		}
		throw new Exception("Não existe um livro com esse título: " + livro);
	}


public void salvaEmXML(){
	XStream xStream = new XStream(new StaxDriver());
    xStream.alias("livro", Livro.class);
    xStream.alias("LocalDate", LocalDate.class);
    xStream.alias("ArrayList", ArrayList.class);

    File arquivo = new File("LivrosBiblioteca.xml");
    FileOutputStream gravar;
    try {
        gravar = new FileOutputStream(arquivo);
        gravar.write(xStream.toXML(colLivro).getBytes());
        gravar.close();
    } catch (IOException ex) {
        ex.printStackTrace();
    } 
	
}

@SuppressWarnings("unchecked")
public void lerDoXML(){
	try {
		XStream xStream = new XStream(new StaxDriver());
		//Questões de segurança
		XStream.setupDefaultSecurity(xStream);
		xStream.addPermission(AnyTypePermission.ANY); 
		xStream.alias("Arraylist", ArrayList.class);
		xStream.processAnnotations(Livro.class);
		xStream.processAnnotations(LocalDate.class);
		BufferedInputStream input = new BufferedInputStream(new FileInputStream("LivrosBiblioteca.xml"));
		colLivro = (ArrayList<Livro>) xStream.fromXML(input);
		input.close();
	} catch (IOException ex) {
		ex.printStackTrace();
	}
}
}