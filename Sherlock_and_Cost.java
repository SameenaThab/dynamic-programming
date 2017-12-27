import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock_and_Cost {
    

    
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int t_0=0;t_0<t;t_0++)
        {
            int n=in.nextInt();
            int[] B=new int[n];
            for(int n_0=0;n_0<n;n_0++)
            {
                B[n_0]=in.nextInt();
            }
            int[][] dp=new int[n][2];
            dp[0][0]=0;
            dp[0][1]=0;
            for(int i=1;i<n;i++)
            {
            dp[i][0] = Math.max(Math.abs(1-B[i-1]) + dp[i-1][1], dp[i-1][0]);  
            dp[i][1] = Math.max((Math.abs(B[i]-B[i-1])+dp[i-1][1]), Math.abs(B[i]-1)+dp[i-1][0]);
            }
            System.out.println(Math.max(dp[n-1][0],dp[n-1][1]));
        }
        
        
    }
    
    
}
