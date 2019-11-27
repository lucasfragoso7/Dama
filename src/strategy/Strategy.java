package strategy;

import dama.Tabuleiro.peca;

public interface Strategy {

    //TODO
    public peca[][] getTabuleiro();
    
    public int getTamanhoJanela();
    
    public int getTamanho();
    
    public peca[][] getTabuleiroComPeca();
}
