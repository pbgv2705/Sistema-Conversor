import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) throws NaoNumericoException {

		boolean deNovo = true;
		while (deNovo) {

			String input = "";
			Double valorAConverter = 0.0;
			String opcao = (JOptionPane.showInputDialog(null, "Selecione uma opção", "MENU", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Medição" },
					"Conversor de Moeda")).toString();

			System.out.println("A opção é: " + opcao);
			if (opcao == "Conversor de Moeda") {
				System.out.println("Entrou no " + opcao);
			}

			Funcao funcao = new Funcao();

			boolean valorCerto = false;
			while (!valorCerto) {
				input = JOptionPane.showInputDialog("Indique o valor");
				try {
					valorAConverter = funcao.eNumero(input);
					valorCerto = true;
				} catch (NaoNumericoException ex) {
					System.out.println(ex.getMessage());
					ex.printStackTrace();
					valorCerto = false;
				}
			}

			switch (opcao) {
			case "Conversor de Moeda": {
				System.out.println("Entrou no switch " + valorAConverter);
				funcao.converterMoedas(valorAConverter);
				break;
			}
			case "Conversor de Temperatura": {

				break;
			}
			case "Conversor de Medição": {

				break;
			}

			}

			int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			System.out.println("OK_OPTION = " + continuar);
			switch (continuar) {
			case 0:
				System.out.println("Vai continuar");
				break;
			case 1:
				System.out.println("Não vai continuar");
				deNovo = false;
				break;
			default:
				System.out.println("Está indeciso");
				deNovo = false;
				break;

			}
		}
	}
}
