
public class SenzorTemp extends Senzor{
	
	/**
	 * Konstruktor
	 * Zapravo postavlja vrijednost  izmedju (21,23)
	 */
	public SenzorTemp()
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

}
