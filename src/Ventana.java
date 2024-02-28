import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
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

public class Ventana extends JFrame {

	public Ventana() {

		
		//para que se vea
		this.setVisible(true);
		
		// para que se cierre 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para que aparesca en el centro
		this.setLocationRelativeTo(null);
		
		//para que modifique el tamaño
		this.setSize(1000,1000);
		
		//para poner titulo
		this.setTitle("Hola mundo");
		
		
		this.setLayout(null);
		this.loadcomponents();
	}

	public void loadcomponents() {
		
		//this.login();
	//	this.registro();
		//this.admin();
		this.calculadora();
		
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
		login.add(acceder);
		
		
		
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










}
