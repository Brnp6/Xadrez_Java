package xadrez;

import tabuleiro.Board;
import tabuleiro.Peca;
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
	
	
	//aula movendo peça
	
	public PecaXadrez performChessMove(XadrezPosicao sourcePosition, XadrezPosicao targetPosition) {
		Posicao source = sourcePosition.toPosicao();
		Posicao target = targetPosition.toPosicao();
		validarSourcePosition(source);
		Peca capturarPeca = makeMove(source, target);
		return (PecaXadrez)capturarPeca;
	}
	
	// aula movendo peca
	private Peca makeMove(Posicao source, Posicao target) {
		Peca p = board.removePeca(source);
		Peca pecaCapturada = board.removePeca(target);
		board.placePeca(p, target);
		return pecaCapturada;
	}
	
	//aula movendo peça
	private void validarSourcePosition (Posicao posicao) {
		if(!board.temPeca(posicao)) {
			throw new ChessException("não há nenhuma peça na posição de origem ");
		}
	}
	
	

	
	
	
	private void placeNewPeca(char coluna, int linha, PecaXadrez peca) {
		board.placePeca(peca,  new XadrezPosicao(coluna,linha).toPosicao());
	}
	
     
	private void initialSetup() {
		placeNewPeca('c', 2, new Torre(board, Cor.WHITE));
		placeNewPeca('d', 2, new Torre(board, Cor.WHITE));
		placeNewPeca('e', 2, new Torre(board, Cor.WHITE));
		placeNewPeca('e', 1, new Torre(board, Cor.WHITE));
		placeNewPeca('d', 1, new Rei(board, Cor.WHITE));

		placeNewPeca('c', 7, new Torre(board, Cor.BLACK));
		placeNewPeca('c', 8, new Torre(board, Cor.BLACK));
		placeNewPeca('d', 7, new Torre(board, Cor.BLACK));
		placeNewPeca('e', 7, new Torre(board, Cor.BLACK));
		placeNewPeca('e', 8, new Torre(board, Cor.BLACK));
		placeNewPeca('d', 8, new Rei(board, Cor.BLACK));
		
		
	}
}
