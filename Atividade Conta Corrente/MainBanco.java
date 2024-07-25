package atividades;

import java.util.Date;

public class MainBanco {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Yan", "gabriel", "0000000");
		Cliente cliente2 = new Cliente("Pedro", "Junior", "0000000");
		
		ContaCorrente conta1 = new ContaCorrente(1,  new Date(), cliente1);
		ContaCorrente conta2 = new ContaCorrente(2,  new Date(), cliente2);
		
		conta1.depositar(100);
		conta2.depositar(500);
		System.out.println("----------------");
		conta1.sacar(10);
		conta2.sacar(150);
		System.out.println("----------------");
		conta1.transferir(conta2, 50);
		conta2.transferir(conta1, 250);
		System.out.println("----------------");
		System.out.println("Extrato do " + conta1.getTitular());
		conta1.exibirExtrato();
		System.out.println("Extrato do " + conta2.getTitular());
		conta2.exibirExtrato();
		
		
	}

}
