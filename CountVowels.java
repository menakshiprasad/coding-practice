
public class CountVowels {

	public static void main(String[] args) {

		String s = "Hello how are you";
		String v = "aeiou";
		int cnt = 0;
		// StringBuilder sb=new StringBuilder();
		for (int k = 0; k < s.length(); k++) {
			for (int j = 0; j < v.length(); j++) {
				if (s.charAt(k) == v.charAt(j)) {
					cnt = cnt + 1;
				}

			}

		}
		System.out.println("total vowels in String os : " + cnt);

	}
}