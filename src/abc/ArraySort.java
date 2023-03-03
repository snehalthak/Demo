package abc;

import java.util.Arrays;

public class ArraySort
{
		public static void main(String[] args)
		{
		int arr[]=new int[] {0,-1,-2,-3,4,5};
		System.out.println("Descending");
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.println(arr[i]+"");
		Arrays.sort(arr);
		}
		System.out.println("Ascending");
		for(int i=0;i<=arr.length;i++)
		{
		System.out.println(arr[i]+"");
		Arrays.sort(arr);
		}
		}
}
//		int arr[]=new int[4];
//		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=0;
//		arr[3]=-1;
//		for(int i=0;i<arr.length;i++)
//		{
//		System.out.println(arr[i]+ "");
//		Arrays.sort(arr);
//}
//		}
//}
