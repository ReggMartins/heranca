package entidades;

public class ContaEmpresa extends Conta{

	private double limite;
	
	public ContaEmpresa() {
		
	}

	public ContaEmpresa(int numero, String titular, double saldo, double limite) {
		super(numero, titular, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	public void emprestar(double valor) {
		if (valor <= limite) {
		saldo += valor -10.0;
		}
	}
	
	
}
