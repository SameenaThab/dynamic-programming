  //https://practice.geeksforgeeks.org/problems/maximum-repeating-number/0
  import java.util.*;
    class Freqwords
    {
    	public static void main(String args[])
    	{
    		LinkedHashMap<Character,Integer> lm=new LinkedHashMap();
    		Scanner in=new Scanner(System.in);
    		//System.out.println("Enter n: ");
    		//int n=in.nextInt();
    		//char[] ch=new char[n];

    		//System.out.println("Enter characters: ");
    		//String s=in.nextLine();
    		char[] ch={'b','a','c','a','c'};
    		for(int i=0;i<4;i++)
    		{
    			
    			if(lm.containsKey(ch[i]))
    				{
  						lm.put(ch[i],lm.get(ch[i])+1);
    				}
    			else
    				lm.put(ch[i],1);
    		}

    		for(Map.Entry e:lm.entrySet())
       	{
       		int m=(int)e.getValue();
       		if(m>1)
       		System.out.println(e.getKey());
       	}


    	}
}