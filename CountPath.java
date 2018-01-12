import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.geeksforgeeks.org/find-paths-given-source-destination/

class CountPath {
	public static void main (String[] args) {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    for(int t_0=0;t_0<t;t_0++)
    {
        int V=in.nextInt();
        int E=in.nextInt();
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<E;i++)
        {
            int u=in.nextInt();
            int v=in.nextInt();
            if(!adj.containsKey(u))
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(v);
                adj.put(u,list);
            }
            else
            {
                if(!adj.get(u).contains(v))
                    adj.get(u).add(v);
            }
            
            if(!adj.containsKey(v))
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(u);
                adj.put(v,list);
            }
            else
            {
                if(!adj.get(v).contains(u))
                    adj.get(v).add(u);
            }
        }
        


        int u=in.nextInt();
        int v=in.nextInt();

        /*
        for(Map.Entry e:adj.entrySet())
        {
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        */
        
        //Deque<Integer> p=new ArrayDeque<Integer>();
        if(u==v)
            {
                System.out.println(u);  
            }
        
        else
            {
            boolean[] visited=new boolean[V];
            Deque<Integer> path=new ArrayDeque<Integer>();
            ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
            getAllPaths(u,v,visited,path,adj,result);
            

        for(List<Integer> l : result){
            System.out.println(l);
            }   
        }

    }
    }


    static void getAllPaths(int u,int v,boolean[] visited,Deque<Integer> path,HashMap<Integer,ArrayList<Integer>> adj,ArrayList<ArrayList<Integer>> result)
    {
        /*
        for(Map.Entry e:adj.entrySet())
        {
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        */
        /*
        for(Integer l : path){
            System.out.print(l);
            }
            */  

        
        visited[u]=true;
        path.add(u);
        if(u==v)
            result.add(new ArrayList<Integer>(path));
        else
        {
            if(adj.containsKey(u)){
                    for(Integer i : adj.get(u)){
                        if(!visited[i]){
                            getAllPaths(i, v, visited, path, adj,result);
                        }
                    }
                }
        }

        path.removeLast();
        visited[u] = false;
        //return result;
    }

}