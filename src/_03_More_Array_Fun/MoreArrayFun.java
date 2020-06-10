package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"hello", "my", "name", "is", "Lucas"};
		new MoreArrayFun().printStrings(strings);
		new MoreArrayFun().printBackwardsStrings(strings);
		new MoreArrayFun().printEveryOtherString(strings);
		new MoreArrayFun().printRandomString(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	void printStrings(String[] strings) {
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);	
		}
		System.out.println();
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void printBackwardsStrings(String[] strings) {
		for(int i = strings.length-1; i>=0; i--) {
			System.out.println(strings[i]);	
		}
		System.out.println();
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.

	void printEveryOtherString(String[] strings) {
		for(int i = 0; i<strings.length; i++) {
			if(i%2==0) {
				System.out.println(strings[i]);	
			}
		}
		System.out.println();
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	void printRandomString(String[] strings) {
		ArrayList<String> stringsPrinted = new ArrayList<String>();
		int random;
		while(stringsPrinted.size() < 5) {
			random = new Random().nextInt(5);
			if(!stringsPrinted.contains(strings[random])) {
				System.out.println(strings[random]);
				stringsPrinted.add(strings[random]);
			}
		}
		System.out.println();
	}
	
}
