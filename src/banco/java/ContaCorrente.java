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
	
	//utiliza o super para acessar os m�todos da classe m�e
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
	}
	
	//sobrescrita de m�todos - polimorfismo
	//dois m�todos com a mesma assinatura, mesmos parametros de entrada
	//usar o mesmo m�todo de formas diferentes
	
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}
}
