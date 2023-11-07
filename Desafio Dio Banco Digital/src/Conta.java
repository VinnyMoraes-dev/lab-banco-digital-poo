
public abstract class Conta implements iConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		 this.agencia = AGENCIA_PADRAO;
		 this.conta = SEQUENCIAL++;
		 this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
//		saldo = saldo - valor;
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
//		saldo = saldo + valor;
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, iConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirDadosBancarios() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
