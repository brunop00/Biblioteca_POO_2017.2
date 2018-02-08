package usuário;

public class Aluno extends Usuario{
	
	@Override
	public String toString() {
		return "Aluno [dados=" + dados + ", endereco=" + endereco + ", matricula=" + matricula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dados == null) ? 0 : dados.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dados == null) {
			if (other.dados != null)
				return false;
		} else if (!dados.equals(other.dados))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	private DadosPessoais dados;
	private Endereco endereco;
	private String matricula;
	
	public Aluno(String nomeDeUsuario, String senha, int id, DadosPessoais dados, Endereco endereco, String matricula) {
		super(nomeDeUsuario, senha, id);
		this.dados = dados;
		this.endereco = endereco;
		this.matricula = matricula;
	}
	
	
	
	
	
}
