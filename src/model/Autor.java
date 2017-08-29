package model;

public class Autor {
	private String titularidade;
	private AreaAtuacaoEnum areaAtuacao;
	private String descricaoCurricular;

	public String getTitularidade() {
		return titularidade;
	}

	public void setTitularidade(String titularidade) {
		this.titularidade = titularidade;
	}

	public AreaAtuacaoEnum getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacaoEnum areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getDescricaoCurricular() {
		return descricaoCurricular;
	}

	public void setDescricaoCurricular(String descricaoCurricular) {
		this.descricaoCurricular = descricaoCurricular;
	}

	@Override
	public String toString() {
		return "Autor [titularidade=" + titularidade + ", areaAtuacao=" + areaAtuacao + ", descricaoCurricular="
				+ descricaoCurricular + "]";
	}

}
