package entidades;

public class Poupanca extends Conta{

	private double taxaJuro;
	
	public Poupanca() {
		super();
	}

	public Poupanca(int numero, String titular, double saldo, double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	
	public void saldoAtualizado() {
		saldo += saldo * taxaJuro;
	}
	
	
}
