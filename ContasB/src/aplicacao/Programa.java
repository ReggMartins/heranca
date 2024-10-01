package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.Poupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(5555, "Reginaldo", 0.0);
		ContaEmpresa contaE = new ContaEmpresa(6666, "Valeria",0.0, 700.00);
		
		//UPCASTING
		
		Conta conta1 = contaE;
		
		Conta conta2 = new ContaEmpresa(8888, "Ellen", 0.0, 200.0);
		
		Conta conta3 = new Poupanca(9999, "Paulo", 0, 0.1);
		
		
		//DownCasting
		
		//ContaEmpresa contaE01 = conta2;
		ContaEmpresa contaE01 = (ContaEmpresa)conta2;
		contaE01.emprestar(200.00);
		
		//ContaEmpresa contaE02 = (ContaEmpresa)conta3;
		if (conta3 instanceof ContaEmpresa) {
			ContaEmpresa contaE02 = (ContaEmpresa)conta3;
			contaE02.emprestar(100.00);
			System.out.println("Emprestimo realizado");
								
		} 
		
		
		if (conta3 instanceof Poupanca) {
			Poupanca contaE02 = (Poupanca)conta3;
			contaE02.saldoAtualizado();
			System.out.println("Atualizado");
		}
		
		
		

	}

}
