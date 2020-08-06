
public class TestaBanco {
	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.nome = "Felipe Souto de Carvalho";
		felipe.cpf = "222.222.222-22";
		felipe.profissao = "progamador";
		
		
		Conta contaDoFelipe = new Conta();
		contaDoFelipe.deposita(100);
		System.out.println(contaDoFelipe.saldo);
		
		contaDoFelipe.titular = felipe;
		System.out.println(contaDoFelipe.titular.nome);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
