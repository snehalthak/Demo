package abc;

public class ArmStrongNo 
{  
	public static void main(String[] args) 
{

	   int n = 371, originalNum, remainder, result = 0;
	   originalNum = n;
	            while (originalNum != 0)
	            {
	                remainder = originalNum % 10;
	                result += Math.pow(remainder, 3);
	                originalNum /= 10;
	            }   
	            if(result == n)
	                System.out.println(n + " is an Armstrong number.");
	            else
	                System.out.println(n + " is not an Armstrong number.");
	        }

}
/*
 * 371 is an Armstrong number.
 * 
 * 371 = 3*3*3+7*7*7+1*1*1 27+343+1 371
 * 
 * 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 1+1296+81+256 1634
 */

