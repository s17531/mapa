package szkola_24_mapa;

public class Miejsce {
	private Miejsce[] wyjscia = new Miejsce[4];
	private String nazwa;
	private String opis;
	public Miejsce(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
	public void dodajWyjscia(Miejsce n, Miejsce p, Miejsce t, Miejsce l) {
		wyjscia[0]=n;
		wyjscia[1]=p;
		wyjscia[2]=t;
		wyjscia[3]=l;
		
	}

	public String podajWyjscia() {
		String wyjsciaText="";
		if(wyjscia[0]!=null) wyjsciaText+="[n]aprzód, ";
		if(wyjscia[1]!=null) wyjsciaText+="w [p]rawo, ";
		if(wyjscia[2]!=null) wyjsciaText+="w [t]ył, ";
		if(wyjscia[3]!=null) wyjsciaText+="w [l]ewo";
		return wyjsciaText;
	}

	public Miejsce wybierzWejscie(int w) {
		return wyjscia[w];
	}
	
	public String getNazwa() {
		return nazwa;
	}


	public String getOpis() {
		return opis;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	
}
