package arrays;

public class Integer2dArrays {
	public static String toString(int[][] array){
		String strArray = "{";
		for(int row=0; row<array.length; row++) { // k�r igenom arrayn
			strArray += "{";
			for(int column=0; column<array[ row ].length; column++) { // loopar genom kolumner
				if(column == array[row].length -1) {
					strArray += array[ row ][ column ]; 
				}
				else {
					strArray += array[ row ][ column ] + ", ";
				}
			}
			if(row == array.length -1) {
				strArray += "}";
			}
			else {
				strArray += "}" + ",";
			}
		}
		strArray += "}";
		return strArray;
	}
	public static int elements(int[][] array) {
		int countElements = 0;
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[ row ].length; column++) {
			countElements++; // r�knar antal element
			}
		}
		return countElements;
	}
	public static int max(int[][] array) {
		int biggestNbr = array[0][0]; // biggestNbr tilldelas v�rde 
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[ row ].length; column++) {
				if(array[ row ][ column ]> biggestNbr) { // om v�rdet av 2d arrayn �verstiger biggestNbr
					biggestNbr = array[ row ][ column ];	// tilldelas v�rdet biggestNbr			
				}
			}
		}
		return biggestNbr;
	}
	public static int min(int[][] array) {
		int smallestNbr = array[0][0];
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[ row ].length; column++) {
				if(array[ row ][ column ] < smallestNbr) {
					smallestNbr = array[ row ][ column ];				
				}
			}
		}
		return smallestNbr;
	}
	public static int sum(int[][] array) {
		int sum = 0;
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[ row ].length; column++) { // 2d arrayn g�s igenom
				sum += array[ row ][ column ];	// v�rdena summeras		
			}
		}
		return sum;
	}
	public static float average(int[][] array) {
		float average = 0;
		float sum = 0;
		int counter = 0;
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[ row ].length; column++) {
				counter++; // r�knar antal element
				sum += array[ row ][ column ];
				average = sum / counter; // summan delas med antalet element
			}
		}
		return average;
	}
}

