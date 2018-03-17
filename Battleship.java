/**
 * @author Seth Pefley
 * CIS 350 - Intro to Software Engineering
 * Runs Battleship game using methods from BattleshipGameBoard.java
 */

import java.util.Scanner;

public class Battleship {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int playAgain = 1;

		while (playAgain != 0) {
			BattleshipGameBoard game = new BattleshipGameBoard();

			while (game.shipsRemaining > 0) {
				game.shoot();
				game.printBoard();
			}

			System.out.println("Congratulations! You won the game in " + game.numShots + " shots.");
			System.out.println("Enter 0 to quit");
			playAgain = input.nextInt();

		}

	}

}
