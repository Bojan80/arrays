package arrays;

public class IntegerArrays {
	public static String toString(int[] array) {
		int number = 0;
		String strArray = "{";
		for(int i= 0; i<array.length; i++) {
			if(i == array.length -1) {
			number = array[i];
			strArray += number; // l�gg till kommatecken efter varje siffra
			}
			else {
			number = array[i];
			strArray += number + ", ";
			}
		}
		strArray += "}";
		return strArray;
	}
	public static int max(int[] array) {
		int biggestNbr = array[0]; // variabeln biggestNbr tilldelas v�rdet av array[0]
		for (int i = 0; i<array.length; i++) { // arrayn g�s igenom
			if(array[i] > biggestNbr) {
				biggestNbr = array[i]; // biggestNbr tilldelas v�rdet av positionen i arrayn
			}
		}
		return biggestNbr;
	}
	public static int min(int[] array) {
		int smallestNbr = array[0]; // variabeln biggestNbr tilldelas v�rdet av array[ 0 ]
		for (int i = 0; i<array.length; i++) { // arrayn g�s igenom
			if(array[i] < smallestNbr) {
			  smallestNbr = array[i]; // biggestNbr tilldelas v�rdet av positionen i arrayn
			}
		}
		return smallestNbr;
	}
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i<array.length; i++) {
			sum += array[i]; // summerar v�rden i arrayn
		}
		return sum;
	}
	public static float average(int[] array) {
		float average = 0;
		float sum = 0;
		int counter = 0;
		for (int i = 0; i<array.length; i++) {
			counter++; // r�knar antal element
			sum += array[i]; 
			average = sum / counter; // variabeln average delar summan med antalet element ( counter ) 
		}									
		return average;
	}
	public static int range(int[] array) {
		int max = array[0];
		int min = array[0];
		int range = 0;
		for (int i = 0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i]; // tilldelar max ett v�rde
			}
			else if(array[i] < min) {
				min = array[i]; // tilldelar min ett v�rde
			}
		}
		range = max - min; // max subtraheras med min f�r att f� fram range
		return range;
	}
	public static void sortAsc(int[] array) {
		int i, j, temp = 0;
		for(i = 0; i<array.length; i++) {
			for(j = i+1; j<array.length; j++) { // loop g�s igenom med startv�rdet av i+1
				if(array[i] > array[j]) { // om v�rdet i f�rsta loopen �r st�rren �n n�stlade loopen
					temp = array[i]; // d� tilldelas temp v�rdet av f�rsta loopen
					array[i] = array[j]; // den f�rsta loopens v�rde omvandlas till den n�stlade loopens v�rde
					array[j] = temp; // temp tilldelas v�rdet av den n�stlade loopen
				}
			}
		}
    }
	public static void sortDesc(int[] array) {
		int i, j, mValue; // i och j m�ste deklareras lokalt annars g�r de ej att anv�nda utanf�r looparna
		for(i = 0; i <array.length; i++) {
			mValue = array[i];
			for(j = i - 1; (j>=0) && (array[j] < mValue); j--) { // j tilldelas startv�rdet av i - 1 om j �r st�rre eller lika med noll och om positionen i j �r mindre �n mValue stegra ner�t
				array[j+1] = array[j];
			}
			array[j + 1] = mValue; // array[j + 1] annars blir arrayn "out of bounds"
		}
	}
	public static int[] copy(int[] array) {
		int index = 0;
		int[] newArray = new int[ array.length ]; // ny array skapas
		for( int i = 0; i < array.length; i++ ) {     
			newArray[index] = array[ i ]; // den nya arrayn tilldelas v�rde via indexvariabeln
			index++;
		}
		return newArray;
	}	
}



