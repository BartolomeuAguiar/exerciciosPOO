
public class TestaArray {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length-1; i++) {
			Conta conta = new Conta();
			conta.deposita(i * 100);
			contas[i]=conta;
		}
		
		float total = 0;
		
		for(int i = 0; i<contas.length-1;i++) {
			total+=contas[i].getSaldo();
		}
		
		System.out.println("total de dinheiro no banco R$ "+total);
		
		System.out.println("A média de saldo é R$ "+total/contas.length);

	}
}
