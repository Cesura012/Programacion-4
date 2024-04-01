import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Factura extends JFrame {
	
	 private JPanel login;
	public Factura() {

		
		//para que se vea
		this.setVisible(true);
		
		// para que se cierre 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para que aparesca en el centro
		this.setLocationRelativeTo(null);
		
		//para que modifique el tamaño
		this.setSize(1000,800);
		
		//para poner titulo
		this.setTitle("Hola ");
		
		
		this.setLayout(null);
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), getHeight());
		//login.setLocation(0, 0);
		login.setLayout(null);
		
		login.setBackground(Color.green);
		
		JLabel title = new JLabel("Registro De Usuarios");
		title.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title.setBackground(Color.decode("#006699"));
		title.setLocation(20, 10);
		title.setSize(220, 40);		
		login.add(title);
		
		login.revalidate();
        login.repaint();
		
		
	}
	
	
	
}
