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
		
	}

}
