package Chess.Pieces;

import java.io.File;

public class Rook extends Piece {
	public Rook(int color, int x, int y) {
		value = 5;
		name = (color == 1 ? "White":"Black") + " Rook";
		code = (color == 1 ? "W":"B") + "R";
		code = (color == 1 ? "W":"B") + "R";
		image = new File(".C:\\Users\\akshd\\IdeaProjects\\Chess\\Chessassets\\" + (color == 1 ? "White":"Black") + "Rook.svg");
		this.color = color;
		position = new int[]{x, y};
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
