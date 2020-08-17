package Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph6 {
static class Edge {
	int src , dest, weight;
	Edge(int src, int dest , int weight)
	{
		this.src= src;
		this.dest= dest;
		this.weight= weight;
		
	}
};
static class Node {
	int value, weight;
	Node(int value , int weight)
	{
		this.value= value;
		this.weight= weight;
		
		
	}
};
List<List<Node>> adj = new ArrayList<>();
public Graph5(List<Edge> edges)
{
	for(int i = 0; i<edges.size();i++)
		adj.add(i, new ArrayList<>());
	for(Edge e : edges)
	{
		adj.get(e.src).add(new Node(e.dest, e.wegight));
		
		
	}
}
private static void printGraph(Graph5) {
	int src =  0;
int n = graph.adj.size();
while(src < n)
{
	for(Node edge :graph.adj.get(src))
	{
		System.out.println(arc + "-->" + edge.value+ "(" + edge.weight +")\t");
		
	}
	System.out.println();
	src++;
	
}

}
public static void main(String args[])
{
	List<Edge> edges  =Arrays.asList(new Edge(0,1,6), new Edge(1,2,7), new Edge(2,0,5),new Edge(2,1,4), new Edge(3,2,10), new Edge(4,5,1), new Edge(5,4,3));
	Graph5 graph = new Graph5(edges);
	printGraph5(graph);
}
}
