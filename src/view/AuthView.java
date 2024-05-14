package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AuthView extends JFrame implements ActionListener{
	
	
	
	
	
	public AuthView() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("User Login");
		this.setResizable(false);
		this.setLayout(null);
		
		this.login();
	}
	
public void login() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, getHeight());
		login.setLocation(0, 0);
		login.setLayout(null);
		
		login.setBackground(Color.black);
		
		JLabel title = new JLabel("bienvenido al sistema");
		title.setFont(new Font("Agency FB", Font.BOLD, 14));
		title.setBackground(Color.white);
		title.setLocation(150, 10);
		title.setSize(220, 40);
		title.setOpaque(true);
		login.add(title);
		
		JLabel user_tag = new JLabel("correo electronico");
		
		user_tag.setFont(new Font("Agency FB", Font.BOLD, 14)); 
		user_tag.setBackground(Color.white);
		user_tag.setLocation(10, 70);
		user_tag.setSize(100, 30);
		user_tag.setOpaque(true);
		login.add(user_tag);
		
		JTextField c = new JTextField();
		c.setFont(new Font("Agency FB", Font.BOLD, 14));
		c.setBackground(Color.white);
		c.setLocation(10, 110);
		c.setSize(100, 30);
		c.setOpaque(true);
		login.add(c);
		
		JLabel contra = new JLabel("contraseña");
		
		contra.setFont(new Font("Agency FB", Font.BOLD, 14));
		contra.setBackground(Color.red);
		contra.setLocation(10, 150);
		contra.setSize(100, 30);
		contra.setOpaque(true);
		login.add(contra);
		
		JPasswordField pass = new JPasswordField();
		pass.setFont(new Font("Agency FB", Font.BOLD, 14));
		pass.setBackground(Color.white);
		pass.setLocation(10, 190);
		pass.setSize(100, 30);
		pass.setOpaque(true);
		login.add(pass);
		
		JButton acceder = new JButton("Iniciar sesion");
		acceder.setFont(new Font("Agency FB", Font.BOLD, 14));
		acceder.setBackground(Color.white);
		acceder.setLocation(10, 230);
		acceder.setSize(100, 30);
		acceder.setOpaque(true);
		
		acceder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola");
				
				if(c.getText().length()<=0) {
					c.setBorder(new LineBorder(Color.red, 4));
				}else {
					c.setBorder(new LineBorder(Color.green, 4));
				}
				if(pass.getText().length()<=0) {
					pass.setBorder(new LineBorder(Color.red, 4));
				}else {
					pass.setBorder(new LineBorder(Color.green, 4));
				}
				
				System.out.println(c.getText());
				System.out.println(pass.getText());
				
			}
		});
		login.add(acceder);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(getClass().getResource("pez.png")));
		img.setBounds(10, 300, 256, 256);
		img.setOpaque(true);
		img.setBackground(Color.WHITE);
		login.add(img);
		
		
		
		this.add(login);
		this.repaint();
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
