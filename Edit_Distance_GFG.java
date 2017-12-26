//Edit Distance geeks for geeks
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int q=in.nextInt();
	    for(int i=0;i<q;i++)
	    {
	        int n1=in.nextInt();
	        int n2=in.nextInt();
	        String s1=in.next();
	        String s2=in.next();
	        int count=dp(s1,s2,0,0);
	        System.out.println(count);
	    }
	    
	}
	    
	    static int dp(String s1,String s2,int i,int j)
	    {
	        if(i>=s1.length()&&j>=s2.length())
	            return 0;
	        if(i>=s1.length()||j>=s2.length())
	            return 1;
	        if(s1.charAt(i)!=s2.charAt(j))
	          return Math.min(Math.min(1+dp(s1,s2,i,j+1),1+dp(s1,s2,i+1,j)),1+dp(s1,s2,i+1,j+1));
	        else
	            return dp(s1,s2,i+1,j+1);
	        
	    }
		//code
	
}