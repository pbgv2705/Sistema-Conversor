import javax.swing.JOptionPane;

public class Funcao {

	ConversorMoedas moedas = new ConversorMoedas();
	
	public double eNumero(String str) throws NaoNumericoException {
		//match a number with optional '-' and decimal.
		  if (!str.matches("-?\\d+(\\.\\d+)?")) {
			  throw new NaoNumericoException("Valor indicado: " +
					  str + " --> não é numérico");
		  }else {
			  return Double.parseDouble(str);
		  }
		}

	public void converterMoedas(double valorAConverter) {

		String moedaAConvertir = (JOptionPane.showInputDialog(null,
				"Escolha a moeda para a qual " + "você deseja girar seu dinheiro", "MOEDAS", JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
						"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
						"De Yenes a Reais", "De Won Coreano a Reais" },
				"Conversor de Moeda")).toString();

		System.out.println("Se va a convertir: " + moedaAConvertir);

		String textoMensagem = "Você tem", moedaMensagem = "";
		double moedaResultado = 0.0;

		switch (moedaAConvertir) {
		case "De Reais a Dólares": {
			moedaResultado = moedas.aOutraMoeda(valorAConverter, 5.22);
			moedaMensagem = " USD$";
			
			break;
		}
		case "De Reais a Euros": {
			moedaResultado = moedas.aOutraMoeda(valorAConverter, 5.50);
			moedaMensagem = " Euros";
			break;
		}
		case "De Reais a Libras": {
			moedaResultado = moedas.aOutraMoeda(valorAConverter, 6.25);
			moedaMensagem = " Libras";
			break;
		}
		case "De Reais a Yenes": {
			moedaResultado = moedas.aOutraMoeda(valorAConverter, 0.038);
			moedaMensagem = " Yenes";
			break;
		}
		case "De Reais a Won Coreano": {
			moedaResultado = moedas.aOutraMoeda(valorAConverter, 260.13);
			moedaMensagem = " Won Coreano";
			break;
		}
		case "De Dólares a Reais": {
			System.out.println("moedaResultado entrando: " + moedaResultado);
			moedaResultado = moedas.deOutraMoeda(valorAConverter, 5.22);
			System.out.println("USD$ " + moedaResultado);
			moedaMensagem = " Reais";
			break;
		}
		case "De Euros a Reais": {
			moedaResultado = moedas.deOutraMoeda(valorAConverter, 5.50);
			moedaMensagem = " Reais";
			break;
		}
		case "De Libras a Reais": {
			moedaResultado = moedas.deOutraMoeda(valorAConverter, 6.25);
			moedaMensagem = " Reais";
			break;
		}
		case "De Yenes a Reais": { 
			moedaResultado = moedas.deOutraMoeda(valorAConverter, 0.038);
			moedaMensagem = " Reais";
			break;
		}
		case "De Won Coreano a Reais": {
			moedaResultado = moedas.deOutraMoeda(valorAConverter, 260.13);
			moedaMensagem = " Reais";
			break;
		}
		
		}
		JOptionPane.showMessageDialog(null, textoMensagem + moedaResultado + moedaMensagem);
		System.out.println("moedaResultado = " + moedaResultado);
	}

}
