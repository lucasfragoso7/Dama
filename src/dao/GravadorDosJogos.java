/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

import dama.Tabuleiro;

/**
 *
 * @author ibrahim
 */
public class GravadorDosJogos {

	private static ArrayList<Tabuleiro> jogoCompleto;

	public GravadorDosJogos() {
		getInstance();
	}

	public static ArrayList<Tabuleiro> getInstance() {
		if (jogoCompleto == null) {
			jogoCompleto = new ArrayList<Tabuleiro>();
		}
		return jogoCompleto;
	}

	public void update(Tabuleiro t) {
		jogoCompleto.add(t.clone());
	}

	public void terminate() {
//		try {
//			ObjectOutputStream objOutStr = new ObjectOutputStream(
//					new FileOutputStream("jogos/" +
//					Long.toString(new Date().getTime())));
//			objOutStr.writeObject(jogoCompleto);
//			objOutStr.close();
//		} catch (IOException ex) {
//			Logger.getLogger(GravadorDosJogos.class.getName()).
//					log(Level.SEVERE, null, ex);
//		}
	}
}
