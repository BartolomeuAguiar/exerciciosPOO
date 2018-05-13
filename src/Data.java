
public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//a forma mais segura de não se inserir uma data 

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String formatada() {
		String dataFormatada = "";
		String d = Integer.toString(this.dia);
		dataFormatada += d + "/";
		String m = Integer.toString(this.mes);
		dataFormatada += m + "/";
		String a = Integer.toString(this.ano);
		dataFormatada += a;

		return dataFormatada;

	}

}// fim da classe
