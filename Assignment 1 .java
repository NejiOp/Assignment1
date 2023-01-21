package tool;

public class main {

	public static void main(String[] args)
	{
	        int i=0,j=0,n=4,k=0;
	        for(i=0; i<n; i++)
	        {
	            k=1;
	            for(j=0; j<(n+i); j++)
	            {
	               if(j<n-i-1)
	                    System.out.print(" ");
	                else
	                {
	                    System.out.print(""+k);
	                    if(j<(n-1))
	                        k++;

	                    else
	                        k--;
	                }
	            }
	            System.out.println(" ");
	        }
	    }

	}
