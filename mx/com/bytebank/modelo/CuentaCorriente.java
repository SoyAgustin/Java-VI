package mx.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		//llamamos al constructor por defecto que recibe agencia y numero
		super(agencia,numero);
		
		/*System.out.println("Estoy creando una cuenta " + numero);*/
		/*System.out.println("numero: "+ numero + ", Agencia: "+agencia);*/
	}
	
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor+comision);//10 centavos de comisión 
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
}
