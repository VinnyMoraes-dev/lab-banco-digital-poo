
public class Main {

	public static void main(String[] args) {
		// Instanciando cliente, conta corrente e conta poupança
		Cliente vinny = new Cliente();
		vinny.setNome("Vinny");
		
		Conta cc = new ContaCorrente(vinny);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(vinny);
		cc.transferir(100, cp);
		
		
		// Imprimindo contas corrente e poupança
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
