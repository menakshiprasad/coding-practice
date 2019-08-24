import java.util.*;

public class Program1 {
//If "Java J2EE Java JSP J2EE" is the given string then occurrences
	 //of each character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.

	public static void main(String[] args) {
		String str="Java J2EE Java JSP J2EE";
		
		Map<Character, Integer> m=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			if(m.get(str.charAt(i))!=null)
			{
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
			}
			else
			{
				m.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(m);
		

	}

}
