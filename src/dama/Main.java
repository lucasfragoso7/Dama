/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dama;

import java.io.IOException;

import builder.DamaBuilder;

public class Main {

	private static Tabuleiro t;

	public static void empate() {
		t.declaraVencedor(true);
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
		
		DamaBuilder builder = new DamaBuilder();
		builder.montaJanela();
		

//		Janela j = new Janela();
//		j.setTitle(j.getLabelOne() + " vs " + j.getLabelTwo());
//		t = new Tabuleiro(j.getStrategy());
//		Jogador v = new Jogador(t, true);
//		Jogador p = new Jogador(t, false);
//		PlayerController pc = new PlayerController(p, v);
//		j.setPlayerInterface(pc);
//
//		GravadorDosJogos logger = new GravadorDosJogos();
//
//		j.getGUI().setPlayerInterface(pc);
//		j.setTabuleiro(t);
//		System.err.println("teste");
//		j.setVisible(true);
//
	}



}
