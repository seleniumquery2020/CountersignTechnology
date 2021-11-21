package stringStringBufferStringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class FindSameCharacterSetStrings {	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String = ");
		String first = sc.next();
		System.out.println("Enter Second String = ");
		String second = sc.next();
		char[] firstStr = first.toCharArray();
		char[] secondStr = second.toCharArray();
		Arrays.sort(firstStr);
		Arrays.sort(secondStr);
		int status =  1;
		
		for (int i = 0; i < secondStr.length; i++) {
			status = Character.compare(firstStr[i] ,secondStr[i]);
			if(status != 0)
				break;
		}
		
		if(status==0){
			System.out.println("Both String have same character set");
		}
		else{
			System.out.println("Both String don't have same character set");
		}
		
	}

}
