package calculadora;

public class Soma implements Calcula{

	double a;
	double b;
	double resultado;
	
	@Override
	public double  calcular(double a, double b) {
		this.a = a;
		this.b = b;
	
		resultado = a + b;
		
		return resultado;
		
	}

}
