
public class RegTempView {
	
	/**
	 * Vraca vrijednsot iz RegTemp
	 * @param RegTemp
	 * @return
	 */
	//TODO
	public double getTemp(RegTemp t)
	{
		
		return t.getTemp();
	}
	/**
	 * Vraca vrijednost koju izmjeri
	 *  senzor iz RegTempController 
	 * @param RegTempController
	 * @return
	 */
	//TODO
	public double ocitavanjeMjerenja(RegTempController t)
	{
		return t.mjerenje();
	}
	
	/**
	 * Prikazuje vrijednosti 
	 * temperature i temperature koja se mjeri
	 */
	public void display()
	{
		
	}

}
