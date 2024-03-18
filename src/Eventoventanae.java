import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventoventanae extends JFrame{
	 private JPanel panelBotones;

	    public Eventoventanae() {
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
			
			
			this.setLayout(new BorderLayout());
			
			panelBotones = new JPanel();
	        panelBotones.setLayout(null);
	        panelBotones.setBackground(Color.green);
	        this.add(panelBotones, BorderLayout.CENTER);

	        JButton botonPrincipal = new JButton("PRESIONAME");
	        botonPrincipal.setFont(new Font("Agency FB", Font.BOLD, 14));
	        botonPrincipal.setBackground(Color.white);
	        botonPrincipal.setBounds(400, 400, 100, 30);
	        botonPrincipal.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                agregarBoton();
	            }
	        });
	        panelBotones.add(botonPrincipal);
	    }

	    public void agregarBoton() {
	        JButton nuevoBoton = new JButton(colorAleatorio().toString());
	        nuevoBoton.setBackground(colorAleatorio());
	        int ancho = generarTamañoAleatorio();
	        int alto = generarTamañoAleatorio();
	        int x = generarCoordenadaX();
	        int y = generarCoordenadaY();
	        nuevoBoton.setBounds(x, y, ancho, alto);
	        nuevoBoton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JButton botonPresionado = (JButton) e.getSource();
	                panelBotones.remove(botonPresionado);
	                panelBotones.revalidate();
	                panelBotones.repaint();
	            }
	        });
	        panelBotones.add(nuevoBoton);
	        panelBotones.revalidate();
	        panelBotones.repaint();
	    }

	    private int generarCoordenadaX() {
	        Random random = new Random();
	        return random.nextInt(panelBotones.getWidth() - 100);
	    }

	    private int generarCoordenadaY() {
	        Random random = new Random();
	        return random.nextInt(panelBotones.getHeight() - 50);
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
