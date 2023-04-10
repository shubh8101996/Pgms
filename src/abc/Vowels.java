package abc;

import java.util.Arrays;
import java.util.List;

public class Vowels {

	public static void main(String[] args) {

//		String str = "shubiohdasdyiaam";
//
//		int count = 0;
//
//		for (int i = 0; i <= str.length() - 1; i++) {
//
//			if (str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'i' | str.charAt(i) == 'o'
//					| str.charAt(i) == 'u') {
//
//				count++;
//
//			}
//		}
//
//		System.out.println(count);

//		int arr[]={4,6,2,38,96,3,2332,435,45};
//		
//		Arrays.sort(arr);
//		
//		for (int i : arr) {
//			
//			System.out.println(i);
//		}
//		
//		   List list=Arrays.asList(arr);
//		   
//		   System.out.println(list);

		int year = 2016;

		if (year % 4 == 0 | year % 100 == 0 | year % 400 == 0) {

			System.out.println("Leap");

		} else {

			System.out.println("Not Leap");
		}

	}

}
