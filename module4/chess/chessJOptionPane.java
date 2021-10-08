import java.util.Scanner;

import javax.swing.JOptionPane;

public class chessJOptionPane {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		
		printBoard(board);
		boolean exit = false;

		JOptionPane.showMessageDialog(null, "Locate the pieces on the board using their coordinates separated by a comma.\nExample: 7,6 to choose part 'n'\n Warning: It is not possible for two pieces to occupy the same position.");

		do {
			int pieceX;
			int pieceY;

			try {
				String pieceInput = JOptionPane.showInputDialog("Choose a piece: ");
				String[] pieceTxt = pieceInput.split(",");
				pieceX = Integer.parseInt(pieceTxt[0]);
				pieceY = Integer.parseInt(pieceTxt[1]);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Invalid format. You must enter two numbers separated by a comma.", "ERROR" , JOptionPane.ERROR_MESSAGE);
				exit = true;
				break;
			}
			
			
			
			String positionInput = JOptionPane.showInputDialog("Choose which position the piece should go to: ");
			String[] positionTxt = positionInput.split(",");
			int positionX = Integer.parseInt(positionTxt[0]);
			int positionY = Integer.parseInt(positionTxt[1]);
			System.out.println("");

			if(board[positionX][positionY].isBlank()){

				board[positionX][positionY] = board[pieceX][pieceY];
				board[pieceX][pieceY] = "";

			}else{
				JOptionPane.showMessageDialog(null,"There is already a piece in the chosen position!", "Error", JOptionPane.ERROR_MESSAGE);
				exit = true;
			}			
	
			printBoard(board);
		} while (exit == false);		
		JOptionPane.showMessageDialog(null, "Leaving the game...");
		scanner.close();
	}
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void printBoard(String[][] board) {		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+"  ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		System.out.println("");
	}
}