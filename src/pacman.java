import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class pacman {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pacman window = new pacman();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pacman() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 988, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel(){
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				Graphics2D g2d = (Graphics2D ) g;
				g2d.setBackground(new Color(255, 255, 0));
				g2d.fillOval(530, 635, 50,50);
				g2d.setBackground(new Color(255, 255, 0));
				
				
			}
		};
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(50, 11, 875, 422);
		
		frame.getContentPane().add(panel);
		
	
		
		JPanel panel_1 = new JPanel() ;
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(50, 461, 875, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBounds(351, 11, 89, 23);
		panel_1.add(btnNewButton);
	}
	
	
}
