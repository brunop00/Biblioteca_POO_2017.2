package biblioteca;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class LeituraValidacaoDados {
	private Scanner sc;
	
	public LeituraValidacaoDados() {
		sc = new Scanner(System.in);
	}
	
	public int validaInteiro() {
		if(!sc.hasNextInt()) {
			System.out.println("Digite um número inteiro.");
			return validaInteiro();
		}
		int n = sc.nextInt();
		return n;
	}
	
	public double validaDouble() {
		if(!sc.hasNextDouble()) {
			System.out.println("Digite um numero real.");
			return validaDouble();
		}
		Double d = sc.nextDouble();
		return d;
	}
	
	public String validaSenha() {
		String s;
		while(!sc.hasNextLine()) {
			System.out.println("Digite uma senha válida.");
			return validaSenha();
		}
		s = sc.nextLine();
		if(!s.matches("[A-Za-z_0-9]{8,}")) {
			System.out.println("A senha pode ser composta de números e letras e só aceita no mínimo 8 carateres.");
			return validaSenha();
		}
		return s;
	}
	
	public String validaNomeDeUsuario() {
		String usr;
		while(!sc.hasNextLine()) {
			System.out.println("Digite um nome de usuário válido.");
			return validaNomeDeUsuario();
		}
		usr = sc.nextLine();
		if(!usr.matches("[A-Za-z_0-9]{8,16}")) {
			System.out.println("O nome de usuário só aceita letras e números e só aceita no minímo 8 e no máximo 16 carateres.");
			return validaNomeDeUsuario();
		}
		return usr;
	}
	
	public String validaMatricula() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite uma matricula válida.");
			return validaMatricula();
		}
		String m = sc.nextLine();
		if(!m.matches("[0-9]{11}")) {
			System.out.println("A matricula digitada não é válida. Digite uma matricula com 11 números válidos.");
			return validaMatricula();
		}
		return m;
	}
	
	public String validaCPF() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um CPF válido.");
			return validaCPF();
		}
		String cpf = sc.nextLine();
		if(!cpf.matches("[0-9]{3}\\.){2}([0-9]{3}-)([0-9]{2} ")) {
			System.out.println("O CPF digitado não é válido. Digite o CPF nesse formato: (nnn.nnn.nnn-nn)");
			return validaCPF();
		}
		return cpf;
	}
	
	public String validaNome() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um nome válido.");
			return validaNome();
		}
		String nome = sc.nextLine();
		if(!nome.matches("/^(?![ ])(?!.*(?:\\d|[ ]{2}|[!$%^&*()_+|~=\\{\\}\\[\\]:\";<>?,\\/]))(?:(?:e|da|do|das|dos|de|d'|D'|la|las|el|los|l')\\s*?|(?:[A-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð'][^\\s]*\\s*?)(?!.*[ ]$))+$/")){
			System.out.println("Por favor digite com atenção o nome completo. Atente para os espaçoes e caracteres especiais.");
			return validaNome();
		}
		return nome;
	}
	
	public String validaRG() {
		// /^[0-9]{2,3}\.?[0-9]{2,3}\.?[0-9]{3}\-?[A-Za-z0-9]{1}$/
		while(!sc.hasNextLine()) {
			System.out.println("Digite um RG válido.");
			return validaRG();
		}
		String rg = sc.nextLine();
		if(!rg.matches("/^[0-9]{2,3}\\.?[0-9]{2,3}\\.?[0-9]{3}\\-?[A-Za-z0-9]{1}$/")) {
			System.out.println("Não é um formato de RG aceito.");
			return validaRG();
		}
		return rg;
	}
	
	public String validaTelefone() {
		// ^\([1-9]{2}\) [2-9][0-9]{3,4}\-[0-9]{4}
		while(!sc.hasNextLine()) {
			System.out.println("Digite um número de telefone válido.");
			return validaTelefone();
	}
		String tel = sc.nextLine();
		if(!tel.matches("^\\([1-9]{2}\\) [2-9][0-9]{3,4}\\-[0-9]{4}")){
			System.out.println("Formato de telefone esperado: nn nnnn-nnnn ou nn nnnnn-nnnn.");
			return validaTelefone();
		}
		return tel;
	}
	
	public String validaEmail() {
		// "[A-Za-z0-9\\._-]+@[A-Za-z0-9]+(\\.[A-Za-z]+)*"
		// "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"
		while(!sc.hasNextLine()) {
			System.out.println("Digite um Email válido.");
			return validaEmail();
	}
		String email = sc.nextLine();
		if(!email.matches("[A-Za-z0-9\\._-]+@[A-Za-z0-9]+(\\.[A-Za-z]+)*") || !email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$")) {
			System.out.println("O Email digitado não corresponde a um formato de email válido. Atente para a forma que você está digitando-o.");
			return validaEmail();
		}
		return email;
	}
	
	public LocalDate validaDataNascimento() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite uma data válida.");
			return validaDataNascimento();
		}
		String data = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if(!data.matches("^([0-9]{2}\\/[0-9]{2}\\/[0-9]{4})$")) {
			System.out.println("Digite uma data nesse formato: dd/mm/aaaa");
			return validaDataNascimento();
		}
		return LocalDate.parse(data, formato);
	}
	
	public String validaRuaNum() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um endereço de rua válido. Comece digitando o número da casa seguido do nome da rua. Ex: 144 josé das dores.");
			return validaRuaNum();
		}
		String rua=sc.nextLine();
		if(!rua.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
			System.out.println("Por favor, informe um endereço de rua que inicie com o número da residência seguido do nome da rua. Ex: 144 josé das dores.");
			return validaRuaNum();
		}
		return rua;
	}
	
	public String validaBairro() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um nome de bairro válido.");
			return validaBairro();
		}
		String bairro = sc.nextLine();
		return bairro;
	}
	
	public String validaCEP() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um cep válido. Ex: xxxxx-xxx.");
			return validaCEP();
		}
		String cep= sc.nextLine();
		if(!cep.matches("\\d{5}-\\d{3}")) {
			System.out.println("Um formato de cep esperado é o seguinte: xxxxx-xxx.");
			return validaCEP();
		}
		return cep;
	}
	
	public String validaCidade() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um nome de cidade válido.");
			return validaCidade();
		}
		String cidade=sc.nextLine();
		if(!cidade.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
			System.out.println("Digite uma cidade de nome possível e existente.");
			return validaCidade();
		}
		return cidade;
	}
	
	public String validaEstado() {
		while(!sc.hasNextLine()) {
			System.out.println("Digite um nome de estado válido.");
			return validaEstado();
		}
		String estado=sc.nextLine();
		if(!estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
			System.out.println("Digite um estado de nome possível e existente.");
			return validaEstado();
		}
		return estado;
	}
}