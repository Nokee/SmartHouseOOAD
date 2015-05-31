import java.sql.Time;


public class RegOsvjetljenjaController {
	SenzorOsvjetljenja senzor;
	
	
	/**
	 * Vraca
	 * Podatak da li treba svjetlo da se ugasi
	 * @param t daje vrijeme jer 
	 * zavisi od doba dana funkcija 
	 * @return da ili ne 
	 */
	@SuppressWarnings("deprecation")
	public boolean gasenjeSvjetala(Time t)
	{
		if(t.getHours()>6 && t.getHours()<17)
		{
			return true;
		} else
		if(t.getHours()>0 && t.getHours()<6)
		{
			if(senzor.registrujPrisustvo())
			{
				return false;
			}else 
				return true;
			
		}else
			if(senzor.registrujPrisustvo())
			{
				return false;
			}
			else return true;
	}
	/**
	 * Vraca vrijednost osvjetljenja za to doba dana
	 * @return
	 */
	public double optimalnoOsvjetljenje()
	{
		return 22*Math.random();
	}
	/**
	 * postavlja zadano osvjetljenje
	 * @param o
	 */
	public void postaviOsvjetljenje(RegOsvjetljenja o)
	{
		o.setOsvjetljenje(this.optimalnoOsvjetljenje());
	}
	/**
	 * Korisnik zadaje osvjetljenje
	 * @param k
	 */
	//TODO implementacija funkcije
	public void zadajOsvjetljenje(Korisnik k)
	{
		
	}
}
