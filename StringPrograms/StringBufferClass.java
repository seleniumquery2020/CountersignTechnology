package stringStringBufferStringBuilder;

public class StringBufferClass {
	
	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer("Program");
				
		System.out.println(buff);
		int cap = buff.capacity();
		System.out.println(cap);
		
		//buff.delete(0,3);
		//System.out.println(buff);
		
		//buff.deleteCharAt(3);
		//System.out.println(buff);
		
		//buff.reverse();
		//System.out.println(buff);
		
		buff.trimToSize();
		System.out.println(buff.capacity());
		
		String s = new String(buff);
		StringBuffer sb = new StringBuffer(s);
		String s1 = buff.toString();
	}

}
