import java.awt.Graphics;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		
		//para que se vea
		ventana.setVisible(true);
		
		// para que se cierre 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para que aparesca en el centro
		ventana.setLocationRelativeTo(null);
		
		//para que modifique el tamaño
		ventana.setSize(1000,800);
		
		//para poner titulo
		ventana.setTitle("Hola mundo");
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}