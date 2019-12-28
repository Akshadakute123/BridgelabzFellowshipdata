package Com.Bridgelabz.Fellowship.FunctionalProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Tictactoe {
	String board[][];
	final int col = 3;
	final int row = 3;
	String regex = "\\s{3}";

	Tictactoe() {
		board = new String[row][col];
	}

	void initializeboard() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = "   ";
			}
		}
	}

	public void setplay(int i, int j, String player) {
		if (this.board[i][j].matches(regex))
			;
		board[i][j] = " " + player + " ";
	}

	public boolean iswin() {
		for (int i = 0; i < row; i++) {
			if (board[0][i] == "x"&& board[1][i]== "x"&& board[2][i] == "x") {
				return true;
			}
		}
		return false;
/*
		if ((!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
				|| (!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])))
			;
		{
			return true;
		}
*/
	}

	String printboqard() {
		String strboard = "";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j < col - 1) {
					strboard = strboard + board[i][j] + "|";
				} else {
					strboard = strboard + "\n---+---+---\n";
				}
			}

		}
		return strboard;
	}

	public static void main(String[] args) {
		Tictactoe t1 = new Tictactoe();
		String player = "X";
		t1.initializeboard();
		do {
			System.out.println(t1.printboqard());
			System.out.println("enter coordinate for row");
			int row = Utility.integerInput();
			System.out.println("enter coordinate for rcoloumn");
			int col = Utility.integerInput();
			t1.setplay(row, col, player);
			if (t1.iswin()) {
				System.out.println(t1.printboqard() + "\n" + player + "win");
				break;
			}
			if (player == "x")
				player = "o";
			else
				player = "x";
		} while (true);

	}
}
