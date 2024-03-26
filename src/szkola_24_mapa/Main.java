package szkola_24_mapa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Miejsce[] mapa = new Miejsce[7];
		mapa[0]=new Miejsce("Start");
		mapa[1]=new Miejsce("M1");
		mapa[2]=new Miejsce("M2");
		mapa[3]=new Miejsce("M3");
		mapa[4]=new Miejsce("M4");
		mapa[5]=new Miejsce("M5");
		mapa[6]=new Miejsce("Koniec");


		mapa[0].dodajWyjscia(null, mapa[1], null, null);
		mapa[1].dodajWyjscia(null, mapa[2], null, mapa[0]);
		mapa[2].dodajWyjscia(mapa[3], null, null, mapa[1]);
		mapa[3].dodajWyjscia(mapa[5], null, mapa[2], mapa[4]);
		mapa[4].dodajWyjscia(null, mapa[3], null, null);
		mapa[5].dodajWyjscia(mapa[6], null, mapa[3], null);
		mapa[6].dodajWyjscia(null, null, mapa[5], null);
		
		HashMap<String, Integer> wybory = new HashMap<>();
		wybory.put("n", 0);
		wybory.put("p", 1);
		wybory.put("t", 2);
		wybory.put("l", 3);
		
		
		Scanner scan = new Scanner(System.in);
		Miejsce aktualneMiejsce = mapa[0];
		while(!aktualneMiejsce.equals(mapa[6])) {
			System.out.println("Jesteś w miejscu "+ aktualneMiejsce.getNazwa());
			System.out.println("Możesz iść: " + aktualneMiejsce.podajWyjscia());
			String wybor="";
// 
//			pułapka na wypadek złej odpowiedzi
			do {
				System.out.print("Twój wybór: ");
				wybor=scan.next();
			}		while(!(wybor.equals("n") || wybor.equals("p") || wybor.equals("t")  || wybor.equals("l")) );
			
			aktualneMiejsce = aktualneMiejsce.wybierzWejscie(wybory.get(wybor));
//			switch (wybor) {
//			case 'n': 
//				aktualneMiejsce=aktualneMiejsce.wybierzWejscie(0);
//				break;
//			case 'p': 
//				aktualneMiejsce=aktualneMiejsce.wybierzWejscie(1);
//				break;
//			case 't': 
//				aktualneMiejsce=aktualneMiejsce.wybierzWejscie(2);
//				break;
//			case 'l': 
//				aktualneMiejsce=aktualneMiejsce.wybierzWejscie(3);
//				break;	
//			}
			
			
		}

		System.out.println("Dzielny wędrowcze, dotarłeś na koniec swojej wędrówki");



		

	}

}
