public class SistemView {
	
	private Sistem a;
	
	public SistemView(Sistem s)
	{
		a=s;
	} 
	
	
	/**
	 * Prikazuje interfejs o stanju sistema
	 */
	public void PrikaziStanjeSistema() {
		StanjeSistema sistema=new StanjeSistema();
		sistema.display(a.getTemperatura().getTemp(), a.getOsvjetljenje().getOsvjetljenje(),
				(int) (4*Math.random()),a.getSigurnost().odrediBrojPrisnutni());
		
		
		
	}

	/**
	 * Vrsi obavjestavanje korisnika u vidu slanja sms poruka
	 */
	public void ObavjestavajKorisnika() {
		// TODO - implement SistemView.ObavjestavajKorisnika
		
	}

}