package arrays;

public class IntegerArrays {
	public static String toString(int[] array) {
		int number = 0;
		String strArray = "{";
		for(int i= 0; i<array.length; i++) {
			if(i == array.length -1) {
			number = array[i];
			strArray += number; // lägg till kommatecken efter varje siffra
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
		int biggestNbr = array[0]; // variabeln biggestNbr tilldelas värdet av array[0]
		for (int i = 0; i<array.length; i++) { // arrayn gås igenom
			if(array[i] > biggestNbr) {
				biggestNbr = array[i]; // biggestNbr tilldelas värdet av positionen i arrayn
			}
		}
		return biggestNbr;
	}
	public static int min(int[] array) {
		int smallestNbr = array[0]; // variabeln biggestNbr tilldelas värdet av array[ 0 ]
		for (int i = 0; i<array.length; i++) { // arrayn gås igenom
			if(array[i] < smallestNbr) {
			  smallestNbr = array[i]; // biggestNbr tilldelas värdet av positionen i arrayn
			}
		}
		return smallestNbr;
	}
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i<array.length; i++) {
			sum += array[i]; // summerar värden i arrayn
		}
		return sum;
	}
	public static float average(int[] array) {
		float average = 0;
		float sum = 0;
		int counter = 0;
		for (int i = 0; i<array.length; i++) {
			counter++; // räknar antal element
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
				max = array[i]; // tilldelar max ett värde
			}
			else if(array[i] < min) {
				min = array[i]; // tilldelar min ett värde
			}
		}
		range = max - min; // max subtraheras med min för att få fram range
		return range;
	}
	public static void sortAsc(int[] array) {
		int i, j, temp = 0;
		for(i = 0; i<array.length; i++) {
			for(j = i+1; j<array.length; j++) { // loop gås igenom med startvärdet av i+1
				if(array[i] > array[j]) { // om värdet i första loopen är störren än nästlade loopen
					temp = array[i]; // då tilldelas temp värdet av första loopen
					array[i] = array[j]; // den första loopens värde omvandlas till den nästlade loopens värde
					array[j] = temp; // temp tilldelas värdet av den nästlade loopen
				}
			}
		}
    }
	public static void sortDesc(int[] array) {
		int i, j, mValue; // i och j måste deklareras lokalt annars går de ej att använda utanför looparna
		for(i = 0; i <array.length; i++) {
			mValue = array[i];
			for(j = i - 1; (j>=0) && (array[j] < mValue); j--) { // j tilldelas startvärdet av i - 1 om j är större eller lika med noll och om positionen i j är mindre än mValue stegra neråt
				array[j+1] = array[j];
			}
			array[j + 1] = mValue; // array[j + 1] annars blir arrayn "out of bounds"
		}
	}
	public static int[] copy(int[] array) {
		int index = 0;
		int[] newArray = new int[ array.length ]; // ny array skapas
		for( int i = 0; i < array.length; i++ ) {     
			newArray[index] = array[ i ]; // den nya arrayn tilldelas värde via indexvariabeln
			index++;
		}
		return newArray;
	}	
}



