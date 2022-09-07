
public class Cajero extends Cuenta implements Inversion{

	float interes = 5;
	float ganancia;
	

	
	public void inversion() {
		this.ganancia = (this.dinero * this.interes)/ 100;
		this.inversion = true;
	}
	
	public float getGanancias() {
		return this.ganancia;
	}

	public void inversionCuenta() {
		this.dinero *= ganancia;
	}

}
