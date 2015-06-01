public class SenzorPritiska extends Senzor {
	

	/**
	 * Konstruktor
	 * Zapravo postavlja vrijednost  izmedju (21,23)
	 */
	public SenzorPritiska()
	{
		this.setValue(1+1*Math.random()-1);
	}
	/**
	 * osvjezava podatke sa senzora
	 */
	public void refresh()
	{
		this.setValue(1+Math.random());
	}

}