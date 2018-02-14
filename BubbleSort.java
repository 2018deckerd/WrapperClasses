import java.util.Scanner;

/**
 * Implements the bubble sorting algorithm on an Integer array of objects
 * @author Dylan Decker
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		System.out.println("How many elements would you like to store in the array?");
		Scanner scnr = new Scanner(System.in);
		String size = scnr.nextLine();
		Integer sizeInt = Integer.parseInt(size);
		Integer[] arr = new Integer[sizeInt];
		// reads in the value of each number seperately
		for (Integer i = 0; i < sizeInt; i++) {
			System.out.println("Please type the value of element " + i + " then press enter.");
			String value = scnr.next();
			arr[i] = Integer.parseInt(value);
		}
		// the bubble sort algorithm
		for (Integer i = 0; i < sizeInt - 1; i++) {
			for (Integer j = i + 1; j < sizeInt; j++) {
			Integer temp = 0;
			if (arr[i].compareTo(arr[j]) > 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		  }
		}
		
		// prints out the sorted array
		System.out.println("Sorted array using Bubble Sort algorithm: ");
		for (Integer element: arr) {
			System.out.print(element.toString() + " ");
		}
		
	}
	

}
