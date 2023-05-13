package code;

public class StringFunctions {

	public static boolean isPalindrome(String str) {

		String result = "";
		boolean flag = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println(result);
		if (str.equalsIgnoreCase(result)) {
			flag = true;
		}

		return flag;
	}

}
