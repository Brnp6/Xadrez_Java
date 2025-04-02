package xadrez;

import tabuleiro.Board;
import tabuleiro.Peca;

public class PecaXadrez extends Peca{
	private Cor color;

	public PecaXadrez(Board board, Cor cor) {
		super(board);
		this.color = cor;
	}

	public void setCor(Cor cor) {
		this.color = cor;
	}
	
    
	
	
	
}
