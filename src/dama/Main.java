/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dama;

import java.io.IOException;

import javax.swing.JOptionPane;

import builder.CriadorDeJogo;

public class Main {

	private static CriadorDeJogo builder = new CriadorDeJogo();

	public static void empate() {
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("pesos.object"));
//		double x[] = (double[]) oin.readObject();
//		for (double d : x){
//			System.out.println(d);
//		}
//		oin.close();
		getModalidadeJogo();

	}

	private static void getModalidadeJogo() {
		Object[] options = { "Facil", "Medio", "Dificil" };
		int x = JOptionPane.showOptionDialog(null, "Qual modalidade deseja jogar?", "Aviso", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

		switch (x) {
		case 0:
			builder.criarModoEasy();
			break;
		case 1:
			builder.criarModoMedium();
			break;

		case 2:
			builder.criarModoHard();
			break;

		default:
			System.out.println("Clicou no local errado");
			;
		}
	}
}
