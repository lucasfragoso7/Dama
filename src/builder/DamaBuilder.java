package builder;

import dama.Jogador;
import dama.Tabuleiro;
import dao.GravadorDosJogos;
import interfaceGrafica.Janela;
import interfaceGrafica.PlayerController;
import strategy.EasyMode;
import strategy.HardMode;
import strategy.MediumMode;
import strategy.Strategy;

public class DamaBuilder {

	private Janela janela;
	private Strategy strategy;
	private Tabuleiro tabuleiro;
	private PlayerController playerController;

	public void montaJanela() {
		this.janela = new Janela();
		janela.setTitle(janela.getLabelOne() + " vs " + janela.getLabelTwo());
		montaTabuleiro();
		montaJogador();
		janela.setPlayerInterface(playerController);

		GravadorDosJogos logger = new GravadorDosJogos();

		janela.getGUI().setPlayerInterface(playerController);
		janela.setTabuleiro(tabuleiro);
		System.err.println("teste");
		janela.setVisible(true);

	}

	private void montaTabuleiro() {
		this.strategy = this.janela.getStrategy();
		this.tabuleiro = new Tabuleiro(strategy);
	}

	private void montaJogador() {
		Jogador v = new Jogador(tabuleiro, true);
		Jogador p = new Jogador(tabuleiro, false);
		PlayerController pc = new PlayerController(p, v);
		this.playerController = pc;

	}

}
