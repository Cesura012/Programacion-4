import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;

public class pacman implements KeyListener {

	private JFrame frame;
	private JPanel panel;
	private pared[] paredes;
	private player jugador;
	private Pastilla[] pastillas;
	private int puntaje = 0;
	private JLabel lblNewLabel_1;	
	private Timer timer; 
	private int tiempoTranscurrido = 0; 
	private JLabel lblTiempo; 
	private Timer bocaTimer;
	private boolean bocaAbierta = false;
	
	 private void inicializarPastillas() {
	        pastillas = new Pastilla[65]; 
	        pastillas[0] = new Pastilla(120, 200, 10);
	        pastillas[1] = new Pastilla(300, 150, 10);
	        pastillas[2] = new Pastilla(150, 150, 10);
	        pastillas[3] = new Pastilla(500, 350, 10);
	        pastillas[4] = new Pastilla(40, 200, 10);
	        pastillas[5] = new Pastilla(40, 150, 10);
	        pastillas[6] = new Pastilla(40, 100, 10);
	        pastillas[7] = new Pastilla(40, 250, 10);
	        pastillas[8] = new Pastilla(40, 300, 10);
	        pastillas[9] = new Pastilla(40, 50, 10);
	        pastillas[10] = new Pastilla(80, 50, 10);
	        pastillas[11] = new Pastilla(120, 50, 10);
	        pastillas[12] = new Pastilla(160, 50, 10);
	        pastillas[13] = new Pastilla(150, 110, 10);
	        pastillas[14] = new Pastilla(120, 250, 10);
	        pastillas[15] = new Pastilla(120, 300, 10);
	        pastillas[16] = new Pastilla(120, 350, 10);
	        pastillas[17] = new Pastilla(450, 350, 10);
	        pastillas[18] = new Pastilla(400, 350, 10);
	        pastillas[19] = new Pastilla(350, 350, 10);
	        pastillas[20] = new Pastilla(300, 350, 10);
	        pastillas[21] = new Pastilla(200, 350, 10);
	        pastillas[22] = new Pastilla(550, 350, 10);
	        pastillas[23] = new Pastilla(600, 350, 10);
	        pastillas[24] = new Pastilla(650, 350, 10);
	        pastillas[25] = new Pastilla(700, 350, 10);
	        pastillas[26] = new Pastilla(300, 300, 10);
	        pastillas[27] = new Pastilla(300, 250, 10);
	        pastillas[28] = new Pastilla(300, 200, 10);
	        pastillas[29] = new Pastilla(250, 100, 10);
	        pastillas[30] = new Pastilla(250, 50, 10);
	        pastillas[31] = new Pastilla(250, 150, 10);
	        pastillas[32] = new Pastilla(200, 150, 10);
	        pastillas[33] = new Pastilla(200, 220, 10);
	        pastillas[34] = new Pastilla(200, 300, 10);
	        pastillas[35] = new Pastilla(300, 50, 10);
	        pastillas[36] = new Pastilla(350, 50, 10);
	        pastillas[37] = new Pastilla(400, 50, 10);
	        pastillas[38] = new Pastilla(450, 50, 10);
	        pastillas[39] = new Pastilla(500, 50, 10);
	        pastillas[40] = new Pastilla(550, 50, 10);
	        pastillas[41] = new Pastilla(600, 50, 10);
	        pastillas[42] = new Pastilla(650, 50, 10);
	        pastillas[43] = new Pastilla(700, 50, 10);
	        pastillas[44] = new Pastilla(750, 50, 10);
	        pastillas[45] = new Pastilla(800, 50, 10);
	        pastillas[46] = new Pastilla(800, 100, 10);
	        pastillas[47] = new Pastilla(800, 150, 10);
	        pastillas[48] = new Pastilla(800, 200, 10);
	        pastillas[49] = new Pastilla(800, 250, 10);
	        pastillas[50] = new Pastilla(800, 300, 10);
	        pastillas[51] = new Pastilla(800, 350, 10);
	        pastillas[52] = new Pastilla(800, 400, 10);
	        pastillas[53] = new Pastilla(800, 450, 10);
	        pastillas[54] = new Pastilla(650, 300, 10);
	        pastillas[55] = new Pastilla(750, 400, 10);
	        pastillas[56] = new Pastilla(750, 350, 10);
	        pastillas[57] = new Pastilla(750, 300, 10);
	        pastillas[58] = new Pastilla(750, 450, 10);
	        pastillas[59] = new Pastilla(750, 250, 10);
	        pastillas[60] = new Pastilla(650, 250, 10);
	        pastillas[61] = new Pastilla(650, 200, 10);
	        pastillas[62] = new Pastilla(650, 150, 10);
	        pastillas[63] = new Pastilla(650, 100, 10);
	        pastillas[64] = new Pastilla(600, 100, 10);
	       
	       
	        
	        
	       
	    }
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
		
		
		
		paredes = new pared[20]; 
	        paredes[0] = new pared(0, 0, 20, 400, " ");
	        paredes[1] = new pared(0, 0, 855, 20, " ");
	        paredes[2] = new pared(855, 0, 20, 180, " ");
	        paredes[3] = new pared(855, 250, 20, 150, " ");
	        paredes[4] = new pared(80, 380, 780, 20, " ");
	        paredes[5] = new pared(80, 200, 20, 180, " ");
	        paredes[6] = new pared(80, 70, 20, 80, " ");
	        paredes[7] = new pared(200, 20, 20, 80, " ");
	        paredes[8] = new pared(160, 180, 80, 20, " ");
	        paredes[9] = new pared(160, 250, 80, 20, " ");
	        //cuadrado de middle
	        paredes[10] = new pared(350, 150, 20, 150, " ");
	        paredes[11] = new pared(350, 150, 100, 20, " ");
	        paredes[12] = new pared(350, 300, 250, 20, " ");
	        paredes[13] = new pared(580, 150, 20, 150, " ");
	        paredes[14] = new pared(500, 150, 100, 20, " ");
	        ////////////
	        paredes[15] = new pared(240, 350, 20, 50, " ");
	        paredes[16] = new pared(240, 350, 20, 50, " ");
	        paredes[17] = new pared(300, 70, 100, 20, " ");
	        paredes[18] = new pared(470, 70, 100, 20, " ");
	        paredes[19] = new pared(720, 70, 20, 120, " ");
	        
	    jugador = new player(450, 250, 35, 35);

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 988, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		 panel = new JPanel() {
			
			private void dibujarParedes(Graphics g) {
		        for (pared p : paredes) {
		            g.setColor(Color.blue);
		            g.fillRect(p.getX(), p.getY(), p.getA(), p.getL());
		        }
		    }
			
			


		    @Override
		    public void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        dibujarParedes(g);
		        dibujarPastillas(g);
		  
		        g.setColor(Color.yellow);
		        if (bocaAbierta) { 
		            g.fillArc(jugador.getX(), jugador.getY(), jugador.getA(), jugador.getL(), 45, 270);
		        } else {
		            g.fillOval(jugador.getX(), jugador.getY(), jugador.getA(), jugador.getL());
		        }
		    
		     
		    }
		};
		frame.getContentPane().add(panel);
		panel.setFocusable(true); 
		panel.addKeyListener(new KeyAdapter() {
			@Override
		
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() == 'd'|| e.getKeyChar() == 'D') {
					jugador.x+=5;
					panel.repaint(); 
				}else if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					jugador.y-=5;
					panel.repaint();
				}else if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					jugador.x-=5;
					panel.repaint();
				}else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					jugador.y+=5;
					panel.repaint();
				}
				detectarColisionesConPastillas();
				
				panel.update(panel.getGraphics() );
			}
			
			
			
			@Override
		    public void keyPressed(KeyEvent e) {
				 char keyPressed = Character.toUpperCase(e.getKeyChar()); 
				    
				 
				    int jugadorAnteriorX = jugador.x;
				    int jugadorAnteriorY = jugador.y;
				    
				
				    if (keyPressed == 'D') {
				        jugador.x += 5;
				        if (jugador.x >= 865) {
				        	System.out.println("se apso");
				            jugador.x = 30;
				            jugador.y= 370;
				        }
				    } else if (keyPressed == 'W') {
				        jugador.y -= 5;
				    } else if (keyPressed == 'A') {
				        jugador.x -= 5;
				    } else if (keyPressed == 'S') {
				        jugador.y += 5;
				        if (jugador.y >= 395) {
				            jugador.x = 865; 
				            jugador.y= 200;
				        }
				    }
				    
				    for (pared p : paredes) {
				        if (p.colision(p.getX(), p.getY(), p.getA(), p.getL(), jugador.x, jugador.y, jugador.a, jugador.l)) {
				           
				            jugador.x = jugadorAnteriorX;
				            jugador.y = jugadorAnteriorY;
				         //x=50 y=395   
				        //x=870 y200
				            if (keyPressed == 'D') {
				                jugador.x -= 5;
				            } else if (keyPressed == 'W') {
				                jugador.y += 5;
				            } else if (keyPressed == 'A') {
				                jugador.x += 5;
				            } else if (keyPressed == 'S') {
				                jugador.y -= 5;
				            }
				            
				            System.out.println("Colisión detectada con la pared en (" + p.getX() + ", " + p.getY() + ").");
				            break; 
				        }
				    }
				    
				    panel.repaint();
		    }

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
		});
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(50, 29, 875, 398);
		

		panel.setLayout(null);
		
		
	
		
		JPanel panel_1 = new JPanel() ;
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(50, 461, 875, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBounds(351, 11, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	jugador.x=450;
	            	jugador.y=250;
	            	 panel.requestFocusInWindow();
	            	 reiniciarPastillas();
	            	 tiempoTranscurrido = 0;
	                 actualizarTiempo();
	                 panel.repaint();

	            }
	        });
		panel_1.add(btnNewButton);
		
		
		
		lblNewLabel_1 = new JLabel("Puntuaje:" + puntaje);
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setBounds(510, 15, 78, 14);
		panel_1.add(lblNewLabel_1);
		
	    lblTiempo = new JLabel("tiempo:" + tiempoTranscurrido + " segundos");
	    lblTiempo.setForeground(new Color(0, 255, 0));
	    lblTiempo.setBounds(106, 15, 160, 20);
		panel_1.add(lblTiempo);
		
		
		timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoTranscurrido++; 
                actualizarTiempo();
              
            }
        });
		timer.start();
		
		
		
		inicializarPastillas();
		inicializarBocaTimer();

	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	private void dibujarPastillas(Graphics g) {
        for (Pastilla pastilla : pastillas) {
            if (pastilla.isVisible()) {
                g.setColor(Color.green);
                g.fillOval(pastilla.getX(), pastilla.getY(), pastilla.getDiametro(), pastilla.getDiametro());
            }
        }
    }
	
	 private void detectarColisionesConPastillas() {
	        for (Pastilla pastilla : pastillas) {
	            if (pastilla.isVisible() && jugador.getX() < pastilla.getX() + pastilla.getDiametro()
	                    && jugador.getX() + jugador.getA() > pastilla.getX()
	                    && jugador.getY() < pastilla.getY() + pastilla.getDiametro()
	                    && jugador.getY() + jugador.getL() > pastilla.getY()) {
	                pastilla.setVisible(false); 
	                puntaje++; 
	            //    String puntajeStr = Integer.toString(puntaje); // Convertir int a String
	                lblNewLabel_1.setText("Puntaje: " + puntaje);
	                System.out.println("Puntaje: " + puntaje);
	            }
	        }
	    }
	 
	 private void reiniciarPastillas() {
	        for (Pastilla pastilla : pastillas) {
	            pastilla.setVisible(true); 
	        }
	        puntaje = 0; 
	        lblNewLabel_1.setText("Puntaje: " + puntaje);
	    }
	 
	 private void actualizarTiempo() {
		 tiempoTranscurrido++;
		 
	        lblTiempo.setText("Tiempo: " + tiempoTranscurrido + " segundos");
	    }
	 private void inicializarBocaTimer() {
		    bocaTimer = new Timer(500, new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            cambiarEstadoBoca(); // Llama al método para cambiar el estado de la boca
		            panel.repaint(); // Repinta el panel para actualizar la representación gráfica del jugador
		        }
		    });
		    bocaTimer.start(); // Inicia el temporizador
		}

	    // Método para cambiar el estado de la boca entre abierto y cerrado
	    private void cambiarEstadoBoca() {
	        bocaAbierta = !bocaAbierta; // Cambia el estado de la boca
	    }
	 
}
