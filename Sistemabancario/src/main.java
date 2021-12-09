
public class main {

	public static void main(String[] args) {
		Cliente dre=new Cliente();
		dre.setNome("Anderson");
		
		
		
		Conta cc= new ContaCorrente(dre);
		Conta poupanca=new ContaPoupanca(dre);
		cc.depositar(100);
		poupanca.depositar(150);
		cc.transferir(50, poupanca);
		poupanca.transferir(180, cc);
		poupanca.transferir(30,cc);
		cc.transferir(230, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
