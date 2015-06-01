import java.util.List;


public class Sistem {

	private SigurnosniSistem Sigurnost;
	private RegTemp Temperatura;
	private List<Uredjaji> Uredjaji;
	private RegOsvjetljenja Osvjetljenje;

	public void postavkeSistema() {
		Uredjaji.add(new TV());
		Uredjaji.add(new Tus());
		Uredjaji.add(new Zaluzine());
		Uredjaji.add(new Sat());
		
	}

	public void StandAlone() {
		
		
	}

	public void gasenjeSistema() {
		// TODO - implement Sistem.gasenjeSistema
		
	}

	public void PowerSave() {
		// TODO - implement Sistem.PowerSave
		
	}

	public void main() {
		// TODO - implement Sistem.main
		
	}

	/**
	 * @return the sigurnost
	 */
	public SigurnosniSistem getSigurnost() {
		return Sigurnost;
	}

	/**
	 * @param sigurnost the sigurnost to set
	 */
	public void setSigurnost(SigurnosniSistem sigurnost) {
		Sigurnost = sigurnost;
	}

	/**
	 * @return the temperatura
	 */
	public RegTemp getTemperatura() {
		return Temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(RegTemp temperatura) {
		Temperatura = temperatura;
	}

	/**
	 * @return the osvjetljenje
	 */
	public RegOsvjetljenja getOsvjetljenje() {
		return Osvjetljenje;
	}

	/**
	 * @param osvjetljenje the osvjetljenje to set
	 */
	public void setOsvjetljenje(RegOsvjetljenja osvjetljenje) {
		Osvjetljenje = osvjetljenje;
	}

}