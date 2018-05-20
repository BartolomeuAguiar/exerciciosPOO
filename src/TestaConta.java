
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("João");
		c1.setAgencia("123");
		c1.setNumero(54123);
		Data datac1 = new Data(01, 01, 1999);
		c1.setDataDeAbertura(datac1);
		c1.deposita(300);
		/*
		 ** Conta.saldo=123; ao tentar referenciar um atributo diretamente da classe o
		 * compilador retorna um erro de que não é possivel referenciar um objeto não
		 ** estatico para um estatico.
		 */
		Conta c2 = new Conta("Danilo");
		c2.deposita(200);

		Conta c3 = new Conta("Artur");
		c3 = c2;
		
		Gerente g1 = new Gerente();
		g1.setNome("Augusto");
		
		System.out.println(g1.getNome());
		
		// nesse caso os objetos são dados como iguais.

		c1.deposita(100);
		System.out.println("Saldo Atual R$ " + c1.getSaldo());
		System.out.println("Rendimento mensal R$ " + c1.calculaRendimento());
		System.out.println(c1.recuperandoDadosParaImpressao());
		c1.getDataDeAbertura().formatada();

		if (c2 == c3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}// fim do metodo maim

}// fim da classe
