package abc;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		int n=121;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
	System.out.println("No. is palindrome");
		else
			System.out.println("No is not palindrome");
	}

}
