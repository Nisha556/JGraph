package Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Graph5 {
static class Edge {
	int src, dest;
	Edge(int src , int dest)
	{
		this.src = src;
		this.dest = dest;
		
	}
};
List<List<Integer>> adj = new ArrayList<>();
public Graph5(List<Edge> edges)
{
	for(int i = 0; i<edges.size();i++)
	
		adj.add(i, new ArrayList<>());
		
	for(Edge current : edges)
	{
		adj.get(current.src).add(current.dest);
		
	}
		
}
private static void printGraph(Graph5 graph)
{
	int src= 0;
	int n  = graph.adj.size();
	while(src < n)
	{
		for(int  dest : graph.adj.get(src))
			System.out.println("(" +src + "-->" +dest +")\t");
		System.out.println();
		src++;
	}
}
public static void main(String args[])
{
List<Edge> edges = Arrays.asList(new Edge(0,1) , new Edge(1,2), new Edge(2, 0), new Edge(2,1), new Edge(3,2), new Edge(4,5), new Edge(5,4));
Graph5 graph=  new  Graph5(edges);
printGraph(graph);
}
}
