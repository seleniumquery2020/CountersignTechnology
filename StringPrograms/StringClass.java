package stringStringBufferStringBuilder;

public class StringClass {

	public static void main(String[] args) {
		
		//Literal way
		String s = "core java";
		String s1 = "core java";
		// with new keyword / With String object
		String str = new String("Selenium");
		String str1 = new String("Selenium");
		String str2 = new String(str);
		String str3 = new String();
		
		System.out.println("s == s1 "+(s==s1)); //== verify the address of variable
		System.out.println("s == s1 "+(s.equals(s1))); //equals() verify the context of string
	    System.out.println(str.equals(str1));
	    

	}
}
