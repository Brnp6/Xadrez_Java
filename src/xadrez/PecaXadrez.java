package xadrez;

import tabuleiro.Board;
import tabuleiro.Peca;

public class PecaXadrez extends Peca{
	private Cor color;

	public PecaXadrez(Board board, Cor cor) {
		super(board);
		this.color = cor;
	}

	public Cor getCor() {
		return color;
	}
	
    
	
	
	
}
