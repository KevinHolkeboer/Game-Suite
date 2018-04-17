import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameLauncher implements ActionListener{
	JButton simonSays = new JButton("Launch Simon Says");
	
	public static void main(String[] args) {
		
		new GameLauncher();

	}
	
	public GameLauncher() {
		JFrame gameLauncherFrame = new JFrame();
		gameLauncherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel gameLauncherPanel = new JPanel();
		gameLauncherPanel.setLayout(new BoxLayout(gameLauncherPanel, BoxLayout.Y_AXIS));
		
		
		simonSays.addActionListener(this);
		simonSays.setAlignmentX(gameLauncherPanel.CENTER_ALIGNMENT);
		
		gameLauncherPanel.add(simonSays);
		
		gameLauncherFrame.add(gameLauncherPanel);
		gameLauncherFrame.setSize(300, 500);
		
		gameLauncherPanel.setVisible(true);
		gameLauncherFrame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == simonSays) {
			new SimonSaysGUI();
		}
		
	}

}
