import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class LoginMamalon {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMamalon window = new LoginMamalon();
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
	public LoginMamalon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(1000,800);
		
	
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // Menú "Cuenta"
        JMenu menuCuenta = new JMenu("Cuenta");
        menuBar.add(menuCuenta);

        JMenuItem menuItemLogin = new JMenuItem("Login");
        menuItemLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
				
				login(frame);
				
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
            }
        });
        menuCuenta.add(menuItemLogin);

        JMenuItem menuItemRegistro = new JMenuItem("Registro");
        menuItemRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
				
				regis(frame);
				
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
            }
        });
        menuCuenta.add(menuItemRegistro);

        JMenuItem menuItemRecuperacion = new JMenuItem("Recuperación de cuenta");
        menuItemRecuperacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recuperacionCuenta();
            }
        });
        menuCuenta.add(menuItemRecuperacion);

        
        // Menú Usuario
        JMenu menuUsuario = new JMenu("Usuarios");
        menuBar.add(menuUsuario);
        
        JMenuItem menuItemAlta = new JMenuItem("Alta");
        menuItemAlta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaCrearUsuario();
            }
        });
        menuUsuario.add(menuItemAlta);

        JMenuItem menuItemBaja = new JMenuItem("Baja");
        menuItemBaja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaAccederSistema();
            }
        });
        menuUsuario.add(menuItemBaja);

        JMenuItem menuItemConsultar = new JMenuItem("Consulta");
        menuItemConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaOlvidarContraseña();
            }
        });
        menuUsuario.add(menuItemConsultar);

        // Menú ayuda
        JMenu menuAyuda = new JMenu("Ayuda");
        menuBar.add(menuAyuda);

        // Opciones del menú "Ayuda"
        JMenuItem menuItemCrearUsuario = new JMenuItem("¿Cómo crear un usuario?");
        menuItemCrearUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaCrearUsuario();
            }
        });
        menuAyuda.add(menuItemCrearUsuario);

        JMenuItem menuItemAccederSistema = new JMenuItem("¿Cómo acceder al sistema?");
        menuItemAccederSistema.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaAccederSistema();
            }
        });
        menuAyuda.add(menuItemAccederSistema);

        JMenuItem menuItemOlvidarContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
        menuItemOlvidarContraseña.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ayudaOlvidarContraseña();
            }
        });
        menuAyuda.add(menuItemOlvidarContraseña);
		
		this.login(frame);
	
	}
	
	public void login(JFrame frame2) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 800, 800);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setBounds(283, 11, 174, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setBounds(286, 52, 140, 30);
		panel.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(285, 93, 119, 48);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(320, 152, 106, 40);
		panel.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(307, 203, 119, 40);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {

	            	 JOptionPane.showMessageDialog(frame, "Error: Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
	        });
		panel.add(btnNewButton);
		btnNewButton.setBounds(128, 312, 119, 52);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crear Cuenta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panel);
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
				
				regis(frame);
			}
		});
		btnNewButton_1.setBounds(458, 312, 174, 59);
		panel.add(btnNewButton_1);
		
	}
	
	public void regis(JFrame frame2) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 974, 539);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Cuenta");
		lblNewLabel.setBounds(306, 14, 158, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setBounds(318, 82, 97, 14);
		panel.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(329, 123, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(131, 157, 82, 14);
		panel.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 195, 133, 48);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Regresar a Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(panel);
				frame.getContentPane().repaint();;
				frame.getContentPane().revalidate();;
				
				login(frame);
			}
		});
		btnNewButton.setBounds(94, 322, 196, 57);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crear Cuenta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(614, 326, 166, 48);
		panel.add(btnNewButton_1); 
		
		JLabel lblNewLabel_3 = new JLabel("Confirmar Contraseña");
		lblNewLabel_3.setBounds(525, 178, 106, 14);
		panel.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(525, 215, 129, 48);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
	}
	
	public void recuperacionCuenta() {
		
	}
	
	public void usuarios() {
		
	}
	
	public void ayudaCrearUsuario() {
		
	}
	
	public void ayudaAccederSistema() {
		
	}
	
	public void ayudaOlvidarContraseña() {
		
	}
	
	
}
