import java.lang.Math;

public class RegTemp {
	
	/*var Temperatura
	 * 
	 */
	private double temp;
	
	/**Postavlja temperaturu
	 * @param temperatura koja korisnik zada
	 */
	public void setTemp(RegTempController t)
	{
		this.temp=t.optimalanaTemp();
	}
	
	/**Prikazuje temperaturu
	 * @return Temperaturu koja je postavljena za regulaciju
	 */
	public double getTemp()
	{
		return this.temp;
	}
	
	/**
	 * Konstruktor ??Sta reci koju poslugu porati
	 */
	public RegTemp()
	{
		//Postavlja na optimalnu kucnu temperaturu
		temp=22;
	}
	
	/**
	 * Odrzava temperaturu
	 * Pomocna funkcija za regulaciju
	 */
	//TODO Iplementiraj
	private void odrzavanjeTemp()
	{
		
	}
	
	/**
	 * Vrsi sljanje vrijednosti temperature mikrokontroleru
	 * Koristi regulacija 
	 * Vraca random rezultat (temp-1,temp+1)
	 * @param temp temperatura na koju se treba postaviti ne mora biti uvijek vise moze i manja
	 * @return temperaturu koju mickrokontroler ocitava
	 */
	//TODO implementacija kad budes znao polsat mickrocontrlleru
	public double zagrijavanjeProstorije(double temp)
	{
		return temp+2*Math.random()-1;
	}
	
	/**
	 * Vrsi regulaciju u kuci
	 * koristi RegTempContrller
	 * @param temp 
	 */
	
	public void regulacija(RegTempController t)
	{
		if(Math.abs(t.mjerenje()-this.temp)<1)
		{
			odrzavanjeTemp();
		}else
			zagrijavanjeProstorije(t.optimalanaTemp());
	}

	
	
	

}
