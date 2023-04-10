package abc;

public class FindString {

	public static void main(String[] args) {

		String str = "shub637671amASASSD253java";

		String str1 = "shub637671amASASSD253java";

		str = str.replaceAll("\\d", ""); //Integer

		System.out.println(str);

		String str2 = str1.replaceAll("[a-zA-Z]", "");
		System.out.println(str2);

	}

}
