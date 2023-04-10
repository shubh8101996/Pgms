package abc;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 20, 40, 50, 50, 30, 10 };
		
		
		int uniqueArray[]=Arrays.stream(a).distinct().toArray();
		
		for (int i : uniqueArray) {
			System.out.println(i);
		}
		
		
		String a1="abc";
		
		StringBuffer sb=new StringBuffer("shubham");
		System.out.println(sb.reverse());

		
	}

}
