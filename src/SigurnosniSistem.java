import java.util.List;

public class SigurnosniSistem {

	private RecordDate recorde;
	private List<Osoba> prisustvo;
	private boolean potvrdaIdetifikacije;
	public SigurnosniSistemView V;
	

	public void snimiKamera() {
		recorde.kamera();
		
		
	}

	public int odrediBrojPrisnutni() {
		return prisustvo.size();
	}

	/**
	 * 
	 * @param t
	 */
	public boolean opasnostOdPozara(SigurnosniSistemController s) 
	{
		if( s.procjenaOpasnostiStanje()>2) 
		{
			paljenjeProtivPozarnogSistema();
			V.pozoviVatrogasce();
			V.obavjestiKorisnika();
			return true;
		}
		return false;
	}
	
	public boolean opasnostOdProvalnika(SigurnosniSistemController s) {
		if( s.procjenaOpasnostiStanje()==1) 
		{
			if(s.identifikacija() || s.idetifikacijaGosta())
				{
				 return false;
				};
			
			V.pozoviPoliciju();
			V.obavjestiKorisnika();
			return true;
		}
		return false;
		
	}

	/**
	 * Slanje informacije o paljenju protivpozarnog sistema
	 */
	public void paljenjeProtivPozarnogSistema() {
		//send()
		
	}

	

}