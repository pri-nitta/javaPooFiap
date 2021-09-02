package banco.java;

public class ContaCorrente extends Conta{
	
	private String tipo;
	private double chequeEspecial;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	//utiliza o super para acessar os métodos da classe mãe
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
	}
	
	//sobrescrita de métodos - polimorfismo
	//dois métodos com a mesma assinatura, mesmos parametros de entrada
	//usar o mesmo método de formas diferentes
	
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}
}
