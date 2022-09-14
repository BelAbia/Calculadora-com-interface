package calculadora;

import javax.swing.JOptionPane;

public class Controle {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		
		int escolha;
		
		try {
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero relacionado ao calculo que deseja: \n 1 - soma."
				+ " \n 2 - subtracao.\n 3 - multiplicacao. \n 4 - divisao."));
		switch (escolha) {
		case 1:
			Soma soma = new Soma();
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
			JOptionPane.showInputDialog("O resultado da soma é: ", soma.calcular(n1, n2));
			break;
		case(2):
			Subtracao sub = new Subtracao();
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
			JOptionPane.showInputDialog("O resultado da subtracao é: ", sub.calcular(n2, n1));
			break;
		case(3):
			Multiplicacao mult = new Multiplicacao();
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
			JOptionPane.showInputDialog("O resultado da multiplicacao é: ", mult.calcular(n1, n2));
			break;
		case(4):
			Divisao div = new Divisao();
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
			if (n2 == 0) {
				JOptionPane.showMessageDialog(null,"Não é possivel dividir por 0!");
				System.exit(0);
			}
			JOptionPane.showInputDialog("O resultado da divisao é: ", div.calcular(n1, n2));
			
			break;
		}
		
		if (escolha > 4) {
			JOptionPane.showMessageDialog(null,"        Opção inválida");
			System.exit(0);		}
				
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Voce inseriu o tipo de dado errado, deve ser inserido dados inteiros");
				
		}
		
	}
}

