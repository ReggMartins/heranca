package entidades;

public class Conta {
	
	private int numero;
	private String titular;
	protected Double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque (double valor) {
		saldo -= valor;
	}
	public void deposito(double valor) {
		saldo += valor;
	}
	
}
