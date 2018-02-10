package usuario;

public class Funcionario extends Usuario{
	
	private DadosPessoais dados;
	private Endereco endereco;
	
	public Funcionario(String nomeDeUsuario, String senha, int id, DadosPessoais dados, Endereco endereco) {
		super(nomeDeUsuario, senha, id);
		this.dados = dados;
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dados == null) ? 0 : dados.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
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
		Funcionario other = (Funcionario) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [dados=" + dados + ", endereco=" + endereco + "]";
	}
	
	

}
