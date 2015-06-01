import java.util.List;

import javax.swing.JOptionPane;


public class SigurnosniSistemController {
	private  int TEMP=40;
	private int INFRA=50;

	private List<Senzor> senzori;
	
	public SigurnosniSistemController()
	{
		senzori.add(new SenzorOsvjetljenja());
		senzori.add(new SenzorPritiska());
		senzori.add(new SenzorTemp());
		
	}

	
	
	public boolean identifikacija() {
		// TODO - implement SigurnosniSistemController.identifikacija
		
		Login frame=new Login(false);
		 List<String> a =frame.display(false);
		if(a.get(0)=="SmartHouseOOAD" && a.get(1)=="SmartHouseOOAD")
		{
			JOptionPane.showMessageDialog(null, "Uspjesno ste prijavljeni");
			return true;
		}
		else return false;
		
	}

	public boolean idetifikacijaGosta() {
		Login frame=new Login(true);
		 List<String> a =frame.display(true);
		if(a.get(0)=="SmartHouseOOAD" && a.get(1)=="SmartHouseOOAD")
		{
			JOptionPane.showMessageDialog(null, "Uspjesno ste prijavljeni");
			return true;
		}
		else return false;
	}

	public double mjerenjeTemperature() {
		return Math.random()*23;
	}

	public double mjerenjePritiska() {
		// TODO - implement SigurnosniSistemController.mjerenjePritiska
		throw new UnsupportedOperationException();
	}
	/**
	 * procjena opasnosti i poduzimanje odgovarajuci mjera
	 * @param s
	 */
    public void procjenaOpasnosti(SigurnosniSistem s) {
    	if (mjerenjeTemperature()>TEMP)
    		s.paljenjeProtivPozarnogSistema();
    	if(mjerenjeOsvjetljenja()>INFRA)
    	{
    		if(!identifikacija()|| !idetifikacijaGosta())
    		s.opasnostOdProvalnika(this);
    	}
    }

    public int procjenaOpasnostiStanje()
    {
    	
    	return (int) (3*Math.random());
    }
    	
		
	



	private int mjerenjeOsvjetljenja() {
		
		return 0;
	}

}