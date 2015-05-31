
public class RegTempController {
	/**
	 * Senzor koji mjeri temperaturu
	 */
	SenzorTemp senzor;
	
	/**
	 * Postavlja temperaturu na zadanu vrijednost
	 * @param t 
	 */
	public void postaviTemp(double t)
	{
		
	}
	/**
	 * Otimalna temeperatura
	 * @retrurn optimalnu temperaturu
	 */
	//TODO vidi kako da skontas optimalnu temperaturu
	public double optimalanaTemp()
	{
		double temp=0;
		return temp;
	}
	/**
	 * Vraca ocitanu temperaturu sa senzora
	 * @return ocitanu temperaturu
	 */
	public double mjerenje()
	{
		senzor.refresh();
		return senzor.getValue();
	}
	/**
	 * korisnicki zadana temperatura
	 * @param k korisnik sistema mora biti vlasnik
	 * @return temperatur koju je korisnik zadao
	 */
	//TODO uradi ovo
	public double korisnickiZadana(Korisnik k)
	{
		double temp=0;
		return temp;
	}
	
}
