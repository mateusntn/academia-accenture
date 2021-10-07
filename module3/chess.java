import java.util.Scanner;

public class chess {
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

		
		imprimirBoard(board);
		boolean exit = false;

		do {
			System.out.println("Locate the pieces on the board using their coordinates separated by a comma.");
			System.out.println("Example: 7.6 to choose part 'n'");
			System.out.println("It is not possible for two pieces to occupy the same position.");
			 
			System.out.print("Choose a piece: ");
			String[] pieceTxt = scanner.nextLine().split(",");
			int pieceX = Integer.parseInt(pieceTxt[0]);
			int pieceY = Integer.parseInt(pieceTxt[1]);
			
			System.out.print("Choose which position the piece should go to: ");
			String[] positionTxt = scanner.nextLine().split(",");
			int positionX = Integer.parseInt(positionTxt[0]);
			int positionY = Integer.parseInt(positionTxt[1]);
			System.out.println("");

			if(board[positionX][positionY].isBlank()){

				board[positionX][positionY] = board[pieceX][pieceY];
				board[pieceX][pieceY] = "";

			}else{				
				exit = true;
			}			
	
			imprimirBoard(board);
		} while (exit == false);
		System.out.println("There is already a piece in the chosen position!");
		System.out.println("Leaving the game...");
		scanner.close();
	}
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {		
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