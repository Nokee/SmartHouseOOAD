public class UredjajView {

	public RecordDate PrikaziStanjeUredjaja(UredjajController u) {
		return new RecordDate(u);
	}
	
	public int PrikaziUsteduEnergije() {
		return (int) (2*Math.random()+1);
	}
	
	/**
	 * Ispisuje sve podatke vezane za sistem
	 */
	public void display(){
		
	}

}