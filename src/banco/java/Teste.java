package banco.java;

public class Teste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);

		//dessa forma a variável não acessará todos os métodos, apenas os da superclasse
		//cria objetos a partir da subclasse
		Conta cc2 = new ContaCorrente();

		//conversão com casting, forçando o downcasting consigo acessar a subclasse
		ContaCorrente c1 = (ContaCorrente) cc;

		//erro! variável deve pertencer à mesma hierarquia, é uma instancia de conta corrente?
		if(conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;		
		}

		//superclasse
		conta.depositar(1000.00);
		conta.retirar(100);

		//objeto contaCorrente método da subclasse sobrescrito
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);

		//objeto tipo conta corrente e variável de controle é conta, método override será executado
		cc2.depositar(1000);
		cc2.retirar(100);

		System.out.println("Conta 1: " + conta.getSaldo());
		System.out.println("Conta 2: " + conta2.getSaldo());
		System.out.println("Conta 3: " + cc2.getSaldo());
	}
}
