
public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	public static int identificador = 0;

	public Conta() {
		identificador++;
		System.out.println("Conta criada com sucesso");
	}

	public Conta(String titular) {
		this.titular = titular;
		identificador++;
		System.out.println("Conta criada com sucesso");
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saca(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}// fim met.saca

	public void deposita(float valor) {
		this.saldo += valor;
	}// fim met.deposita

	public double calculaRendimento() {

		return this.saldo * 0.1;
	}// fim calcula rendimentos

	public String recuperandoDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo R$ " + this.saldo;
		/*
		 * dados += "\nDia: " + this.dataDeAbertura.dia; dados += "\nMês: "+
		 * this.dataDeAbertura.mes; dados += "\nAno: "+ this.dataDeAbertura.ano;
		 */
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		return dados;
	}// fim do recuperardadosparaimpressao

}// fim da classe
