package aplicacao;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partida = new PartidaXadrez();
		while(true) {
		UI.printBoard(partida.getPecas());
		System.out.println();
		System.out.println("Origem: ");
		XadrezPosicao origem = UI.lerXadrezPosicao(sc);
		
		System.out.println();
		System.out.println("Destino: ");
		XadrezPosicao destino = UI.lerXadrezPosicao(sc);
		
		PecaXadrez pecaCapturada = partida.performChessMove(origem, destino);
		}
	
	}

}
