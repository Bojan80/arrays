package arrays;

public class CountryArrays {
	public static String toString(Country[] array) {
		String strArray = "{"; // skapar ett sträng objekt av { som inledning till arrayn
		for(int i=0; i<array.length; i++) {
			strArray += array[i];
			if( i < array.length-1) {
				strArray += ", "; // strArray tilldelas ett kommatecken för att separera objekten i arrayn
			}
		}
		strArray += "}"; // strängen } avslutar arrayn
		return strArray;
	}
	public static int indexOf(Country[] array, Country country) {
		for(int i = 0; i < array.length-1; i++) {
			if( country.equals(array[i])) {
				return i; // returnerar positionen för countryelementet i arrayn
			}
		}
		return -1; // finns inte elementet i arrayn returneras -1
	}
	public static boolean member(Country[] array, Country country) {
		for(int i = 0; i < array.length-1; i++) {
			if( country.equals(array[i]) ) {
				return true; // returnerar true om countryobjektet finns i arrayn
			}
		}
		return false;
	}
	public static Country min(Country[] array) {
		Country min = array[0];  // antar att det minsta elementet är i array[0] 
		for(int i = 0; i < array.length-1; i++) {
			 if(min.compareTo( array[i] ) > 0 ) { 
				 min = array[i]; // min tilldelas minsta elementet i arrayn 
			 }
		}
		return min; // returnera minsta elementet
	}
	public static Country max(Country[] array) {
		Country max = array[0];  
		for(int i = 0; i < array.length-1; i++) {
			 if(max.compareTo( array[i] ) < 0 ) { 
				 max = array[i];
			 }
		}
		return max;
	}
}

