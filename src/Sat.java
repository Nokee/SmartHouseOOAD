import java.sql.Time;

public class Sat extends Uredjaji {
	
	public Sat(){
		uredjaj=UREDJAJ.Sat;
	}
	
	
	public Time PrikaziVrijeme() {
		Time t =new Time(0);
		t.getTime();
		return t;
		
	}
	/**
	 * Salje inforamciju mikrokontroleri
	 * @param h sati
	 * @param min minute
	 */
	public void PostaviAlarm(int h, int min) {
		//send(h,min);
	}

}