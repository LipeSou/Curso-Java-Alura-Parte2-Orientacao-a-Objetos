
public class TesteMetodo {
	public static void main (String[] args) {
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.saldo = 100;
		contaDoFelipe.deposita(50);
		System.out.println(contaDoFelipe.saldo);
		
		contaDoFelipe.saca(20);
		System.out.println(contaDoFelipe.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoFelipe);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoFelipe.saldo);
	}
}
