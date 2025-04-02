package xadrez;

import tabuleiro.Board;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Board board;

	public PartidaXadrez() {
		board = new Board(8, 8);
		initialSetup();
	}

	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[board.getLinhas()][board.getColunas()];
		for (int i = 0; i < board.getLinhas(); i++) {
			for (int j = 0; j < board.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) board.peca(i, j);
			}
		}
		return mat;
	}
     
	private void initialSetup() {
		board.placePeca(new Torre(board,Cor.WHITE), new Posicao(2,1));
		board.placePeca(new Rei(board,Cor.BLACK), new Posicao(7,3));
		board.placePeca(new Rei(board,Cor.BLACK), new Posicao(7,3));
	}
}
