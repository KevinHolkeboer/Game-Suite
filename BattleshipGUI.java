import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class BattleshipGUI extends JFrame {

	private JPanel gameBoardPanel;
	BattleshipGameBoard game = new BattleshipGameBoard();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleshipGUI frame = new BattleshipGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BattleshipGUI() {
		setTitle("BATTLESHIP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		gameBoardPanel = new JPanel();
		gameBoardPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(gameBoardPanel);
		gameBoardPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel[][] labelArray = new JLabel[5][5];
		
		for(int i = 0; i < labelArray.length; i++) {
			for(int j = 0; j < labelArray.length; j++) {
				labelArray[i][j] = new JLabel(lblstring(game.board, i, j) + "");
			}
		}
		
	}
	
	public String lblstring(int[][] board, int row, int col) {
		if(game.board[row][col]==-2 || game.board[row][col]==-1) {
			return "~";
		}
		else if(game.board[row][col]==0) {
			return "O";
		}
		else {
			return "X";
		}
	}

}
