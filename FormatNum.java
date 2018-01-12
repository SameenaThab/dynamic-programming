import java.util.*;
import java.lang.*;
import java.io.*;

//formatting a number with commas

class FormatNum
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Stack<String> st=new Stack();
		int N=in.nextInt();
		String S=Integer.toString(N);
		int n=S.length();
		StringBuilder sb=new StringBuilder();
		if(n<=3)
		{
			System.out.print(S);
		}
		else
		{
			st.push(S.substring(n-3,n));
			st.push(",");
			int m=n-3;
			while(m-2>0)
			{
				st.push(S.substring(m-2,m));
				st.push(",");
				m=m-2;
			}
			st.push(S.substring(0,m));
			while(!st.isEmpty())
			{
				sb.append(st.pop());
			}
			System.out.print(sb.toString());	
		}
	}
}