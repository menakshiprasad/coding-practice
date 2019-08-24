
public abstract class Test {

	
		public static void main(String[] args) {

			String s = "Hello how are you";
			
			char c = 'r';
			int value = count(s, c);
			if (value == 0)
				System.out.println("character not found");
			else
				System.out.println("occurence of character: " + value);

		}
		
		public static int count(String s, char c) {
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c)
					cnt++;

			}
			
			

			return cnt;

		}

}
