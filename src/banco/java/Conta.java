package banco.java;

public class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
}
