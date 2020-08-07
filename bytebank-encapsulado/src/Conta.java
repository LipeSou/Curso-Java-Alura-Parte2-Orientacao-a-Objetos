public class Conta {
	private double saldo;
    private int agencia;
    private int numero; 
    private Cliente titular;
    
    public void deposita(double valor) {
    	this.saldo = this.saldo + valor;
    }
    
     public boolean saca(double valor){
    	if(this.saldo >= valor){
    		this.saldo = this.saldo - valor;
    		return true;
    	}else {
    		System.err.println("vc nao tem dinheiro suficiente");
    		return false;
    	}
    }
     
     public boolean transfere (double valor, Conta destino){
    	 if(this.saldo >= valor) {
    		 this.saldo -= valor;
    		// podemos fazer assim  destino.saldo +=  valor; ou
    		 destino.deposita(valor);
    		 return true;
    	 } else {
    		 System.err.println("nao tem dinheiro");
    		 return false;
    	 }
     }
     
     public double getSaldo() {
		 return saldo;
	 }
     
     public int getNumero() {
    	 return numero;
     }
     
     public void setNumero(int numero) {
    	 this.numero = numero;
     }
     
     public int getAgencia() {
		return this.agencia;
	}
     
     public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
     
     public void setTitular(Cliente titular) {
		this.titular = titular;
	}
     
     public Cliente getTitular() {
		return titular;
	}
}
