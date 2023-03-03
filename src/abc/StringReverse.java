package abc;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="HOME";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println("Original String:"+str);
		System.out.println("Reverse String is:"+revstr);
	}
//    String str="Snehal";
//    StringBuilder sb=new StringBuilder(str);
//    str=sb.reverse().toString();
//    System.out.println("Reversed String : " +str);
//	}
}
