
public class ConversorMoedas {

	double resultado = 0.0;
	public double aOutraMoeda(double valor, double cambioAAplicar) {
		System.out.println("resultado entrando aOutraMoeda:" + resultado);
		
		return resultado = (double)Math.round((valor / cambioAAplicar)*100.0)/100.0;
	}

	public double deOutraMoeda(double valor, double cambioAAplicar) {
		System.out.println("resultado entrando deOutraMoeda:" + resultado);
		resultado = (double)Math.round(valor * cambioAAplicar);
		System.out.println("resultado no conversor: " + resultado);
		return resultado;  // = (double)Math.round(valor * cambioAAplicar);
		
	}
	
}
