/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceGrafica;

import dama.Jogador;
import dama.Tabuleiro;


public class PlayerController implements PlayerInterface {


	private Jogador jPreto, jVermelho;
	private Tabuleiro t;

	public PlayerController(Jogador jPreto, Jogador jVermelho){
		this.jPreto = jPreto;
		this.jVermelho = jVermelho;
		this.t = jPreto.getTabuleiro();
	}

	public void makePlay(int oX, int oY, int dX, int dY) {
		if(jVermelho == null || jPreto == null)
			return;
		if(t.getVez()){
			jVermelho.joga(oX, oY, dX, dY);
		} else {
			jPreto.joga(oX, oY, dX, dY);
		}
	}

	public void update(Tabuleiro tabuleiro) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void terminate() {
		this.jPreto = null;
		this.jVermelho = null;
	}

}
