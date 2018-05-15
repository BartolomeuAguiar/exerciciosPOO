
public class Pais {
	private String nome;
	private String capital;
	private String idioma;
	private String estado;
	private String moeda;
	
	
	
	public Pais(String nome, String capital) {
		super();
		this.nome = nome;
		this.capital = capital;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getCapital() {
		return capital;
	}

}
