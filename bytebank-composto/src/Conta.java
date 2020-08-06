public class Conta {
   double saldo;
    int agencia;
    int numero; 
    Cliente titular;
    
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
}
