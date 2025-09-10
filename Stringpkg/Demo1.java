package Stringpkg;

public class Demo1 {

	
	
	public static void main(String [] args) {
//		
//		String str1= "Hello";
//		String str2= new String("Hello");
		
//		System.out.println(str1);
//		int [] arr= new int[5];
//		System.out.println(arr);
//		System.out.println(str2);
		
		
		
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		
		if(str1==str2) {
			System.out.println("Hum Equal he");
		}else {
			System.out.println("Hum Equal nahi he");
		}
		
		if(str3==str4) {
			System.out.println("Hum Equal he");
		}else {
			System.out.println("Hum Equal nahi he");
		}
		
		str1+="e";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str3.equals(str4));
		
		
		
		
		
		
	}
}
