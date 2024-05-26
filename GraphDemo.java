package classDemo;

import java.util.*;

class Graph<T>
{
  private Map<T,List<T>> g=new HashMap<>();	
  
  //add vertex
  
  void addVertex(T t)
  {
	  g.put(t, new LinkedList<T>());
	  
  }
  
  //add edge
  
  void addEdge(T source, T destination, Boolean bidirect)
  {
	  
	  if(!g.containsKey(source))
		  addVertex(source);
	  if(!g.containsKey(destination))
		  addVertex(destination);
	  g.get(source).add(destination);
	  if(bidirect==true)
	  {
		  g.get(destination).add(source);
	  }
	    
  }
  
  //get vertex count
  
  void getVertexCount()
  {
	  
	  System.out.println("Vertex count "+g.keySet().size());
  }
  
  //get edges count
  
  void getEdgeCount(Boolean bidirect)
  {
	  int c=0;
	  for(T i:g.keySet())
	  {
		  c+=g.get(i).size();
	  }
	  if(bidirect==true)
		  c=c/2;
	  
	  System.out.println("Edge Count: " + c);
	  
  }
  
  
  
  //edge present
  
  void isEdgePresent(T src, T dest)
  {
	  if(g.get(src).contains(dest))
	  {
		  System.out.println("Edge is present");
	  }
	  else
		  System.out.println("Edge is not present");
  }
  
  //vertex present
  
  void isVertexPresent(T t)
  {
	  if(g.containsKey(t))
		  System.out.println("Vertex is present");
	  else
		  System.out.println("Vertex is not present");
		  
	  
  }

//print the graph
  
  public String toString()
  {
	  
	 for(T v: g.keySet())
	 {
		 System.out.println("Vertex: "+v);
		 
		 System.out.print("->" +g.get(v));
	 }
	  
	  
	return null;
	  
	  
  }
  
  void DFSUtil(Integer v, boolean visited[])
  {
	  visited[v]=true;
	  
	  System.out.print(v + " ");
	  
      // Recur for all the vertices adjacent to this
      // vertex
      Iterator<T> i = g.get(v).listIterator();
      while (i.hasNext()) {
          int n = (int)i.next();
          if (!visited[n])
              DFSUtil(n, visited);
      }
	  
  }
  
  void DFS(Integer v)
  {
	  
	  Integer s=g.keySet().size();
	 boolean visited[]=new boolean[s];
	 
	 DFSUtil(v,visited);
	  
  }
  
  void BFS(Integer v)
  {
	  Integer s=g.keySet().size();
	  boolean visited[]=new boolean[s];
	  
	  
	  
	  Queue<Integer> q=new LinkedList<>();
	  
	  q.add(v);
	  visited[v]=true;
	  
	  while(!q.isEmpty())
	  {
		  Integer val=q.remove();
		  System.out.println("... " + val);
		  
		  Iterator<T> it=g.get(val).listIterator();
		  while(it.hasNext())
		  {
			  Integer n=(Integer)it.next();
			  
			   if(!visited[n])
				   {
				   visited[n]=true;
				   q.add(n);
				   }
			   		
		  }
		  
	  }
	  
	  
  }
  
}


public class GraphDemo {
	
	public static void main(String str[])
	{
		Graph<Integer> g = new Graph<Integer>();
		 
        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
     /*   g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);
        
		g.addEdge(0, 1,false);
        g.addEdge(0, 2,false);
        g.addEdge(1, 2,false);
        g.addEdge(2, 0,false);
        g.addEdge(2, 3,false);
        g.addEdge(3, 3,false);*/
		
		g.addEdge(0, 1,false);
        g.addEdge(0, 2,false);
        g.addEdge(1, 3,false);
        g.addEdge(1, 4,false);
        g.addEdge(2, 4,false);
 
        g.toString();
        
     // Gives the no of vertices in the graph.
        g.getVertexCount();
 
        // Gives the no of edges in the graph.
        g.getEdgeCount(true);
 
        // Tells whether the edge is present or not.
        g.isEdgePresent(2, 4);
 
        // Tells whether vertex is present or not
        g.isVertexPresent(1);
        
      //  g.DFS(2);
        
        
        
        g.BFS(0);
		
	}

}
