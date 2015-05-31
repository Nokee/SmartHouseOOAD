import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String Username;
	private String sifra;
	private boolean jeligost;
	private JPasswordField passwordField;
	
	public String getUsername()
	{
		return Username;
	}
	public String getsifra()
	{
		return sifra;
	}
	public boolean getGost()
	{
		return jeligost;
	}
	

	/**
	 * Prikazuje display.
	 */
	/*public static void main(String arg[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(true);
					frame.setVisible(true);
				} catch (Exception e) {
					
					e.printStackTrace();
				
				}
			}
		});
	}*/
	
	/**
	 * Create the frame.
	 * 
	 * parametri gost true ako se i gost moze prijaviti
	 */
	@SuppressWarnings("deprecation")
	public Login(boolean gost) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblUnseiteVaseIme = new JLabel("Unseite vase ime");
		lblUnseiteVaseIme.setBounds(67, 35, 99, 14);
		contentPane.add(lblUnseiteVaseIme);
		
		final JLabel lblkaoGostMorate = new JLabel("*Kao gost morate unjeti ime");
		lblkaoGostMorate.setForeground(new Color(204, 0, 0));
		lblkaoGostMorate.setBounds(67, 186, 162, 14);
		contentPane.add(lblkaoGostMorate);
		lblkaoGostMorate.hide();
		
		if(gost){
		JButton btnPrijaviteSeKao = new JButton("Prijava Gosta");
		btnPrijaviteSeKao.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(textField.getText()==null )
				{
					lblkaoGostMorate.setText("*Unesite vase ime");
					lblkaoGostMorate.show();;
					JOptionPane.showMessageDialog(null, "Unesite vase ime");
				}
				else
				{
					jeligost=true;
					Username=textField.getText();
					setVisible(false);
					
				}
			}
		});
		btnPrijaviteSeKao.setBounds(77, 203, 133, 23);
		contentPane.add(btnPrijaviteSeKao);
		}
		textField = new JTextField();
		textField.setBounds(67, 60, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Unesite sifru");
		lblNewLabel.setBounds(67, 96, 99, 14);
		contentPane.add(lblNewLabel);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 114, 162, 20);
		contentPane.add(passwordField);
		
		JLabel lblIdentifikacija = new JLabel("Identifikacija");
		lblIdentifikacija.setBounds(10, 11, 105, 14);
		contentPane.add(lblIdentifikacija);
		
		JButton btnPrijava = new JButton("Prijava");
		btnPrijava.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()=="" || passwordField.getPassword().toString()=="")
				{
					JOptionPane.showMessageDialog(null, "Unesite vase ime i sifru");
				}
				else {
					Username=textField.getText();
					sifra=passwordField.getPassword().toString();
					setVisible(false);
				}
				
			}
		});
		btnPrijava.setBounds(77, 152, 133, 23);
		contentPane.add(btnPrijava);
		
		
		this.Username="";
		this.sifra="";
		this.jeligost=false;
		
		
	}
	public Login()
	{
		this(false);
	}
	
	
}
