
public class SenzorOsvjetljenja extends Senzor{
	
	/**
	 * Konstruktor
	 * Zapravo postavlja vrijednost  izmedju (21,23)
	 */
	public SenzorOsvjetljenja() 
	{
		this.setValue(22+2*Math.random()-1);
	}
	/**
	 * osvjezava podatke sa senzora
	 */
	public void refresh()
	{
		this.setValue(22+4*Math.random()-2);
	}
	/**
	 * Senzor koji registruje 
	 * prisustvo korisnika u sobi
	 * @return
	 */
	public boolean registrujPrisustvo()
	{
		return (Math.random()>0.5);
	}
	
}
