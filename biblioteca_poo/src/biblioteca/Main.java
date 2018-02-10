package biblioteca;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		String nomeDeUsuario;
		LeituraValidacaoDados le = new LeituraValidacaoDados();
		
		System.out.println("digite o nome de usuário:");
		nomeDeUsuario=le.validaNomeDeUsuario();
		System.out.println(nomeDeUsuario);
		System.out.println("Digite a senha:");
		String senha = le.validaSenha();
		System.out.println(senha);
		System.out.println("Digite a matricula do aluno:");
		String m = le.validaMatricula();
		System.out.println(m);
		System.out.println("Digite a data de nascimento:");
		LocalDate dataNascimento = le.validaDataNascimento();
		System.out.println(dataNascimento.toString());
		System.out.println("Digite o cpf: (xxx.xxx.xxx-xx)");
		String cpf = le.validaCPF();
		System.out.println("Digite o nome completo do usuário:");
		String nome = le.validaNome();
		System.out.println("Digite o número do RG:");
		String rg = le.validaRG();
		System.out.println("Digite o número de telefone: (xx xxxx-xxxx ou xx xxxxx-xxxx)");
		String tel = le.validaTelefone();
		System.out.println("Digite o Email:");
		String email = le.validaEmail();
		System.out.println("Digite o logradouro: número da casa seguido do nome da rua. (144 josé simões)");
		String rua = le.validaRuaNum();
		System.out.println("Digite o bairro:");
		String bairro = le.validaBairro();
		System.out.println("Digite a cidade:");
		String cidade = le.validaCidade();
		System.out.println("Digite o estado:");
		String estado = le.validaEstado();
		System.out.println("Digite o CEP: xxxxx-xxx");
		String cep = le.validaCEP();
		System.out.println(cep + estado + cidade + bairro + rua + email + tel + rg + nome + cpf);
	}
}
