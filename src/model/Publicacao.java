package model;

public class Publicacao {
	private Long id;
	private String isbn;
	private String titulo;
	private int nroEditora;
	private String descricao;
	private int ano;
	private TipoPublicacaoEnum tipo;
	private Editora editora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNroEditora() {
		return nroEditora;
	}

	public void setNroEditora(int nroEditora) {
		this.nroEditora = nroEditora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public TipoPublicacaoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoPublicacaoEnum tipo) {
		this.tipo = tipo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Publicacao [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", nroEditora=" + nroEditora
				+ ", descricao=" + descricao + ", ano=" + ano + ", tipo=" + tipo + ", editora=" + editora + "]";
	}

}
