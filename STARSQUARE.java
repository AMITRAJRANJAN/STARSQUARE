package starsquare;

import java.util.Scanner;

public class STARSQUARE 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a value :");
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n");
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int j=1;j<=(n-2);j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
        }
    }
    
}
