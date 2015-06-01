import java.util.List;


public class Sistem {

	private SigurnosniSistem Sigurnost;
	private RegTemp Temperatura;
	private List<Uredjaji> Uredjaji;
	private RegulacijaOsvjetljenja Osvjetljenje;

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

}