package Chess.Pieces;

import javax.swing.*;

public class Bishop extends Piece {

	public Bishop(int color, int x, int y) {
		value = 3;
		name = (color == 1 ? "White":"Black") + " Bishop";
		code = (color == 1 ? "W":"B") + "B";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Bishop.png");
		this.color = color;
		position = new int[]{x, y};
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
