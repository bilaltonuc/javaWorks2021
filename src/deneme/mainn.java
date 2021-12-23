package deneme;

import java.util.HashMap;
import java.util.Map;

public class mainn {

	public static void main(String[] args) {

		Map<String, Double> TLHesap = new HashMap<>();

		TLHesap.put("Hesap No",  (double) 125);
		TLHesap.put("Bakiye", (double) 0);
		TLHesap.put("Tarih", 12.12/2021);
		System.out.println(TLHesap);
		
		

	}

}
