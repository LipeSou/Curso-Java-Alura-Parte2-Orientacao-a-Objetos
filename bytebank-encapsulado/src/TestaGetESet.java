
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente felipe = new Cliente();
		felipe.setNome("felipe souto");
		
		conta.setTitular(felipe);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		
		System.out.println(conta.getTitular().getProfissao());
	}
}