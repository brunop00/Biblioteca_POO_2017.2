package usuario;

// "\\d{5}-\\d{3}" cep
public class Endereco{
	
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String numeroDaCasa;

	public Endereco(String rua, String bairro, String cep, String cidade, String estado, String numeroDaCasa) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.numeroDaCasa = numeroDaCasa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}

	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((numeroDaCasa == null) ? 0 : numeroDaCasa.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (numeroDaCasa == null) {
			if (other.numeroDaCasa != null)
				return false;
		} else if (!numeroDaCasa.equals(other.numeroDaCasa))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado="
				+ estado + ", numeroDaCasa=" + numeroDaCasa + "]";
	}


}
