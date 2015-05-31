import java.util.List;

import javax.swing.JOptionPane;

public class SigurnosniSistemController {

	private List<Senzor> senzori;

	public void ukljuciKamere() {
		// TODO - implement SigurnosniSistemController.ukljuciKamere
		throw new UnsupportedOperationException();
	}
	
	
	public static void main(String[] args )
	{
		SigurnosniSistemController r=new SigurnosniSistemController();
		r.identifikacija(null);
	}

	/**
	 * 
	 * @param k
	 */
	public boolean identifikacija(Korisnik k) {
		// TODO - implement SigurnosniSistemController.identifikacija
		
		Login frame=new Login(true);
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null, frame.getUsername());;
		return false;
		
	}

	public void idetifikacijaGosta() {
		// TODO - implement SigurnosniSistemController.idetifikacijaGosta
		throw new UnsupportedOperationException();
	}

	public double mjerenjeTemperature() {
		// TODO - implement SigurnosniSistemController.mjerenjeTemperature
		throw new UnsupportedOperationException();
	}

	public double mjerenjePritiska() {
		// TODO - implement SigurnosniSistemController.mjerenjePritiska
		throw new UnsupportedOperationException();
	}

}