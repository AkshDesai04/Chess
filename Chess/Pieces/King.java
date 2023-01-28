package Chess.Pieces;

import javax.swing.*;

public class King extends Piece {
	boolean castle_rights = true;
	public King(int color, int[] position) {
		name = (color == 1 ? "White":"Black") + " King";
		code = (color == 1 ? "W":"B") + "K";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "King.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		try{if(board[position[0] + 1][position[1] + 1].color != color)  moves[position[0] + 1][position[1] + 1] = true;}    catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0] + 1][position[1] - 1].color != color)  moves[position[0] + 1][position[1] - 1] = true;}    catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0] - 1][position[1] + 1].color != color)  moves[position[0] - 1][position[1] + 1] = true;}    catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0] - 1][position[1] - 1].color != color)  moves[position[0] - 1][position[1] - 1] = true;}    catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0] + 1][position[1]].color != color)moves[position[0] + 1][position[1]] = true;}              catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0] - 1][position[1]].color != color)moves[position[0] - 1][position[1]] = true;}              catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0]][position[1] + 1].color != color)moves[position[0]][position[1] + 1] = true;}              catch(ArrayIndexOutOfBoundsException ignored) {}
		try{if(board[position[0]][position[1] - 1].color != color)moves[position[0]][position[1] - 1] = true;}              catch(ArrayIndexOutOfBoundsException ignored) {}

		return moves;
	}
}
