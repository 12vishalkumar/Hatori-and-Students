import java.io.*;
import java.util.*;
public class ptc
{
    static int chooseMaxStudents(ArrayList<Integer> h, int n)
    {
        // Write your code here
        int count = 1;
		Collections.sort(h);
        for(int i=0;i<n;i++)
        {
			for(int j=i;j<n;j++)
			{
				int a = h.get(j)-h.get(i);
				if(a <=5)
				{
					count = Math.max(count, j-i+1);
				}
            }
        }
		return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
         ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int j=0;j<T;j++)
        {
            for(int i=0;i<n;i++)
            {
				arr.add(sc.nextInt());
            }
            System.out.println(chooseMaxStudents(arr, n));
        }
    }
}