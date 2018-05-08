
public class TestaArray {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new Conta();
			conta.deposita(i * 100);
		}

	}
}
