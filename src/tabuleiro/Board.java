package tabuleiro;

public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Board(int linhas, int colunas) {
       if(linhas<1 || colunas <1) {
    	   throw new BoardException("Erro ao criar tabuleiro: Tem quer ter pelo menos uma linha e uma coluna");
       }
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	

	public int getColunas() {
		return colunas;
	}

	

	public Peca peca(int linha, int coluna) {
		if(!posicaoExiste(linha,coluna)) {
			throw new BoardException("Posição não existe");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new BoardException("Posição não existe");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void placePeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new BoardException("Já Existe uma peça nessa posição "+posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao){
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new BoardException("Posição não existe");
		}
		return peca(posicao) != null;
	}
	
}
