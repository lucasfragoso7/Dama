package builder;

import dama.Jogador;
import dama.Tabuleiro;
import interfaceGrafica.Janela;
import interfaceGrafica.PlayerController;
import strategy.EasyMode;
import strategy.HardMode;
import strategy.MediumMode;

public class CriadorDeJogo {
	private static final int SIZE_EASY = 320;
	private static final int SIZE_MEDIUM = 400;
	private static final int SIZE_HARD = 480;
	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;

	public void criarModoEasy() {
		Janela j = new Janela(SIZE_EASY);
		tabuleiro = new Tabuleiro(new EasyMode());

		this.jogador1 = new Jogador(tabuleiro, true);
		this.jogador2 = new Jogador(tabuleiro, false);

		PlayerController pc = new PlayerController(jogador1, jogador2);

		j.setPlayerInterface(pc);


		j.getGUI().setPlayerInterface(pc);
		j.setTabuleiro(tabuleiro);
		j.setVisible(true);

	}

	public void criarModoMedium() {
		Janela j = new Janela(SIZE_MEDIUM);
		tabuleiro = new Tabuleiro(new MediumMode());

		this.jogador1 = new Jogador(tabuleiro, true);
		this.jogador2 = new Jogador(tabuleiro, false);

		PlayerController pc = new PlayerController(jogador1, jogador2);

		j.setPlayerInterface(pc);


		j.getGUI().setPlayerInterface(pc);
		j.setTabuleiro(tabuleiro);
		j.setVisible(true);

	}

	public void criarModoHard() {
		Janela j = new Janela(SIZE_HARD);
		tabuleiro = new Tabuleiro(new HardMode());

		this.jogador1 = new Jogador(tabuleiro, true);
		this.jogador2 = new Jogador(tabuleiro, false);

		PlayerController pc = new PlayerController(jogador1, jogador2);

		j.setPlayerInterface(pc);


		j.getGUI().setPlayerInterface(pc);
		j.setTabuleiro(tabuleiro);
		j.setVisible(true);

	}
}
