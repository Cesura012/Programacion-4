import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventanaboton extends JFrame {

	private JPanel panel;
	 public Ventanaboton() {
	      
	        setTitle("Ventana con Botón Aleatorio");
	        setSize(500, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);


	        panel = new JPanel();
	        panel.setLayout(null);
	        panel.setBackground(Color.WHITE);
	        add(panel);
	        panel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                agregarBoton(e.getX(), e.getY());
	            }
	        });
	        
	        addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                Component comp = panel.getComponentAt(e.getPoint());
	                if (comp instanceof JButton) {
	                    JButton boton = (JButton) comp;
	                    ActionListener eliminarBotonListener = new ActionListener() {
	                        @Override
	                        public void actionPerformed(ActionEvent e) {
	                            panel.remove(boton);
	                            panel.revalidate();
	                            panel.repaint();
	                            boton.removeActionListener(this);
	                        }
	                    };
	                    boton.removeActionListener(eliminarBotonListener);
	                    boton.addActionListener(eliminarBotonListener);
	                }
	            }
	        });
	    }
	 
	 private void agregarBoton(int x, int y) {
		 JButton nuevoBoton = new JButton(colorAleatorio().toString());
	        nuevoBoton.setSize(generarTamañoAleatorio(), generarTamañoAleatorio());
	        nuevoBoton.setLocation(x, y);
	        nuevoBoton.setBackground(colorAleatorio());
	        nuevoBoton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null, "Texto del botón: " + nuevoBoton.getText());
	            }
	        });   
	       
	        panel.add(nuevoBoton);
	        panel.revalidate();
	        panel.repaint();
	    }

	private int generarTamañoAleatorio() {
		Random random = new Random();
	    return random.nextInt(151) + 50;
	}
	 
	private Color colorAleatorio() {
		Random random = new Random();
		return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}
	 
	 
	 
	 
	 
	 
}
