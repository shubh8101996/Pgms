package abc;

public class StringRev {

	public static void revString(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) { // i=0

			char a = str.charAt(i);
			rev = rev + a;

		}

		System.out.println(rev);

	}

	public static void main(String[] args) {

		revString("shubham");

//		StringBuffer sb=new StringBuffer("selenium");
//		
//		System.out.println(sb.reverse());

	}

}
