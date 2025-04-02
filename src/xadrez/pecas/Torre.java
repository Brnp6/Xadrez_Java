package xadrez.pecas;

import tabuleiro.Board;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Board board, Cor cor) {
		super(board, cor);
		
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
