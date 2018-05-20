
public class Gerente extends Funcionario {
	String senha;

	@Override
	public double getBonificacao() {
		return (this.getSalario() * 0.15) + 1000;
	}

}
