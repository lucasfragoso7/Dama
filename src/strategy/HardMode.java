package strategy;

import dama.Tabuleiro.peca;

public class HardMode implements Strategy {

	private static final int QTTD_LINHA_PECA = 5;

	private static final int TAMANHO_MEDIO = 12;

	@Override
	public peca[][] getTabuleiroComPeca() {
		peca[][] tabuleiro = new peca[TAMANHO_MEDIO][TAMANHO_MEDIO];

		for (int i = 0; i < QTTD_LINHA_PECA; i++) {
			for (int j = 0; j < TAMANHO_MEDIO; j++) {
				if ((i + j) % 2 == 0) {
					tabuleiro[i][j] = peca.VERMELHA;
				}
			}
		}
		for (int i = TAMANHO_MEDIO - QTTD_LINHA_PECA; i < TAMANHO_MEDIO; i++) {
			for (int j = 0; j < TAMANHO_MEDIO; j++) {
				if ((i + j) % 2 == 0) {
					tabuleiro[i][j] = peca.PRETA;
				}
			}
		}

		return tabuleiro;
	}
	
	

	@Override
	public int getTamanho() {
		return TAMANHO_MEDIO;
	}



	@Override
	public peca[][] getTabuleiro() {
		return new peca[TAMANHO_MEDIO][TAMANHO_MEDIO];

	}



	@Override
	public int getTamanhoJanela() {
		return 500;
	}
}
