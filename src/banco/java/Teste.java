package banco.java;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
		
		//dessa forma a vari�vel n�o acessar� todos os m�todos, apenas os da superclasse
		//cria objetos a partir da subclasse
		Conta cc2 = new ContaCorrente();
		
		//convers�o com casting, for�ando o downcasting consigo acessar a subclasse
		ContaCorrente c1 = (ContaCorrente) cc;
		
		//erro! vari�vel deve pertencer � mesma hierarquia, � uma instancia de conta corrente?
		if(conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;		
		}
		
	}

}
