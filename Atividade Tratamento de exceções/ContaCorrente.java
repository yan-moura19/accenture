package atividades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;


public class ContaCorrente {
	private int numero;
	private double saldo = 0;
	private Date data;
	private Cliente cliente;
	List<String> extrato = new ArrayList<>();
	
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(int numero, Date data, Cliente cliente) {
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;
	}
	public void depositar(double valorDeposito) throws DepositoInvalidoException{
		if(valorDeposito > 0) {
			saldo += valorDeposito;
			System.out.println("Depósito Efetuado");
			extrato.add("Deposito de R$ " + valorDeposito + " Data " +LocalDate.now() );
		}else {
			throw new DepositoInvalidoException("Depósito invalido");
		}
			
	}
	public void recebeTransferencia(String nome  ,double valor) {
		saldo += valor;
		extrato.add(nome + " te enviou R$" + valor+ " Data " + LocalDate.now() );
}
	public void sacar(double valorSaque) throws EstouroSaqueException{
		if(valorSaque <= saldo) {
			saldo -= valorSaque;
			extrato.add("Saque de R$ " + valorSaque + " Data "+  LocalDate.now() );
			System.out.println("Saque efetuado");
		}else {
			throw new EstouroSaqueException("Saldo insuficiente");
		}
	}
	public void transferir(ContaCorrente destino, double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			destino.recebeTransferencia(cliente.getNome(), valor);
			extrato.add("Transferência de R$ " + valor +  " Para '"+ destino.cliente.getNome() + "' Data " + LocalDate.now() );
			System.out.println("Transferência efetuada");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void exibirExtrato() {
		
		for (String item : extrato) {
		    System.out.println(item);
		}
		System.out.println("----------------");
	}
	public String getTitular() {
		return cliente.getNome();
	}
	

}
