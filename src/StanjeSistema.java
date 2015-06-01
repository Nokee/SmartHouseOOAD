import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;


public class StanjeSistema extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public void display(final double d, final double e,  final int f,int i) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StanjeSistema frame = new StanjeSistema();
					frame.textField.setText(String.valueOf(d));
					frame.textField_1.setText(String.valueOf(e));
					switch(f)
					{
					case 1:frame.textField_2.setText("ODLICNO");
					break;
					case 2:frame.textField_2.setText("DOBRO");
					break;
					default:frame.textField_2.setText("LOSE");
					break;
					
					}
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StanjeSistema() {
		setTitle("Stanje sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperatura");
		lblNewLabel.setBounds(31, 34, 62, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(141, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPostaviTemperaturu = new JButton("Postavi Temperaturu");
		btnPostaviTemperaturu.setBounds(249, 30, 135, 23);
		contentPane.add(btnPostaviTemperaturu);
		
		JLabel lblOsvijetljenje = new JLabel("Osvijetljenje");
		lblOsvijetljenje.setBounds(31, 59, 62, 14);
		contentPane.add(lblOsvijetljenje);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setBounds(141, 56, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Postavi osvijetljenje");
		btnNewButton.setBounds(249, 55, 135, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSigurnost = new JLabel("Ocjena sigurnosti");
		lblSigurnost.setBounds(31, 84, 86, 14);
		contentPane.add(lblSigurnost);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 81, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBrojOsobaU = new JLabel("Broj osoba u kuci");
		lblBrojOsobaU.setBounds(31, 109, 86, 14);
		contentPane.add(lblBrojOsobaU);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 106, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUredjaji = new JLabel("Uredjaji");
		lblUredjaji.setBounds(31, 134, 46, 14);
		contentPane.add(lblUredjaji);
		
		JLabel lblTv = new JLabel("TV");
		lblTv.setBounds(31, 159, 46, 14);
		contentPane.add(lblTv);
		
		JLabel lblTus = new JLabel("Tus");
		lblTus.setBounds(31, 193, 46, 14);
		contentPane.add(lblTus);
		
		JLabel lblSat = new JLabel("Alarm");
		lblSat.setBounds(31, 223, 46, 14);
		contentPane.add(lblSat);
		
		JButton btnPrebaciNaKanal = new JButton("Prebaci na kanal");
		btnPrebaciNaKanal.setBounds(167, 155, 113, 23);
		contentPane.add(btnPrebaciNaKanal);
		
		JButton btnPregledSigurnosiSnimki = new JButton("Pregled sigurnosi snimki");
		btnPregledSigurnosiSnimki.setBounds(295, 155, 114, 23);
		contentPane.add(btnPregledSigurnosiSnimki);
		
		JButton btnUkljuci = new JButton("Ukljuci");
		btnUkljuci.setBounds(167, 189, 113, 23);
		contentPane.add(btnUkljuci);
		
		JButton btnNewButton_1 = new JButton("Postavi Alarm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(167, 219, 113, 23);
		contentPane.add(btnNewButton_1);
	}
}
