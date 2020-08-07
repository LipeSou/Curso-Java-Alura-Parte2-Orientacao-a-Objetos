
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		
		Cliente felipe = new Cliente();
		felipe.setNome("felipe souto");
		
		conta.setTitular(felipe);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
		Conta conta2 = new Conta(1337, 16545);
		Conta conta3 = new Conta(1226, 54789);
		
		System.out.println(Conta.getTotal());
	}
}
