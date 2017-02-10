import java.util.Scanner;

public class Reverse_String {
	
	public static void main(String[] args){
		String original;
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		original = scan.nextLine();
		System.out.println("Original String is: "+ original);
		StringBuilder builder = new StringBuilder(original);
		int len = builder.length();
		for(int i=0;i<len/2;i++){
			char a = builder.charAt(i);
			int b = len-i-1;
			builder.setCharAt(i, builder.charAt(b));
			builder.setCharAt(b, a);
		}
		original = builder.toString();
		System.out.println("Reversed String is: "+ original);
	}
}
