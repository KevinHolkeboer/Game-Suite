package gameCode;

import javax.swing.JFrame;

public class MineSweeper {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("MineSweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MineSweeperPanel panel = new MineSweeperPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
