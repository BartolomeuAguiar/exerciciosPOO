
public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataDeAbertura;

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
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nSaldo R$ " + this.saldo;
		/*
		 * dados += "\nDia: " + this.dataDeAbertura.dia; dados += "\nM�s: "+
		 * this.dataDeAbertura.mes; dados += "\nAno: "+ this.dataDeAbertura.ano;
		 */
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		return dados;
	}// fim do recuperardadosparaimpressao

}// fim da classe
