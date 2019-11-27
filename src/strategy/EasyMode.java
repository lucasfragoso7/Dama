package strategy;

import dama.Tabuleiro.peca;

public class EasyMode implements Strategy{


	private static final int QTTD_LINHA_PECA = 3;

	private static final int TAMANHO_FACIL = 8;

	@Override
	public peca[][] getTabuleiroComPeca() {
		peca[][] tabuleiro = new peca[TAMANHO_FACIL][TAMANHO_FACIL];

		for (int i = 0; i < QTTD_LINHA_PECA; i++) {
			for (int j = 0; j < TAMANHO_FACIL; j++) {
				if ((i + j) % 2 == 0) {
					tabuleiro[i][j] = peca.VERMELHA;
				}
			}
		}
		for (int i = TAMANHO_FACIL - QTTD_LINHA_PECA; i < TAMANHO_FACIL; i++) {
			for (int j = 0; j < TAMANHO_FACIL; j++) {
				if ((i + j) % 2 == 0) {
					tabuleiro[i][j] = peca.PRETA;
				}
			}
		}

		return tabuleiro;
	}
	
	

	@Override
	public int getTamanho() {
		return TAMANHO_FACIL;
	}



	@Override
	public peca[][] getTabuleiro() {
		return new peca[TAMANHO_FACIL][TAMANHO_FACIL];

	}



	@Override
	public int getTamanhoJanela() {
		return 320;
	}
}
