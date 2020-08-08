package Graph;
import java.util.*;
public class Graph1 {
private List<Node> nodes = new ArrayList<Node>();
private int numberOfNodes =0;
public boolean checkForAvailability()
{
	return this.numberOfNodes > 1;
	
}
public void createNode(Node node)
{
	this.nodes.add(node);
	this.numberOfNodes++;
}
public int getNumberOfNodes()
{
	return this.numberOfNodes;
}
}
 class Main1 {
	public static void main(String args[])
	{
		Graph1 graph = new Graph1();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		graph.createNode(node1);
		graph.createNode(node2);
		graph.createNode(node3);
		Edge e12 = new Edge(node1 , node2 , 5,1);
		Edge e13 = new Edge(node1 , node3 , 10, 2);
		if(graph.checkForAvailability())
		{
			node1.addNeighbour(e12);
			node1.addNeighbour(e13);
			
		}
		else {
			System.out.println("There are less than 2 nodes. Add more to connect.");
		}
	}
}

