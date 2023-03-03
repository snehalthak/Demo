package abc;

public class Star 
{

	//private static final int i = 0;

	public static void main(String args[])
	{

  int n = 7;
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          // printing '*' in each column.
	          for(int j=0;j<=i;j++)
	          {
	            System.out.print("* ");
	          }
	          System.out.println();
	      }
	  }}