package dec11;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "delhi";
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
	}

}
