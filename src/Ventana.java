import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {//><

	public Ventana() {

		
		//para que se vea
		this.setVisible(true);
		
		// para que se cierre 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para que aparesca en el centro
		this.setLocationRelativeTo(null);
		
		//para que modifique el tamaño
		this.setSize(1000,1200);
		
		//para poner titulo
		this.setTitle("Hola mundo");
		
		
		this.setLayout(null);
		this.loadcomponents();
	}

	public void loadcomponents() {
		
		//this.login();
	//	this.registro();
		//this.admin();
		//this.calculadora();
		//this.loginm();
		//this.calculadora2();
		//this.interes();
		//this.ru();
		//this.paint(null);
		this.factura();
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
	
	public void registro() {
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, getHeight());;
		registro.setLocation(this.getWidth()/2, 0);
		registro.setLayout(null);
		
		registro.setBackground(Color.PINK);
		JLabel titleR = new JLabel("               Registro :");
		titleR.setFont(new Font("Agency FB", Font.BOLD, 14));
		titleR.setBackground(Color.white);
		titleR.setLocation(120, 10);
		titleR.setSize(220, 40);
		titleR.setOpaque(true);
		registro.add(titleR);
		
		JLabel name_tag = new JLabel("Nombre del Personaje: ");
		
		name_tag.setFont(new Font("Agency FB", Font.BOLD, 14));
		//name_tag.setBackground(Color.white);
		name_tag.setLocation(10, 70);
		name_tag.setSize(100, 30);
		//	name_tag.setOpaque(true);
		registro.add(name_tag);
		
		JTextField name = new JTextField();
		name.setBounds(8, 95, 280, 35);
		registro.add(name);
		
		
		JRadioButton type = new JRadioButton("Paladin");
		type.setBounds(10, 150, 70, 35);
		type.setOpaque(false);
		registro.add(type);
		
		JRadioButton type2 = new JRadioButton("mago");
		type2.setBounds(100, 150, 70, 35);
		type2.setOpaque(false);
		registro.add(type2);
		
		JRadioButton type3 = new JRadioButton("ladron");
		type3.setBounds(190, 150, 70, 35);
		type3.setOpaque(false);
		registro.add(type3);
		
		JRadioButton type4 = new JRadioButton("sanador");
		type4.setBounds(270, 150, 90, 35);
		type4.setOpaque(false);
		registro.add(type4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(type);
		grupo.add(type2);
		grupo.add(type3);
		grupo.add(type4);
		
		
		JCheckBox gusto1 = new JCheckBox ("espada");
		gusto1.setBounds(10, 240, 80, 35);
		gusto1.setOpaque(false);
		registro.add(gusto1);
		
		JCheckBox gusto2 = new JCheckBox ("hacha");
		gusto2.setBounds(100, 240, 80, 35);
		gusto2.setOpaque(false);
		registro.add(gusto2);
		
		JCheckBox gusto3 = new JCheckBox ("baston");
		gusto3.setBounds(190, 240, 70, 35);
		gusto3.setOpaque(false);
		registro.add(gusto3);
		
		JCheckBox gusto4 = new JCheckBox ("daga");
		gusto4.setBounds(270, 240, 90, 35);
		gusto4.setOpaque(false);
		registro.add(gusto4);
		
		JLabel bio_tag = new JLabel("transfondo del personaje : ");
		
		bio_tag.setFont(new Font("Agency FB", Font.BOLD, 14));
		bio_tag.setLocation(10, 280);
		bio_tag.setSize(150, 80);
		registro.add(bio_tag);
		
		JTextArea bio = new JTextArea(10,10);
		bio.setLocation(10, 330);
		bio.setSize(350, 100);
		registro.add(bio);
		
		JLabel vives_tag = new JLabel("donde vives: ");
		
		vives_tag.setFont(new Font("Agency FB", Font.BOLD, 14));
		vives_tag.setLocation(10, 350);
		vives_tag.setSize(100, 30);
		registro.add(vives_tag);
		
		String Razas[] = { "Humano" ,"Draconiano" , "Enano" , "Alien"};
		
		JComboBox cajita = new JComboBox(Razas);
		cajita.setLocation(10, 450);
		cajita.setSize(100, 50);
		registro.add(cajita);
		
		JButton register_btn = new JButton("Guardar");
		register_btn.setBounds(50, 550, 100, 50);
		
		register_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola");
				
				if(name.getText().length()<=0) {
					name.setBorder(new LineBorder(Color.red, 4));
				}else {
					name.setBorder(new LineBorder(Color.green, 4));
				}
				
				if(type.isSelected() == false && type2.isSelected() == false && type3.isSelected() == false && type4.isSelected() == false ) {
					type.setBorderPainted(true);
					type.setBorder(new LineBorder(Color.RED, 4));
					
					type2.setBorderPainted(true);
					type2.setBorder(new LineBorder(Color.RED, 4));
					
					type3.setBorderPainted(true);
					type3.setBorder(new LineBorder(Color.RED, 4));
					
					type4.setBorderPainted(true);
					type4.setBorder(new LineBorder(Color.RED, 4));
				}else {
					type.setBorderPainted(true);
					type.setBorder(new LineBorder(Color.GREEN, 4));
					
					type2.setBorderPainted(true);
					type2.setBorder(new LineBorder(Color.GREEN, 4));
					
					type3.setBorderPainted(true);
					type3.setBorder(new LineBorder(Color.GREEN, 4));
					
					type4.setBorderPainted(true);
					type4.setBorder(new LineBorder(Color.GREEN, 4));
				}
				
				if(bio.getText().length()<=0) {
					bio.setBorder(new LineBorder(Color.red, 4));
				}else {
					bio.setBorder(new LineBorder(Color.green, 4));
				}
				
				if(gusto1.isSelected() == false && gusto2.isSelected() == false && gusto3.isSelected() == false && gusto4.isSelected() == false ) {
					gusto1.setBorderPainted(true);
					gusto1.setBorder(new LineBorder(Color.RED, 4));
					
					gusto2.setBorderPainted(true);
					gusto2.setBorder(new LineBorder(Color.RED, 4));
					
					gusto3.setBorderPainted(true);
					gusto3.setBorder(new LineBorder(Color.RED, 4));
					
					gusto4.setBorderPainted(true);
					gusto4.setBorder(new LineBorder(Color.RED, 4));
				}else {
					gusto1.setBorderPainted(true);
					gusto1.setBorder(new LineBorder(Color.GREEN, 4));
					
					gusto2.setBorderPainted(true);
					gusto2.setBorder(new LineBorder(Color.GREEN, 4));
					
					gusto3.setBorderPainted(true);
					gusto3.setBorder(new LineBorder(Color.GREEN, 4));
					
					gusto4.setBorderPainted(true);
					gusto4.setBorder(new LineBorder(Color.GREEN, 4));
				}
			
				
				System.out.println(name.getText());
				System.out.println(bio.getText());
				
			}
		});
		
		
		
		
		
		
		
		
		
		registro.add(register_btn);
		
		JMenuBar Barra = new JMenuBar();
		JMenu lista1 = new JMenu("Archivo");
		JMenuItem option1 = new JMenuItem("Abrir");
		JMenuItem option2 = new JMenuItem("Nuevo");
		
		Barra.add(lista1);
		lista1.add(option1);
		lista1.add(option2);
		
		this.setJMenuBar(Barra);
		
		
		
		
		this.add(registro);
		this.repaint();
	}
	
	public void admin() {
		JPanel admin_panel = new JPanel();
		admin_panel.setSize(this.getWidth(), getHeight());;
		admin_panel.setLocation(0, 0);
		admin_panel.setLayout(null);
		admin_panel.setBackground(Color.cyan);
		
		JLabel user_tag = new JLabel("usuarios",0) ;
		user_tag.setBounds(350, 20, 350, 60);
		user_tag.setFont(new Font("SignPainter", Font.ITALIC, 80));
		user_tag.setOpaque(false);
		user_tag.setBackground(Color.red);
		admin_panel.add(user_tag);
		
		//Widget
		
		JLabel Widget_tittle = new JLabel("usuario",0) ;
		Widget_tittle.setBounds(40, 120, 300, 80);
		Widget_tittle.setFont(new Font("SignPainter", Font.CENTER_BASELINE, 40));
		Widget_tittle.setForeground(Color.black);
		Widget_tittle.setBackground(Color.black);
		admin_panel.add(Widget_tittle);
		
		JLabel Widget_text = new JLabel("go",0) ;
		Widget_text.setBounds(40, 190, 300, 80);
		Widget_text.setFont(new Font("SignPainter", Font.BOLD, 300));
		Widget_text.setForeground(Color.white);
		Widget_text.setBackground(Color.black);
		admin_panel.add(Widget_text);
		
		JLabel Widget = new JLabel("") ;
		Widget.setBounds(40, 120, 300, 80);
		Widget.setOpaque(false);
		Widget.setBackground(Color.black);
		admin_panel.add(Widget);
		
		JButton add_user = new JButton("Añadir");
		add_user.setBounds(880, 200, 80, 40);
		admin_panel.add(add_user);
		
		JButton download_user = new JButton("Añadir");
		download_user.setBounds(790, 200, 80, 40);
		admin_panel.add(download_user);
		
		String titles[] = {"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"};
		String data[][] = {
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
				{"nombre", "apellidos", "No Control", "correo electronico","semestre", "carrera", "acciones"},
		};
		
		JTable table = new JTable(data,titles);
		/*table.setBounds(40, 260, 920, 300);
		table.setOpaque(true);
		table.setForeground(Color.white);
		table.setBackground((Color.black));
		admin_panel.add(table);*/
		
		JScrollPane table_scroll = new JScrollPane(table);
		table_scroll.setBounds(40, 260, 920, 300);
		table_scroll.setForeground(Color.white);
		table_scroll.setBackground((Color.black));
		admin_panel.add(table_scroll);
		
		
		
		
				
		
		
	/*	JLabel table = new  JLabel();
		table.setBounds(40, 260, 920, 300);
		table.setOpaque(true);
		table.setBackground((Color.black));
		admin_panel.add(table);*/
		
		this.add(admin_panel);
		this.repaint();
		
		
		
	}

	public void calculadora() {
		
			JPanel calcu_panel = new JPanel();
			calcu_panel.setSize(this.getWidth(), getHeight());;
			calcu_panel.setLocation(0, 0);
			calcu_panel.setLayout(null);
			calcu_panel.setBackground(Color.GRAY);
			
			
			JTextField calculation = new JTextField();
			calculation.setBounds(50, 140, 350, 60);
			calcu_panel.add(calculation);
			
			JButton uno = new JButton("1");
			uno.setFont(new Font("Agency FB", Font.BOLD, 14));
			uno.setBackground(Color.white);
			uno.setLocation(10, 230);
			uno.setSize(100, 30);
			uno.setOpaque(true);
			calcu_panel.add(uno);
			
			JButton dos = new JButton("2");
			dos.setFont(new Font("Agency FB", Font.BOLD, 14));
			dos.setBackground(Color.white);
			dos.setLocation(120, 230);
			dos.setSize(100, 30);
			dos.setOpaque(true);
			calcu_panel.add(dos);
			
			JButton tres = new JButton("3");
			tres.setFont(new Font("Agency FB", Font.BOLD, 14));
			tres.setBackground(Color.white);
			tres.setLocation(240, 230);
			tres.setSize(100, 30);
			tres.setOpaque(true);
			calcu_panel.add(tres);
			
			JButton divi = new JButton("/");
			divi.setFont(new Font("Agency FB", Font.BOLD, 14));
			divi.setBackground(Color.white);
			divi.setLocation(350, 230);
			divi.setSize(100, 30);
			divi.setOpaque(true);
			calcu_panel.add(divi);
		
			JButton cuatro = new JButton("4");
			cuatro.setFont(new Font("Agency FB", Font.BOLD, 14));
			cuatro.setBackground(Color.white);
			cuatro.setLocation(10, 270);
			cuatro.setSize(100, 30);
			cuatro.setOpaque(true);
			calcu_panel.add(cuatro);
			
			JButton cinco = new JButton("5");
			cinco.setFont(new Font("Agency FB", Font.BOLD, 14));
			cinco.setBackground(Color.white);
			cinco.setLocation(120, 270);
			cinco.setSize(100, 30);
			cinco.setOpaque(true);
			calcu_panel.add(cinco);
			
			JButton seis = new JButton("6");
			seis.setFont(new Font("Agency FB", Font.BOLD, 14));
			seis.setBackground(Color.white);
			seis.setLocation(240, 270);
			seis.setSize(100, 30);
			seis.setOpaque(true);
			calcu_panel.add(seis);
			
			JButton multi = new JButton("*");
			multi.setFont(new Font("Agency FB", Font.BOLD, 14));
			multi.setBackground(Color.white);
			multi.setLocation(350, 270);
			multi.setSize(100, 30);
			multi.setOpaque(true);
			calcu_panel.add(multi);
			
			JButton siete = new JButton("7");
			siete.setFont(new Font("Agency FB", Font.BOLD, 14));
			siete.setBackground(Color.white);
			siete.setLocation(10, 310);
			siete.setSize(100, 30);
			siete.setOpaque(true);
			calcu_panel.add(siete);
			
			JButton ocho = new JButton("8");
			ocho.setFont(new Font("Agency FB", Font.BOLD, 14));
			ocho.setBackground(Color.white);
			ocho.setLocation(120, 310);
			ocho.setSize(100, 30);
			ocho.setOpaque(true);
			calcu_panel.add(ocho);
			
			JButton nueve = new JButton("9");
			nueve.setFont(new Font("Agency FB", Font.BOLD, 14));
			nueve.setBackground(Color.white);
			nueve.setLocation(240, 310);
			nueve.setSize(100, 30);
			nueve.setOpaque(true);
			calcu_panel.add(nueve);
			
			JButton resta = new JButton("-");
			resta.setFont(new Font("Agency FB", Font.BOLD, 14));
			resta.setBackground(Color.white);
			resta.setLocation(350, 310);
			resta.setSize(100, 30);
			resta.setOpaque(true);
			calcu_panel.add(resta);
			
			JButton cero = new JButton("0");
			cero.setFont(new Font("Agency FB", Font.BOLD, 14));
			cero.setBackground(Color.white);
			cero.setLocation(10, 350);
			cero.setSize(100, 30);
			cero.setOpaque(true);
			calcu_panel.add(cero);
			
			JButton punto = new JButton(".");
			punto.setFont(new Font("Agency FB", Font.BOLD, 14));
			punto.setBackground(Color.white);
			punto.setLocation(120, 350);
			punto.setSize(100, 30);
			punto.setOpaque(true);
			calcu_panel.add(punto);
			
			JButton suma = new JButton("+");
			suma.setFont(new Font("Agency FB", Font.BOLD, 14));
			suma.setBackground(Color.white);
			suma.setLocation(240, 350);
			suma.setSize(100, 30);
			suma.setOpaque(true);
			calcu_panel.add(suma);
			
			JButton igual = new JButton("=");
			igual.setFont(new Font("Agency FB", Font.BOLD, 14));
			igual.setBackground(Color.white);
			igual.setLocation(350, 350);
			igual.setSize(100, 30);
			igual.setOpaque(true);
			calcu_panel.add(igual);
			
			this.add(calcu_panel);
			this.repaint();
	}

	public void loginm() {
		
		
		JPanel panelf = new JPanel();
		
		panelf.setSize(this.getWidth(), this.getHeight());
		panelf.setLocation(0, 0);
		panelf.setLayout(null);
		panelf.setBackground(Color.decode("#2b488a"));
		
		JLabel titleLogin = new JLabel("User Login", SwingConstants.CENTER);;
		titleLogin.setFont(new Font("Segoe UI Black", Font.ITALIC, 40));
		titleLogin.setForeground(Color.decode("#ffffff"));
		titleLogin.setLocation(200, 20);
		titleLogin.setSize(300, 60);
		panelf.add(titleLogin);
		
		JPanel panela = new JPanel();
		
		panela.setSize(600, 370);
		panela.setLocation(45, 120);
		panela.setLayout(null);
		panela.setBackground(Color.decode("#23396c"));
		this.add(panela);
		
		JLabel title = new JLabel("My Account", SwingConstants.CENTER);
		title.setFont(new Font("Segoe UI Black", Font.ITALIC, 50));
		title.setForeground(Color.decode("#e0ca7c"));
		title.setLocation(120, 20);
		title.setSize(350, 70);
		panela.add(title);
		
		JLabel titleUsername = new JLabel("Enter Your Username", SwingConstants.CENTER);
		titleUsername.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titleUsername.setForeground(Color.decode("#ffffff"));
		titleUsername.setLocation(100, 110);
		titleUsername.setSize(170, 30);
		panela.add(titleUsername);
			
		JTextField user_field = new JTextField();
		user_field.setSize(390, 40);
		user_field.setLocation(110, 150);;
		panela.add(user_field);
		
		JLabel titlePassword = new JLabel("Enter Your Password", SwingConstants.CENTER);
		titlePassword.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titlePassword.setForeground(Color.decode("#ffffff"));
		titlePassword.setLocation(100, 210);
		titlePassword.setSize(170, 30);
		panela.add(titlePassword);
		
		JTextField password_field = new JTextField();
		password_field.setSize(390, 40);
		password_field.setLocation(110, 250);;
		panela.add(password_field);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
		loginBtn.setBackground(Color.decode("#e9cc68"));
		loginBtn.setSize(200, 50);;
		loginBtn.setLocation(200, 310);;
		panela.add(loginBtn);
		
		JLabel titlehave = new JLabel("Dont have a account?", SwingConstants.CENTER);
		titlehave.setFont(new Font("Segoe UI Black", Font.ITALIC, 15));
		titlehave.setForeground(Color.decode("#ffffff"));
		titlehave.setLocation(250, 510);
		titlehave.setSize(170, 30);
		panelf.add(titlehave);
		
		JButton upBtn = new JButton("Sing Up");
		upBtn.setFont(new Font("Segoe UI Black", Font.ITALIC, 20));
		upBtn.setBackground(Color.decode("#e9cc68"));
		upBtn.setSize(200, 50);;
		upBtn.setLocation(250, 550);;
		panelf.add(upBtn);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		img.setBounds(50, 170, 50, 100);
		img.setOpaque(true);
		img.setBackground(Color.WHITE);
		panela.add(img);
	
		this.add(panelf);
		this.repaint();

	}

	public void calculadora2() {
		this.setSize(800, 650);
		
		JPanel calculadora2 = new JPanel();
		calculadora2.setSize(this.getWidth(), getHeight());
	//	calculadora2.setLocation(0, 0);
		calculadora2.setLayout(new BorderLayout());
		
		calculadora2.setBackground(Color.black);
		
		JLabel input = new JLabel("20.00");
		input.setFont(new Font("Agency FB", Font.BOLD, 40));
		input.setBackground(Color.white);
		input.setOpaque(true);
		calculadora2.add(input, BorderLayout.NORTH);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,4));
		botones.setBackground(Color.green);
		calculadora2.add(botones, BorderLayout.CENTER);
		
		String btn_text[]= {"9","8","7","6","5","4","3","2","1","0",".","+"};
		
		for(int i=0;i<btn_text.length;i++) {
			botones.add(new JButton(btn_text[i]));
		}
		
		JPanel action = new JPanel();
		
		action.setLayout(new GridLayout(5,1));
		action.setBackground(Color.GREEN);
		action.setBorder(null);
		calculadora2.add(action, BorderLayout.EAST);
		
		String action_text[]= {"CE","*","/","-","="};
		
		for(int i=0;i<action_text.length;i++) {
			action.add(new JButton(action_text[i]));
			
			
		
			
		}
		
				
		

		this.add(calculadora2);
		this.repaint();
	}

	public void interes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), getHeight());
		//login.setLocation(0, 0);
		login.setLayout(null);
		
		login.setBackground(Color.white);
		
		JLabel title = new JLabel("Interes");
		title.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title.setBackground(Color.red);
		title.setLocation(20, 10);
		title.setSize(220, 40);		
		login.add(title);
		
		JPanel calcu = new JPanel();
		
		calcu.setSize(600, 370);
		calcu.setLocation(20, 50);
		calcu.setLayout(null);
		calcu.setBackground(Color.GREEN);
		this.add(calcu);
		
		JLabel title2 = new JLabel("Calcular interes");
		title2.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 20));
		title2.setBackground(Color.red);
		title2.setLocation(20,1);
		title2.setSize(220, 20);				
		calcu.add(title2);
		
		JPanel calcu2 = new JPanel();
		
		calcu2.setSize(580, 340);
		calcu2.setLocation(10, 20);
		calcu2.setLayout(null);
		calcu2.setBackground(Color.decode("#99FF99"));
		calcu.add(calcu2);
		
		JLabel capital = new JLabel("Calcular capital:");
		capital.setFont(new Font("Agency FB", Font.BOLD, 20));
		capital.setBackground(Color.black);
		capital.setLocation(50,30);
		capital.setSize(220, 20);	
		calcu2.add(capital);
		
		JTextField c = new JTextField();
		c.setFont(new Font("Agency FB", Font.BOLD, 14));
		c.setBackground(Color.white);
		c.setLocation(180, 30);
		c.setSize(200, 30);
		c.setOpaque(true);
		calcu2.add(c);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(new Font("Agency FB", Font.BOLD, 20));
		tiempo.setBackground(Color.black);
		tiempo.setLocation(50,90);
		tiempo.setSize(220, 20);	
		calcu2.add(tiempo);
		
		JTextField t = new JTextField();
		t.setFont(new Font("Agency FB", Font.BOLD, 14));
		t.setBackground(Color.white);
		t.setLocation(180, 90);
		t.setSize(200, 30);
		t.setOpaque(true);
		calcu2.add(t);
		
		JLabel tasa = new JLabel("Tasa de interes:");
		tasa.setFont(new Font("Agency FB", Font.BOLD, 20));
		tasa.setBackground(Color.black);
		tasa.setLocation(50,150);
		tasa.setSize(220, 20);	
		calcu2.add(tasa);
		
		JTextField i = new JTextField();
		i.setFont(new Font("Agency FB", Font.BOLD, 14));
		i.setBackground(Color.white);
		i.setLocation(180, 150);
		i.setSize(200, 30);
		i.setOpaque(true);
		calcu2.add(i);
		
		JButton Btn1 = new JButton("Calcular");
		Btn1.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn1.setBackground(Color.decode("#e9cc68"));
		Btn1.setSize(150, 50);;
		Btn1.setLocation(80, 200);;
		calcu2.add(Btn1);
		
		JButton Btn2 = new JButton("Cancelar");
		Btn2.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn2.setBackground(Color.decode("#e9cc68"));
		Btn2.setSize(150, 50);;
		Btn2.setLocation(240, 200);;
		calcu2.add(Btn2);
		
		JPanel rosa = new JPanel();
		
		rosa.setSize(600, 170);
		rosa.setLocation(20, 450);
		rosa.setLayout(null);
		rosa.setBackground(Color.decode("#FF9999"));
		this.add(rosa);
		
		JLabel Interes = new JLabel("Interes:");
		Interes.setFont(new Font("Agency FB", Font.TYPE1_FONT, 20));
		Interes.setBackground(Color.black);
		Interes.setLocation(50,30);
		Interes.setSize(220, 20);	
		rosa.add(Interes);
		
		JTextField inte = new JTextField();
		inte.setFont(new Font("Agency FB", Font.BOLD, 14));
		inte.setBackground(Color.white);
		inte.setLocation(180, 30);
		inte.setSize(200, 30);
		inte.setOpaque(true);
		rosa.add(inte);
		
		JLabel monto = new JLabel("Monto:");
		monto.setFont(new Font("Agency FB", Font.TYPE1_FONT, 20));
		monto.setBackground(Color.black);
		monto.setLocation(50,90);
		monto.setSize(220, 20);	
		rosa.add(monto);
		
		JTextField mon = new JTextField();
		mon.setFont(new Font("Agency FB", Font.BOLD, 14));
		mon.setBackground(Color.white);
		mon.setLocation(180, 90);
		mon.setSize(200, 30);
		mon.setOpaque(true);
		rosa.add(mon);
		
		
		
		
		this.add(login);
		this.repaint();
		
		
		
	}

	public void ru() {

		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), getHeight());
		//login.setLocation(0, 0);
		login.setLayout(null);
		
		login.setBackground(Color.green);
		
		JLabel title = new JLabel("Registro De Usuarios");
		title.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title.setBackground(Color.red);
		title.setLocation(20, 10);
		title.setSize(220, 40);		
		login.add(title);
		
		JPanel calcu = new JPanel();
		
		calcu.setSize(530, 410);
		calcu.setLocation(20, 50);
		calcu.setLayout(null);
		calcu.setBackground(Color.cyan);
		this.add(calcu);
		
		JLabel title2 = new JLabel("Datos Generales");
		title2.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 20));
		title2.setBackground(Color.red);
		title2.setLocation(20,1);
		title2.setSize(220, 20);				
		calcu.add(title2);
		
		JPanel calcu2 = new JPanel();
		
		calcu2.setSize(500, 380);
		calcu2.setLocation(10, 20);
		calcu2.setLayout(null);
		calcu2.setBackground(Color.decode("#66FFCC"));
		calcu.add(calcu2);
		
		JLabel nombres = new JLabel("Nombres:");
		nombres.setFont(new Font("Agency FB", Font.BOLD, 20));
		nombres.setBackground(Color.black);
		nombres.setLocation(90,30);
		nombres.setSize(220, 20);	
		calcu2.add(nombres);
		
		JTextField c = new JTextField();
		c.setFont(new Font("Agency FB", Font.BOLD, 14));
		c.setBackground(Color.white);
		c.setLocation(180, 30);
		c.setSize(200, 30);
		c.setOpaque(true);
		calcu2.add(c);
		
		JLabel ap = new JLabel("Apellido Paterno:");
		ap.setFont(new Font("Agency FB", Font.BOLD, 20));
		ap.setBackground(Color.black);
		ap.setLocation(50,90);
		ap.setSize(220, 20);	
		calcu2.add(ap);
		
		JTextField t = new JTextField();
		t.setFont(new Font("Agency FB", Font.BOLD, 14));
		t.setBackground(Color.white);
		t.setLocation(180, 90);
		t.setSize(200, 30);
		t.setOpaque(true);
		calcu2.add(t);
		
		JLabel am = new JLabel("Apellido Materno:");
		am.setFont(new Font("Agency FB", Font.BOLD, 20));
		am.setBackground(Color.black);
		am.setLocation(50,150);
		am.setSize(220, 20);	
		calcu2.add(am);
		
		JTextField i = new JTextField();
		i.setFont(new Font("Agency FB", Font.BOLD, 14));
		i.setBackground(Color.white);
		i.setLocation(180, 150);
		i.setSize(200, 30);
		i.setOpaque(true);
		calcu2.add(i);
		
		JLabel f = new JLabel("Fecha De Cumpleaños:");
		f.setFont(new Font("Agency FB", Font.BOLD, 20));
		f.setBackground(Color.black);
		f.setLocation(20,210);
		f.setSize(220, 20);	
		calcu2.add(f);
		
		String dia[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12" , "13" ,"14" , "15" , "16" , "17" ,"18" , "19" , "20" , "21" ,"22" , "23" , "24" , "25" ,"26" , "27" , "28" , "29" ,"30" , "31"};
		
		JComboBox cajitad = new JComboBox(dia);
		cajitad.setLocation(180, 210);
		cajitad.setSize(50, 20);
		calcu2.add(cajitad);
		
		String mes[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12"};
		
		JComboBox cajitam = new JComboBox(mes);
		cajitam.setLocation(235, 210);
		cajitam.setSize(50, 20);
		calcu2.add(cajitam);
		
		String año[] = { "1990" ,"1991" , "1992" , "1993" , "1994" ,"1995" , "1996" , "1997" , "1998" ,"1999" , "2000" , "2001"};
		
		JComboBox cajitaa = new JComboBox(año);
		cajitaa.setLocation(290, 210);
		cajitaa.setSize(70, 20);
		calcu2.add(cajitaa);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setFont(new Font("Agency FB", Font.BOLD, 20));
		sexo.setBackground(Color.black);
		sexo.setLocation(20,270);
		sexo.setSize(220, 20);	
		calcu2.add(sexo);
		
		JRadioButton hombre = new JRadioButton("Hombre");
		hombre.setBounds(180, 270, 70, 35);
		hombre.setOpaque(false);
		calcu2.add(hombre);
		
		JRadioButton mujer = new JRadioButton("Mujer");
		mujer.setBounds(260, 270, 90, 35);
		mujer.setOpaque(false);
		calcu2.add(mujer);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(mujer);
		grupo.add(hombre);
		
		JLabel nacionalidad = new JLabel("Nacionalidad:");
		nacionalidad.setFont(new Font("Agency FB", Font.BOLD, 20));
		nacionalidad.setBackground(Color.black);
		nacionalidad.setLocation(20,340);
		nacionalidad.setSize(220, 20);	
		calcu2.add(nacionalidad);
		
		String pais[] = { "argentina" ,"bolivia" , "brazil" , "colombia" , "salvador" ,"guatemala" , "mexico" , "venezuela" , "chile" ,"cuba" , "panama" , "españa"};
		
		JComboBox cajitap = new JComboBox(pais);
		cajitap.setLocation(180, 340);
		cajitap.setSize(100, 20);
		calcu2.add(cajitap);
		
		
		JPanel usu = new JPanel();
		
		usu.setSize(400, 410);
		usu.setLocation(570, 50);
		usu.setLayout(null);
		usu.setBackground(Color.decode("#FF9999"));
		this.add(usu);
		
		JLabel title4 = new JLabel("Perfil De Uuario");
		title4.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 20));
		title4.setBackground(Color.red);
		title4.setLocation(20,1);
		title4.setSize(220, 20);				
		usu.add(title4);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(getClass().getResource("descarga.png")));
		img.setBounds(50, 50, 300, 200);
		img.setOpaque(true);
		img.setBackground(Color.WHITE);
		usu.add(img);
		

		JCheckBox foto = new JCheckBox ("Montrar Foto De Perfil");
		foto.setBounds(50, 260, 180, 35);
		foto.setOpaque(false);
		usu.add(foto);
		
		JCheckBox fecha = new JCheckBox ("Montrar Fecha De Nacimiento");
		fecha.setBounds(50, 310, 210, 35);
		fecha.setOpaque(false);
		usu.add(fecha);
		
		
		JPanel rosa = new JPanel();
		
		rosa.setSize(530, 250);
		rosa.setLocation(20, 500);
		rosa.setLayout(null);
		rosa.setBackground(Color.decode("#FF6666"));
		this.add(rosa);
		
		JLabel title3 = new JLabel("Datos Opcionales");
		title3.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 20));
		title3.setBackground(Color.red);
		title3.setLocation(20,1);
		title3.setSize(220, 20);				
		rosa.add(title3);
		
		JLabel Descripcion = new JLabel("Descripcion:");
		Descripcion.setFont(new Font("Agency FB", Font.TYPE1_FONT, 20));
		Descripcion.setBackground(Color.black);
		Descripcion.setLocation(50,30);
		Descripcion.setSize(100, 20);	
		rosa.add(Descripcion);
			
		
		JTextArea bio = new JTextArea(10,10);
		bio.setLocation(20, 70);
		bio.setSize(200, 100);
		rosa.add(bio);
		
		JLabel Preferencias = new JLabel("Preferencias:");
		Preferencias.setFont(new Font("Agency FB", Font.TYPE1_FONT, 20));
		Preferencias.setBackground(Color.black);
		Preferencias.setLocation(290,30);
		Preferencias.setSize(100, 20);	
		rosa.add(Preferencias);
			
		
		JTextArea pre = new JTextArea(10,10);
		pre.setLocation(290, 70);
		pre.setSize(200, 100);
		rosa.add(pre);
		
		JPanel bo = new JPanel();
		
		bo.setSize(400, 250);
		bo.setLocation(570, 500);
		bo.setLayout(null);
		bo.setBackground(Color.decode("#66FFCC"));
		this.add(bo);
		
		
		JButton Btn1 = new JButton("Nuevo");
		Btn1.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn1.setBackground(Color.decode("#e9cc68"));
		Btn1.setSize(100, 50);;
		Btn1.setLocation(80, 30);;
		bo.add(Btn1);
		
		JButton Btn2 = new JButton("Guardar");
		Btn2.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn2.setBackground(Color.decode("#e9cc68"));
		Btn2.setSize(150, 50);;
		Btn2.setLocation(80, 90);;
		bo.add(Btn2);
		
		JButton Btn3 = new JButton("Salir");
		Btn3.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn3.setBackground(Color.decode("#e9cc68"));
		Btn3.setSize(100, 50);;
		Btn3.setLocation(80, 150);;
		bo.add(Btn3);
		
		
		
		
		
		this.add(login);
		this.repaint();
		
		
	}

	
	public void factura() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), getHeight());
		//login.setLocation(0, 0);
		login.setLayout(null);
		
		login.setBackground(Color.decode("#006699"));
		
		JLabel title = new JLabel("Factura en Java-NetBeans-ArrayList y POO");
		title.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title.setBackground(Color.decode("#FFFFFF"));
		title.setLocation(20, 10);
		title.setSize(500, 40);		
		login.add(title);
		
		JLabel title2 = new JLabel("(Sin Base de datos)");
		title2.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title2.setBackground(Color.decode("#FFFFFF"));
		title2.setLocation(20, 60);
		title2.setSize(220, 40);		
		login.add(title2);
		
		JPanel cliente = new JPanel();
		
		cliente.setSize(1000, 900);
		cliente.setLocation(0, 100);
		cliente.setLayout(null);
		cliente.setBackground(Color.decode("#FFFFFF"));
		this.add(cliente);
		
		JPanel dcliente = new JPanel();
		
		dcliente.setSize(940, 200);
		dcliente.setLocation(20, 50);
		dcliente.setLayout(null);
		dcliente.setBackground(Color.decode("#006699"));
		dcliente.setOpaque(true);
		cliente.add(dcliente);
		
		JLabel title3 = new JLabel("Datos del cliente");
		title3.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title3.setBackground(Color.decode("#FFFFFF"));
		title3.setLocation(20, 5);
		title3.setSize(500, 40);		
		dcliente.add(title3);
		
		JLabel documento = new JLabel("Documento:");
		documento.setFont(new Font("Agency FB", Font.BOLD, 20));
		documento.setBackground(Color.white);
		documento.setLocation(20,50);
		documento.setSize(220, 20);	
		dcliente.add(documento);
		
		JTextField c = new JTextField();
		c.setFont(new Font("Agency FB", Font.BOLD, 14));
		c.setBackground(Color.white);
		c.setLocation(100, 50);
		c.setSize(200, 30);
		c.setOpaque(true);
		dcliente.add(c);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setFont(new Font("Agency FB", Font.BOLD, 20));
		direccion.setBackground(Color.white);
		direccion.setLocation(20,100);
		direccion.setSize(220, 20);	
		dcliente.add(direccion);
		
		JTextField d = new JTextField();
		d.setFont(new Font("Agency FB", Font.BOLD, 14));
		d.setBackground(Color.white);
		d.setLocation(100, 100);
		d.setSize(200, 30);
		d.setOpaque(true);
		dcliente.add(d);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Agency FB", Font.BOLD, 20));
		nombre.setBackground(Color.white);
		nombre.setLocation(350,50);
		nombre.setSize(220, 20);	
		dcliente.add(nombre);
		
		JTextField n = new JTextField();
		n.setFont(new Font("Agency FB", Font.BOLD, 14));
		n.setBackground(Color.white);
		n.setLocation(410, 50);
		n.setSize(200, 30);
		n.setOpaque(true);
		dcliente.add(n);
		
		JLabel telefono = new JLabel("Telefono:");
		telefono.setFont(new Font("Agency FB", Font.BOLD, 20));
		telefono.setBackground(Color.white);
		telefono.setLocation(350,110);
		telefono.setSize(220, 20);	
		dcliente.add(telefono);
		
		JTextField t = new JTextField();
		t.setFont(new Font("Agency FB", Font.BOLD, 14));
		t.setBackground(Color.white);
		t.setLocation(410, 110);
		t.setSize(200, 30);
		t.setOpaque(true);
		dcliente.add(t);
		
		JPanel dfactura = new JPanel();
		
		dfactura.setSize(940, 100);
		dfactura.setLocation(20, 270);
		dfactura.setLayout(null);
		dfactura.setBackground(Color.decode("#006699"));
		dfactura.setOpaque(true);
		cliente.add(dfactura);
		
		JLabel title4 = new JLabel("Datos de factura");
		title4.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title4.setBackground(Color.decode("#FFFFFF"));
		title4.setLocation(20, 5);
		title4.setSize(500, 40);		
		dfactura.add(title4);
		
		JLabel factura = new JLabel("N.Factura:");
		factura.setFont(new Font("Agency FB", Font.BOLD, 30));
		factura.setBackground(Color.white);
		factura.setLocation(50,50);
		factura.setSize(220, 40);	
		dfactura.add(factura);
		
		JLabel factura1 = new JLabel("1");
		factura1.setFont(new Font("Agency FB", Font.BOLD, 20));
		factura1.setBackground(Color.white);
		factura1.setLocation(200,50);
		factura1.setSize(50, 50);	
		dfactura.add(factura1);
		
		JLabel fecha = new JLabel("Fecha:");
		fecha.setFont(new Font("Agency FB", Font.BOLD, 30));
		fecha.setBackground(Color.white);
		fecha.setLocation(280,50);
		fecha.setSize(220, 40);	
		dfactura.add(fecha);
		
		JLabel fecha1 = new JLabel("2021/50/21");
		fecha1.setFont(new Font("Agency FB", Font.BOLD, 20));
		fecha1.setBackground(Color.white);
		fecha1.setLocation(400,50);
		fecha1.setSize(220, 50);	
		dfactura.add(fecha1);
		
		JPanel lFactruras = new JPanel();
		
		lFactruras.setSize(940, 200);
		lFactruras.setLocation(20, 400);
		lFactruras.setLayout(null);
		lFactruras.setBackground(Color.decode("#006699"));
		lFactruras.setOpaque(true);
		cliente.add(lFactruras);
		
		JLabel title5 = new JLabel("ver listado de facturas");
		title5.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
		title5.setBackground(Color.decode("#FFFFFF"));
		title5.setLocation(20, 5);
		title5.setSize(500, 40);		
		lFactruras.add(title5);
		
		JLabel producto = new JLabel("Producto");
		producto.setFont(new Font("Agency FB", Font.BOLD, 30));
		producto.setBackground(Color.white);
		producto.setLocation(50,40);
		producto.setSize(220, 40);	
		lFactruras.add(producto);
		
		JTextField p = new JTextField();
		p.setFont(new Font("Agency FB", Font.BOLD, 14));
		p.setBackground(Color.white);
		p.setLocation(30, 80);
		p.setSize(200, 30);
		p.setOpaque(true);
		lFactruras.add(p);
		
		JTextField p2 = new JTextField();
		p2.setFont(new Font("Agency FB", Font.BOLD, 14));
		p2.setBackground(Color.white);
		p2.setLocation(30, 115);
		p2.setSize(200, 30);
		p2.setOpaque(true);
		lFactruras.add(p2);
		
		JTextField p3 = new JTextField();
		p3.setFont(new Font("Agency FB", Font.BOLD, 14));
		p3.setBackground(Color.white);
		p3.setLocation(30, 150);
		p3.setSize(200, 30);
		p3.setOpaque(true);
		lFactruras.add(p3);
		
		JLabel cantidad = new JLabel("Cantidad");
		cantidad.setFont(new Font("Agency FB", Font.BOLD, 30));
		cantidad.setBackground(Color.white);
		cantidad.setLocation(290,40);
		cantidad.setSize(220, 40);	
		lFactruras.add(cantidad);
		
		JTextField ca = new JTextField();
		ca.setFont(new Font("Agency FB", Font.BOLD, 14));
		ca.setBackground(Color.white);
		ca.setLocation(250, 80);
		ca.setSize(200, 30);
		ca.setOpaque(true);
		lFactruras.add(ca);
		
		JTextField ca2 = new JTextField();
		ca2.setFont(new Font("Agency FB", Font.BOLD, 14));
		ca2.setBackground(Color.white);
		ca2.setLocation(250, 115);
		ca2.setSize(200, 30);
		ca2.setOpaque(true);
		lFactruras.add(ca2);
		
		JTextField ca3 = new JTextField();
		ca3.setFont(new Font("Agency FB", Font.BOLD, 14));
		ca3.setBackground(Color.white);
		ca3.setLocation(250, 150);
		ca3.setSize(200, 30);
		ca3.setOpaque(true);
		lFactruras.add(ca3);
		
		JLabel valor = new JLabel("Valor");
		valor.setFont(new Font("Agency FB", Font.BOLD, 30));
		valor.setBackground(Color.white);
		valor.setLocation(530,40);
		valor.setSize(220, 40);	
		lFactruras.add(valor);
		
		JTextField v = new JTextField();
		v.setFont(new Font("Agency FB", Font.BOLD, 14));
		v.setBackground(Color.white);
		v.setLocation(460, 80);
		v.setSize(200, 30);
		v.setOpaque(true);
		lFactruras.add(v);
		
		JTextField v2 = new JTextField();
		v2.setFont(new Font("Agency FB", Font.BOLD, 14));
		v2.setBackground(Color.white);
		v2.setLocation(460, 115);
		v2.setSize(200, 30);
		v2.setOpaque(true);
		lFactruras.add(v2);
		
		JTextField v3 = new JTextField();
		v3.setFont(new Font("Agency FB", Font.BOLD, 14));
		v3.setBackground(Color.white);
		v3.setLocation(460, 150);
		v3.setSize(200, 30);
		v3.setOpaque(true);
		lFactruras.add(v3);
		
		JLabel sub = new JLabel("Sub Total");
		sub.setFont(new Font("Agency FB", Font.BOLD, 30));
		sub.setBackground(Color.white);
		sub.setLocation(750,40);
		sub.setSize(220, 40);	
		lFactruras.add(sub);
		
		JTextField sub1 = new JTextField();
		sub1.setFont(new Font("Agency FB", Font.BOLD, 14));
		sub1.setBackground(Color.white);
		sub1.setLocation(720, 80);
		sub1.setSize(200, 30);
		sub1.setOpaque(true);
		lFactruras.add(sub1);
		
		JTextField sub2 = new JTextField();
		sub2.setFont(new Font("Agency FB", Font.BOLD, 14));
		sub2.setBackground(Color.white);
		sub2.setLocation(720, 115);
		sub2.setSize(200, 30);
		sub2.setOpaque(true);
		lFactruras.add(sub2);
		
		JTextField sub3 = new JTextField();
		sub3.setFont(new Font("Agency FB", Font.BOLD, 14));
		sub3.setBackground(Color.white);
		sub3.setLocation(720, 150);
		sub3.setSize(200, 30);
		sub3.setOpaque(true);
		lFactruras.add(sub3);
	
		JLabel subtotal = new JLabel("Subtotal:");
		subtotal.setFont(new Font("Agency FB", Font.BOLD, 20));
		subtotal.setBackground(Color.white);
		subtotal.setLocation(20,650);
		subtotal.setSize(220, 20);	
		cliente.add(subtotal);
		
		JLabel subtotal1 = new JLabel("6600.00");
		subtotal1.setFont(new Font("Agency FB", Font.BOLD, 20));
		subtotal1.setBackground(Color.white);
		subtotal1.setLocation(100,650);
		subtotal1.setSize(220, 20);	
		cliente.add(subtotal1);
		
		JLabel descuento = new JLabel("% descuento:");
		descuento.setFont(new Font("Agency FB", Font.BOLD, 20));
		descuento.setBackground(Color.white);
		descuento.setLocation(20,680);
		descuento.setSize(220, 20);	
		cliente.add(descuento);
		
		JTextField des = new JTextField();
		des.setFont(new Font("Agency FB", Font.BOLD, 14));
		des.setBackground(Color.black);
		des.setLocation(80, 680);
		des.setSize(200, 30);
		des.setOpaque(true);
		dcliente.add(des);
		
		JLabel desc = new JLabel("valor descontado:");
		desc.setFont(new Font("Agency FB", Font.BOLD, 20));
		desc.setBackground(Color.white);
		desc.setLocation(150,680);
		desc.setSize(220, 20);	
		cliente.add(desc);
		
		JLabel vdesc = new JLabel("330.0");
		vdesc.setFont(new Font("Agency FB", Font.BOLD, 20));
		vdesc.setBackground(Color.white);
		vdesc.setLocation(270,680);
		vdesc.setSize(220, 20);	
		cliente.add(vdesc);
		
		JLabel iva = new JLabel("IVA 19%:");
		iva.setFont(new Font("Agency FB", Font.BOLD, 20));
		iva.setBackground(Color.white);
		iva.setLocation(20,720);
		iva.setSize(220, 20);	
		cliente.add(iva);
		
		JLabel niva = new JLabel("1254.0");
		niva.setFont(new Font("Agency FB", Font.BOLD, 20));
		niva.setBackground(Color.white);
		niva.setLocation(100,720);
		niva.setSize(220, 20);	
		cliente.add(niva);
		
		JLabel total = new JLabel("Total Factura:");
		total.setFont(new Font("Agency FB", Font.BOLD, 20));
		total.setBackground(Color.white);
		total.setLocation(20,750);
		total.setSize(220, 20);	
		cliente.add(total);
		
		JLabel vtotal = new JLabel("7524.0");
		vtotal.setFont(new Font("Agency FB", Font.BOLD, 20));
		vtotal.setBackground(Color.white);
		vtotal.setLocation(100,750);
		vtotal.setSize(220, 20);	
		cliente.add(vtotal);
		
		JButton Btn1 = new JButton("Finalizar factura");
		Btn1.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn1.setBackground(Color.decode("#E1E1E1"));
		Btn1.setSize(250, 80);;
		Btn1.setLocation(400, 800);;
		cliente.add(Btn1);
		
		JButton Btn2 = new JButton("Limpiar");
		Btn2.setFont(new Font("Segoe UI white", Font.ITALIC, 20));
		Btn2.setBackground(Color.decode("#E1E1E1"));
		Btn2.setSize(250, 80);;
		Btn2.setLocation(700, 800);;
		cliente.add(Btn2);
		
		this.add(cliente);
		
		this.add(login);
		this.repaint();
	}
	
/*	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D ) g;
		g2d.setBackground(Color.red);
		g2d.drawArc(100, 100, 100, 200, 45, 100);
		/*g2d.drawArc(100, 100, 100, 200, 45, 100);
		g2d.setBackground(Color.red);
		g2d.drawLine(0, 0, 500, 500);
		g2d.drawOval(150, 200, 80, 80);
		int x5[] = {225,150,300,225};
		int y5[] = {50,150,150,50};
		//g2d.drawPolyline(x5, y5, 4);
		g2d.drawRect(300, 300, 200, 150);
		g2d.drawRoundRect(350, 350, 200, 200, 15, 15);
		g2d.setColor(Color.GREEN);
		g2d.setFont(new Font("Namecat", Font.BOLD, 80));
		g2d.drawString("hola", 400, 140);
		g2d.fillArc(500, 100, 200, 200, 0, 90);
		g2d.fillOval(100, 230, 80, 80);
		
		int x52[] = {225,180,330,225};
		int y52[] = {80,180,100,80};
		g2d.fillPolygon(x52, y52, 4);
		g2d.setColor(Color.black);
		g2d.fillRect(500, 300, 300, 100);
		
	//	g2d.clearRect(650, 350, 100, 50);
		
	/*	try {
			
			BufferedImage imagen = ImageIO.read(new File("src/pez.png"));
			g2d.drawImage( imagen ,200,200,null );
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		//g2d.setBackground(Color.decode("#2271b3"));
		
		//////////////////////////CASA
		//Cielo
		/*g2d.setColor(Color.decode("#01BEFE"));
		g2d.fillRect(5, 10, 1000, 800);
		//TIERRA
		g2d.setColor(Color.decode("#634C16"));
		g2d.fillRect(5, 700, 1000, 200);
		g2d.setColor(Color.decode("#D1B868"));
		g2d.fillRect(5, 650, 1000, 50);
		g2d.setColor(Color.decode("#72952D"));
		g2d.fillRect(5, 580, 1000, 70);
		g2d.setColor(Color.decode("#3A4C12"));
		g2d.fillRect(5, 560, 1000, 20);
		g2d.setColor(Color.decode("#D5953B"));
		g2d.fillRect(5, 300, 1000, 150);
		//VALLAS
		g2d.setColor(Color.decode("#FFB951"));
		g2d.fillRect(5, 270, 70, 290);
		int x52[] = {40,5,75,40};
		int y52[] = {220,270,270,220};
		g2d.fillPolygon(x52, y52, 4);
		
		int x1[] = {120,85,155,120};
		int y1[] = {220,270,270,220};
		g2d.fillPolygon(x1, y1, 4);
		g2d.fillRect(85, 270, 70, 290);
		
		int x2[] = {200,165,235,200};
		int y2[] = {220,270,270,220};
		g2d.fillPolygon(x2, y2, 4);
		g2d.fillRect(165, 270, 70, 290);
		
		int x3[] = {280,245,315};
		int y3[] = {220,270,270};
		g2d.fillPolygon(x3, y3, 3);
		g2d.fillRect(245, 270, 70, 290);
		
		int x4[] = {360,325,395};
		int y4[] = {220,270,270};
		g2d.fillPolygon(x4, y4, 3);
		g2d.fillRect(325, 270, 70, 290);
		
		int x5[] = {440,405,475};
		int y5[] = {220,270,270};
		g2d.fillPolygon(x5, y5, 3);
		g2d.fillRect(405, 270, 70, 290);
		
		int x6[] = {520,485,555};
		int y6[] = {220,270,270};
		g2d.fillPolygon(x6, y6, 3);
		g2d.fillRect(485, 270, 70, 290);
		
		int x7[] = {520,485,555};
		int y7[] = {220,270,270};
		g2d.fillPolygon(x7, y7, 3);
		g2d.fillRect(485, 270, 70, 290);

		int x8[] = {600,565,635};
		int y8[] = {220,270,270};
		g2d.fillPolygon(x8, y8, 3);
		g2d.fillRect(565, 270, 70, 290);
		
		int x9[] = {680,645,715};
		int y9[] = {220,270,270};
		g2d.fillPolygon(x9, y9, 3);
		g2d.fillRect(645, 270, 70, 290);
		
		int x10[] = {760,725,795};
		int y10[] = {220,270,270};
		g2d.fillPolygon(x10, y10, 3);
		g2d.fillRect(725, 270, 70, 290);
		
		int x11[] = {840,805,875};
		int y11[] = {220,270,270};
		g2d.fillPolygon(x11, y11, 3);
		g2d.fillRect(805, 270, 70, 290);
		
		int x12[] = {920,885,955};
		int y12[] = {220,270,270};
		g2d.fillPolygon(x12, y12, 3);
		g2d.fillRect(885, 270, 70, 290);
		
		int x13[] = {1000,965,1035};
		int y13[] = {220,270,270};
		g2d.fillPolygon(x13, y13, 3);
		g2d.fillRect(965, 270, 70, 290);
		
		//PISO
		g2d.setColor(Color.decode("#666666"));
		g2d.fillRect(200, 520,600, 40);
		
		//CASA
		g2d.setColor(Color.decode("#644C07"));
		g2d.fillRect(235, 150,530, 370);
		g2d.setColor(Color.decode("#FFD775"));
		g2d.fillRect(235, 150,530, 40);
		g2d.fillRect(235, 195,530, 40);
		g2d.fillRect(235, 240,530, 40);
		g2d.fillRect(235, 285,530, 40);
		g2d.fillRect(235, 330,530, 40);
		g2d.fillRect(235, 375,530, 40);
		g2d.fillRect(235, 420,530, 40);
		g2d.fillRect(235, 465,530, 40);
		g2d.fillRect(235, 510,530, 10);
		
		//PUERTA
		g2d.setColor(Color.decode("#644C07"));
		g2d.fillRect(280, 240, 150, 280);
		g2d.setColor(Color.decode("#98700E"));
		g2d.fillRect(290, 250, 130, 260);
		g2d.setColor(Color.decode("#FEFEFE"));
		g2d.fillOval(400, 380, 20, 20);
		
		//TECHO
		g2d.setColor(Color.decode("#A22425"));
		int x15[] = {390,150,850};
		int y15[] = {20,150,150};
		g2d.fillPolygon(x15, y15, 3);
		
		//VENTANA
		g2d.setColor(Color.decode("#666666"));
		g2d.fillRect(550, 355,200, 20);
		g2d.setColor(Color.decode("#A5212A"));
		g2d.fillRect(570, 225,150, 130);
		g2d.setColor(Color.decode("#FEFEFE"));
		g2d.fillRect(580, 235,55, 55);
		g2d.fillRect(650, 235,55, 55);
		g2d.fillRect(580, 295,55, 55);
		g2d.fillRect(650, 295,55, 55);
		*/
		////////////////////////////////////////////////////////MARIO
		//Cielo
	/*	g2d.setColor(Color.decode("#B3EEFE"));
		g2d.fillRect(5, 10, 1000, 800);
		
		//PISO
		g2d.setColor(Color.decode("#EB9F7D"));
		g2d.fillRect(5, 730,1000, 65);
		g2d.setColor(Color.black);
		int x15[] = {25,10,35};
		int y15[] = {750,730,780};
		g2d.fillPolygon(x15, y15, 3);
		
		int x1[] = {60,45,70};
		int y1[] = {750,730,780};
		g2d.fillPolygon(x1, y1, 3);
		
		int x2[] = {95,80,105};
		int y2[] = {750,730,780};
		g2d.fillPolygon(x2, y2, 3);
		
		int x3[] = {130,115,140};
		int y3[] = {750,730,780};
		g2d.fillPolygon(x3, y3, 3);
		
		int x4[] = {165,150,175};
		int y4[] = {750,730,780};
		g2d.fillPolygon(x4, y4, 3);
		
		int x5[] = {200,185,210};
		int y5[] = {750,730,780};
		g2d.fillPolygon(x5, y5, 3);
		
		int x6[] = {235,220,245};
		int y6[] = {750,730,780};
		g2d.fillPolygon(x6, y6, 3);
		
		int x7[] = {270,255,280};
		int y7[] = {750,730,780};
		g2d.fillPolygon(x7, y7, 3);
		
		int x8[] = {305,290,315};
		int y8[] = {750,730,780};
		g2d.fillPolygon(x8, y8, 3);
		
		int x9[] = {340,325,350};
		int y9[] = {750,730,780};
		g2d.fillPolygon(x9, y9, 3);
		
		int x10[] = {375,360,385};
		int y10[] = {750,730,780};
		g2d.fillPolygon(x10, y10, 3);
		
		int x11[] = {410,395,420};
		int y11[] = {750,730,780};
		g2d.fillPolygon(x11, y11, 3);
		
		int x12[] = {445,430,455};
		int y12[] = {750,730,780};
		g2d.fillPolygon(x12, y12, 3);
		
		int x13[] = {480,465,490};
		int y13[] = {750,730,780};
		g2d.fillPolygon(x13, y13, 3);
		
		int x14[] = {515,500,525};
		int y14[] = {750,730,780};
		g2d.fillPolygon(x14, y14, 3);
		
		int x16[] = {550,535,560};
		int y16[] = {750,730,780};
		g2d.fillPolygon(x16, y16, 3);
		
		int x17[] = {585,570,595};
		int y17[] = {750,730,780};
		g2d.fillPolygon(x17, y17, 3);
		
		int x18[] = {625,610,635};
		int y18[] = {750,730,780};
		g2d.fillPolygon(x18, y18, 3);
		
		int x19[] = {660,645,670};
		int y19[] = {750,730,780};
		g2d.fillPolygon(x19, y19, 3);
		
		int x20[] = {695,680,700};
		int y20[] = {750,730,780};
		g2d.fillPolygon(x20, y20, 3);
		
		int x21[] = {725,710,735};
		int y21[] = {750,730,780};
		g2d.fillPolygon(x21, y21, 3);
		
		int x22[] = {760,745,770};
		int y22[] = {750,730,780};
		g2d.fillPolygon(x22, y22, 3);
		
		int x23[] = {795,780,805};
		int y23[] = {750,730,780};
		g2d.fillPolygon(x23, y23, 3);
		
		int x24[] = {830,815,840};
		int y24[] = {750,730,780};
		g2d.fillPolygon(x24, y24, 3);
		
		int x25[] = {865,850,875};
		int y25[] = {750,730,780};
		g2d.fillPolygon(x25, y25, 3);
		
		int x26[] = {900,885,910};
		int y26[] = {750,730,780};
		g2d.fillPolygon(x26, y26, 3);
		
		int x27[] = {935,920,945};
		int y27[] = {750,730,780};
		g2d.fillPolygon(x27, y27, 3);
		
		int x28[] = {970,955,980};
		int y28[] = {750,730,780};
		g2d.fillPolygon(x28, y28, 3);
		
		int x29[] = {1005,990,1015};
		int y29[] = {750,730,780};
		g2d.fillPolygon(x29, y29, 3);
		
		g2d.fillRect(5, 700,1000, 40);
		g2d.setColor(Color.decode("#FBC6B6"));
		g2d.fillRect(5, 705,1000, 30);
		/////////////////////COSAS
		g2d.setColor(Color.black);
		g2d.fillRoundRect(400, 350, 200, 350, 15, 15);
		g2d.fillRoundRect(400, 317, 154, 380, 15, 15);
		g2d.setColor(Color.decode("#84C0FE"));
		g2d.fillRoundRect(402, 320, 150, 380, 15, 15);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(280, 490, 200, 210, 15, 15);
		g2d.fillRoundRect(280, 447, 154, 252, 15, 15);
		g2d.setColor(Color.decode("#FFC3B8"));
		g2d.fillRoundRect(282, 450, 150, 250, 15, 15);
		
		g2d.setColor(Color.black);
		g2d.fillOval(407, 327, 26, 26);
		g2d.fillOval(517, 327, 26, 26);
		g2d.fillOval(517, 667, 26, 26);
		g2d.fillOval(289, 457, 26, 26);
		g2d.fillOval(402, 457, 26, 26);
		g2d.fillOval(289, 667, 26, 26);
		g2d.fillOval(402, 667, 26, 26);
		
		g2d.setColor(Color.decode("#81837E"));
		g2d.fillOval(410, 330, 20, 20);
		g2d.fillOval(520, 330, 20, 20);
		g2d.fillOval(520, 670, 20, 20);
		g2d.fillOval(292, 460, 20, 20);
		g2d.fillOval(405, 460, 20, 20);
		g2d.fillOval(292, 670, 20, 20);
		g2d.fillOval(405, 670, 20, 20);
		
		/////////////////////CUADRADOS FLOTANTES
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(118, 378, 54, 54, 15, 15);
		g2d.setColor(Color.decode("#FC9262"));
		g2d.fillRoundRect(120, 380, 50, 50, 15, 15);
		g2d.setColor(Color.black);
		g2d.fillOval(123, 382, 7, 7);
		g2d.fillOval(160, 382, 7, 7);
		g2d.fillOval(123, 420, 7, 7);
		g2d.fillOval(160, 420, 7, 7);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(298, 228, 54, 54, 15, 15);
		g2d.setColor(Color.decode("#FC9262"));
		g2d.fillRoundRect(300, 230, 50, 50, 15, 15);
		g2d.setColor(Color.black);
		g2d.fillOval(303, 232, 7, 7);
		g2d.fillOval(341, 232, 7, 7);
		g2d.fillOval(303, 272, 7, 7);
		g2d.fillOval(340, 272, 7, 7);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(244, 228, 54, 54, 15, 15);
		g2d.setColor(Color.decode("#FC9262"));
		g2d.fillRoundRect(246, 230, 50, 50, 15, 15);
		g2d.setColor(Color.black);
		g2d.fillOval(251, 232, 7, 7);
		g2d.fillOval(285, 232, 7, 7);
		g2d.fillOval(251, 272, 7, 7);
		g2d.fillOval(285, 272, 7, 7);
		
		g2d.setColor(Color.decode("#FFFFFF"));	
		g2d.fillArc(287, 242, 20, 20, 90, 90);
		g2d.fillArc(237, 242, 20, 20, -90, 180);
		
		////////////////////ARBUSTO
		g2d.setColor(Color.black);
		g2d.fillArc(47, 648,106, 103, 0, 180);
		g2d.fillArc(57, 608, 66, 133, 20,180);
		g2d.setColor(Color.decode("#00D463"));	
		g2d.fillArc(50, 650, 100, 100, 0, 180);
		g2d.fillArc(60, 610, 60, 130, 20,180);
		
		///////////////////////////////////PERSONAJE
		//PIES
		g2d.setColor(Color.black);
		g2d.fillArc(515, 677, 54, 54, 0, 90);
		g2d.setColor(Color.decode("#D72C09"));	
		g2d.fillArc(520, 678, 50, 50, 0, 90);
		//CUERPO
		g2d.setColor(Color.black);
		g2d.fillOval(530, 635, 50,50);
		g2d.setColor(Color.decode("#D72C09"));
		g2d.fillRect(540, 650, 25, 15);
		g2d.fillRoundRect(535, 640, 18, 18, 15, 15);
		g2d.setColor(Color.decode("#FFC2BE"));
		g2d.fillOval(560, 650, 20,15);
		g2d.setColor(Color.black);
		g2d.fillArc(530, 595, 50, 50, 90, 180);
		g2d.fillArc(535, 578, 60, 50, 90, 110);
		g2d.setColor(Color.decode("#FFC2BE"));
		g2d.fillRect(550, 630, 20, 8);
		g2d.fillRect(540, 625, 20, 8);
		g2d.fillRect(540, 620, 10, 10);
		g2d.fillRect(548, 615, 13, 5);
		g2d.fillRect(555, 600, 15, 15);
		g2d.fillRect(550, 605, 5, 5);
		//CARA
		g2d.setColor(Color.black);
		g2d.fillRect(562, 602, 5, 8);
		g2d.setColor(Color.decode("#FFC2BE"));
		g2d.fillArc(558, 605, 25,20, 180,180);
		g2d.fillRect(535, 620, 8, 5);
		g2d.fillArc(525, 610, 15, 15, -90, 180);
		//GORRA
		g2d.setColor(Color.decode("#D72C09"));
		g2d.fillRect(535, 600, 8, 5);
		g2d.fillRect(540, 598, 8, 5);
		g2d.fillRect(543, 595, 8, 5);
		g2d.fillRect(546, 590, 8, 7);
		g2d.fillRect(546, 587, 25, 10);
		
		////////////////////TUBO
		g2d.setColor(Color.black);
		g2d.fillRect(700, 500, 100, 200);
		g2d.setColor(Color.decode("#008A00"));
		g2d.fillRect(705, 505, 90, 190);
		g2d.setColor(Color.decode("#00E555"));
		g2d.fillRect(710, 505, 10, 190);
		g2d.fillRect(725, 505, 18, 190);
		g2d.fillRect(750, 505, 5, 190);
		g2d.fillRect(780, 505, 10, 190);
		g2d.setColor(Color.black);
		g2d.fillRect(675, 450, 150, 50);
		g2d.setColor(Color.decode("#008A00"));
		g2d.fillRect(680, 455, 140, 40);
		g2d.setColor(Color.decode("#00E555"));
		g2d.fillRect(710, 455, 10, 40);
		g2d.fillRect(725, 455, 18, 40);
		g2d.fillRect(750, 455, 5, 40);
		g2d.fillRect(780, 455, 10, 40);
		
		//////////////////PLANTA FUEGO
		g2d.setColor(Color.black);
		g2d.fillRect(730, 350, 30, 100);
		g2d.setColor(Color.decode("#62CF7C"));
		g2d.fillRect(735, 355, 20, 95);
		//HOJAS
		g2d.setColor(Color.black);
		g2d.fillArc(700, 390, 40, 40, 120, 190);
		g2d.setColor(Color.decode("#62CF7C"));
		g2d.fillArc(702, 395, 30, 30, 120, 190);
		g2d.setColor(Color.black);
		g2d.fillArc(700, 350, 40, 40, 120, 190);
		g2d.setColor(Color.decode("#62CF7C"));
		g2d.fillArc(702, 355, 30, 30, 120, 190);
		g2d.setColor(Color.black);
		g2d.fillArc(750, 390, 40, 40, 230, 180);
		g2d.setColor(Color.decode("#62CF7C"));
		g2d.fillArc(757, 395, 30, 30, 230, 180);
		g2d.setColor(Color.black);
		g2d.fillArc(750, 350, 40, 40, 230, 180);
		g2d.setColor(Color.decode("#62CF7C"));
		g2d.fillArc(757, 355, 30, 30, 230, 180);
		/////CABEZA
		g2d.setColor(Color.black);
		g2d.fillArc(708, 284, 65, 65, 230, 300);
		g2d.setColor(Color.decode("#C7414A"));
		g2d.fillArc(712, 286, 60, 60, 230, 300);
		g2d.setColor(Color.black);
		g2d.fillRect(705, 305, 20, 10);
		g2d.fillRect(720, 300, 20, 10);
		g2d.fillRect(730, 300, 20, 15);
		g2d.fillRect(730, 315, 20, 15);
		g2d.fillRect(715, 325, 20, 10);
		g2d.fillRect(705, 335, 20, 10);
		g2d.setColor(Color.decode("#FBF5F7"));
		g2d.fillRect(705, 305, 15, 07);
		g2d.fillRect(720, 300, 15, 07);
		g2d.fillRect(730, 300, 15, 07);
		g2d.fillRect(730, 315, 15, 07);
		g2d.fillRect(715, 325, 15, 07);
		g2d.fillRect(705, 335, 15, 07);
		g2d.setColor(Color.decode("#FBF5F7"));
		g2d.fillRect(725,290, 5, 5);
		g2d.fillRect(740,290, 5, 5);
		g2d.fillRect(748,297, 5, 5);
		g2d.fillRect(757,297, 5, 5);
		g2d.fillRect(757,308, 5, 5);
		g2d.fillRect(757,320, 5, 5);
		g2d.fillRect(740,340, 5, 5);
		
			
		/////BOLA FUEGO
		g2d.setColor(Color.decode("#B65066"));
		g2d.fillRect(620,470, 20, 20);
		g2d.fillRect(615,475, 10, 10);
		g2d.fillRect(623,475, 20, 20);
		g2d.fillRect(620,485, 15, 15);
		g2d.fillRect(617,489, 15, 8);		
		g2d.fillRect(610,489, 8, 8);
		g2d.setColor(Color.decode("#FBF5F7"));
		g2d.fillRect(623,475, 10, 10);
		g2d.fillRect(628,479, 10, 10);
		
		
		
		///COSA VERDE
		g2d.setColor(Color.black);
		g2d.fillRoundRect(890, 500, 200, 200, 15, 15);
		g2d.setColor(Color.decode("#51D96B"));
		g2d.fillRoundRect(895, 505, 195, 195, 15, 15);
		

		g2d.setColor(Color.black);
		g2d.fillOval(900, 510, 26, 26);
		g2d.fillOval(900, 670, 26, 26);
		g2d.setColor(Color.decode("#81837E"));
		g2d.fillOval(902, 513, 20, 20);
		g2d.fillOval(902, 673, 20, 20);
		
		///COSA FLOTANTE
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(900, 378, 54, 54, 15, 15);
		g2d.setColor(Color.decode("#FC9262"));
		g2d.fillRoundRect(902, 380, 50, 50, 15, 15);
		g2d.setColor(Color.black);
		g2d.fillOval(905, 382, 7, 7);
		g2d.fillOval(940, 382, 7, 7);
		g2d.fillOval(905, 420, 7, 7);
		g2d.fillOval(940, 420, 7, 7);
		
		
		*/
		
		////////////////////////////////MARIO2////////////////////////////////
		
		/*
		//Cielo
				g2d.setColor(Color.decode("#0665C0"));
				g2d.fillRect(5, 10, 1000, 800);
				
		//PISO
				g2d.setColor(Color.decode("#CE9C62"));
				g2d.fillRect(5, 730,1000, 65);
				g2d.setColor(Color.decode("#E6BA5C"));
				g2d.fillOval(25, 750, 7, 7);
				g2d.fillOval(75, 750, 7, 7);
				g2d.fillOval(125, 750, 7, 7);
				g2d.fillOval(175, 750, 7, 7);
				g2d.fillOval(225, 750, 7, 7);
				g2d.fillOval(275, 750, 7, 7);
				g2d.fillOval(375, 750, 7, 7);
				g2d.fillOval(325, 750, 7, 7);
				g2d.fillOval(475, 750, 7, 7);
				g2d.fillOval(425, 750, 7, 7);
				g2d.fillOval(575, 750, 7, 7);
				g2d.fillOval(525, 750, 7, 7);
				g2d.fillOval(625, 750, 7, 7);
				g2d.fillOval(675, 750, 7, 7);
				g2d.fillOval(725, 750, 7, 7);
				g2d.fillOval(775, 750, 7, 7);
				g2d.fillOval(825, 750, 7, 7);
				g2d.fillOval(875, 750, 7, 7);
				g2d.fillOval(925, 750, 7, 7);
				g2d.fillOval(975, 750, 7, 7);
				
				g2d.fillOval(40, 780, 7, 7);
				g2d.fillOval(90, 775, 7, 7);
				g2d.fillOval(140, 769, 7, 7);
				g2d.fillOval(160, 773, 7, 7);
				g2d.fillOval(225, 785, 7, 7);
				g2d.fillOval(290, 768, 7, 7);
				g2d.fillOval(310, 780, 7, 7);
				g2d.fillOval(380, 759, 7, 7);
				g2d.fillOval(466, 757, 7, 7);
				g2d.fillOval(411, 770, 7, 7);
				g2d.fillOval(575, 783, 7, 7);
				g2d.fillOval(511, 765, 7, 7);
				g2d.fillOval(683, 770, 7, 7);
				g2d.fillOval(696, 780, 7, 7);
				g2d.fillOval(773, 773, 7, 7);
				g2d.fillOval(750, 784, 7, 7);
				g2d.fillOval(886, 782, 7, 7);
				g2d.fillOval(842, 750, 7, 7);
				g2d.fillOval(980, 789, 7, 7);
				g2d.fillOval(933, 779, 7, 7);
				
				g2d.setColor(Color.decode("#06CF0A"));
				g2d.fillRect(5, 700,1000, 30);
				
				
		//FONDO
				g2d.setColor(Color.decode("#C6E3E7"));
				g2d.fillRoundRect(50, 350, 200, 350, 15, 15);
				g2d.fillOval(50, 250, 200, 200);
				
				
				g2d.fillRoundRect(450, 320, 154, 380, 15, 15);
				g2d.fillOval(450, 253, 155, 150);
				
				g2d.fillRoundRect(605, 250, 150, 450, 15, 15);
				g2d.fillOval(605, 170, 150, 150);
				
				g2d.setColor(Color.decode("#EDF4FF"));
				g2d.fillOval(170, 350, 20, 27);
				g2d.fillOval(170, 490, 20, 27);
				g2d.fillOval(100, 530, 20, 27);
				
				g2d.fillOval(480, 350, 20, 27);
				g2d.fillOval(480, 490, 20, 27);
				g2d.fillOval(580, 300, 20, 27);
				
				g2d.fillOval(680, 220, 20, 27);
				g2d.fillOval(620, 430, 20, 27);
				
				
				//////nubes
				g2d.fillRoundRect(5, 400, 200, 50, 15, 15);
				g2d.fillOval(180, 400, 50, 50);
				
				g2d.fillRoundRect(300, 450, 200, 50, 15, 15);
				g2d.fillOval(470, 450, 50, 50);
				g2d.fillOval(280, 450, 50, 50);
				
				g2d.fillRoundRect(225, 550, 200, 50, 15, 15);
				g2d.fillOval(390, 550, 50, 50);
				g2d.fillOval(210, 550, 50, 50);
				
				g2d.fillRoundRect(760, 300, 200, 50, 15, 15);
				g2d.fillOval(745, 300, 50, 50);
				g2d.fillOval(930, 300, 50, 50);
				
				/////////////
				g2d.setColor(Color.decode("#76B2D7"));
				g2d.fillRoundRect(5, 600, 200, 100, 15, 15);
				g2d.fillOval(5, 500, 200, 200);
								
				g2d.fillRoundRect(450, 600, 200, 100, 15, 15);
				g2d.fillOval(450, 500, 200, 200);
			
				g2d.fillRoundRect(650, 500, 200, 200, 15, 15);
				g2d.fillOval(650, 400, 200, 200);
				
				g2d.setColor(Color.decode("#C6E4E3"));
				g2d.fillOval(680, 450, 20, 27);
				g2d.fillOval(750, 600, 20, 27);
				
///////////////////////////////////PERSONAJE
				//PIES
				g2d.setColor(Color.black);
				g2d.fillArc(515, 677, 54, 54, 0, 90);
				g2d.setColor(Color.decode("#D72C09"));	
				g2d.fillArc(520, 678, 50, 50, 0, 90);
				//CUERPO
				g2d.setColor(Color.black);
				g2d.fillOval(530, 635, 50,50);
				g2d.setColor(Color.decode("#D72C09"));
				g2d.fillRect(540, 650, 25, 15);
				g2d.fillRoundRect(535, 640, 18, 18, 15, 15);
				g2d.setColor(Color.decode("#FFC2BE"));
				g2d.fillOval(560, 650, 20,15);
				g2d.setColor(Color.black);
				g2d.fillArc(530, 595, 50, 50, 90, 180);
				g2d.fillArc(535, 578, 60, 50, 90, 110);
				g2d.setColor(Color.decode("#FFC2BE"));
				g2d.fillRect(550, 630, 20, 8);
				g2d.fillRect(540, 625, 20, 8);
				g2d.fillRect(540, 620, 10, 10);
				g2d.fillRect(548, 615, 13, 5);
				g2d.fillRect(555, 600, 15, 15);
				g2d.fillRect(550, 605, 5, 5);
				//CARA
				g2d.setColor(Color.black);
				g2d.fillRect(562, 602, 5, 8);
				g2d.setColor(Color.decode("#FFC2BE"));
				g2d.fillArc(558, 605, 25,20, 180,180);
				g2d.fillRect(535, 620, 8, 5);
				g2d.fillArc(525, 610, 15, 15, -90, 180);
				//GORRA
				g2d.setColor(Color.decode("#D72C09"));
				g2d.fillRect(535, 600, 8, 5);
				g2d.fillRect(540, 598, 8, 5);
				g2d.fillRect(543, 595, 8, 5);
				g2d.fillRect(546, 590, 8, 7);
				g2d.fillRect(546, 587, 25, 10);
			
////////////////////TUBO
				g2d.setColor(Color.black);
				g2d.fillRect(630, 550, 100, 150);
				g2d.setColor(Color.decode("#8885CF"));
				g2d.fillRect(635, 555, 90, 140);
							
				g2d.setColor(Color.black);
				g2d.fillRect(615, 500, 120, 50);
				g2d.setColor(Color.decode("#8885CF"));
				g2d.fillRect(620, 505, 110, 40);
			
				
							
				
				
				
				/////////////////
				
				///CUADRADOS
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(800, 448, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#736F77"));
				g2d.fillRoundRect(802, 450, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(850, 448, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#FED82A"));
				g2d.fillRoundRect(852, 450, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(900, 448, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#FED82A"));
				g2d.fillRoundRect(902, 450, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(950, 448, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#FED82A"));
				g2d.fillRoundRect(952, 450, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(800, 498, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#736F77"));
				g2d.fillRoundRect(802, 500, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(800,548, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#736F77"));
				g2d.fillRoundRect(802, 550, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(800, 598, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#736F77"));
				g2d.fillRoundRect(802, 600, 50, 50, 15, 15);
				
				g2d.setColor(Color.black);
				g2d.fillRoundRect(800, 648, 54, 54, 15, 15);
				g2d.setColor(Color.decode("#736F77"));
				g2d.fillRoundRect(802, 650, 50, 50, 15, 15);
				
				g2d.setColor(Color.red);
				g2d.setFont(new Font("Namecat", Font.BOLD, 40));
				g2d.drawString("MARIO", 100, 100);
				
				g2d.setColor(Color.WHITE);
				g2d.setFont(new Font("Namecat", Font.BOLD, 40));
				g2d.drawString("X  5", 150, 150);
				
				g2d.setColor(Color.WHITE);
				g2d.setFont(new Font("Namecat", Font.BOLD, 80));
				g2d.drawString("0", 400, 150);
				
				g2d.setColor(Color.decode("#5BA9FC"));
				g2d.fillRoundRect(450, 70, 100,100, 15, 15);
				
				g2d.setColor(Color.decode("#0665C0"));
				g2d.fillRoundRect(460, 80, 80,80, 15, 15);
				
				g2d.setColor(Color.decode("#C60D0E"));
				g2d.fillOval(464, 88, 70,70);
				
				g2d.setColor(Color.decode("#FFFCFB"));
				g2d.fillRoundRect(469, 118, 60,40, 15, 15);
				
				g2d.fillOval(472, 92, 15,19);
				g2d.fillOval(490, 92, 19,15);
				g2d.fillOval(512, 92, 19,15);
				
				g2d.setColor(Color.BLACK);				
				g2d.fillOval(485, 118, 10,15);
				g2d.fillOval(499, 118, 10,15);
				
				g2d.setColor(Color.decode("#F6E99E"));;
				g2d.setFont(new Font("Namecat", Font.BOLD, 40));
				g2d.drawString("TIME", 580, 100);
				g2d.drawString("247", 580, 150);
				
				g2d.setColor(Color.WHITE);
				g2d.setFont(new Font("Namecat", Font.BOLD, 40));
				g2d.drawString("X   0", 750, 100);
				g2d.drawString("2600", 750, 150);
				
				
	}
	
	
*/
	
	
	
	
	
	
	
	
}