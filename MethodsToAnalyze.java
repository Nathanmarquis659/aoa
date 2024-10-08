/**
 * A collection of methods that work with arrays of ints.
 * 
 * @author mvail
 */
public class MethodsToAnalyze {

	/**
	 * Return index where value is found in array or -1 if not found.
	 * @param array ints where value may be found
	 * @param value int that may be in array
	 * @return index where value is found or -1 if not found
	 */
	public static int find(int[] array, int value) { // 3n + 2
		for (int i = 0; i < array.length; i++) { // 1 (check) + 1(create int) in all cases
			if (array[i] == value) { // !1 (check)
				return i; //ends code
			}
		} // !1 (i++) + !1 (check)
		return -1;
	}

	/**
	 * Replace all occurrences of oldValue with newValue in array.
	 * @param array ints where oldValue may be found
	 * @param oldValue value to replace
	 * @param newValue new value
	 */
	public static void replaceAll(int[] array, int oldValue, int newValue) {
		int index = find(array, oldValue); // 1 + 3n+2 (set)(find() formula)
		while (index > -1) { // 1 (check)
			array[index] = newValue; // !1
			index = find(array, oldValue); // ! 1 + 3n+2 (set)(find() formula)
		} // !1 (check)
	}
	
	/**
	 * Take an int[] and reorganize it so they are in ascending order.
	 * @param array ints that need to be ordered 
	 */
	public static void sortIt(int[] array) {
		for (int next = 1; next < array.length; next++) { // 1 + 1 (set)(check)
			int value = array[next]; // !1
			int index = next; // !1
			while (index > 0 && value < array[index - 1]) { // !1(check)
				array[index] = array[index - 1];
				index--;
			} // !! 1 (check)
			array[index] = value;
		}
	}
}
