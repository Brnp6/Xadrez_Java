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
	private void placeNewPeca(char coluna, int linha, PecaXadrez peca) {
		board.placePeca(peca,  new XadrezPosicao(coluna,linha).toPosicao());
	}
	
     
	private void initialSetup() {
		placeNewPeca('b', 6, new Torre(board,Cor.WHITE));
		placeNewPeca('e',8, new Torre(board,Cor.BLACK));
		placeNewPeca('e',1, new Rei(board,Cor.BLACK));
		
		
	}
}
