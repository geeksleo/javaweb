package model;

public class Cliente extends Pessoa {
	private Long codigo;
	private float limiteCredito;
	private String areaInteresse;
	private String profissao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getAreaInteresse() {
		return areaInteresse;
	}

	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", limiteCredito=" + limiteCredito + ", areaInteresse=" + areaInteresse
				+ ", profissao=" + profissao + "]";
	}

}
