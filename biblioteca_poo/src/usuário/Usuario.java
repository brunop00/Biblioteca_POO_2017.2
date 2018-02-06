package usuário;

public class Usuario {
	
	private String nomeDeUsuario;
	private String senha;
	private int id;
	
	public Usuario(String nomeDeUsuario, String senha, int id) {
		super();
		this.nomeDeUsuario = nomeDeUsuario;
		this.senha = senha;
		this.id = id;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nomeDeUsuario == null) ? 0 : nomeDeUsuario.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		if (nomeDeUsuario == null) {
			if (other.nomeDeUsuario != null)
				return false;
		} else if (!nomeDeUsuario.equals(other.nomeDeUsuario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nomeDeUsuario=" + nomeDeUsuario + ", senha=" + senha + ", id=" + id + "]";
	}

	
	
}
