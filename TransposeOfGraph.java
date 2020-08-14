package Graph;
//transpose of graph
import java.util.Scanner;
public class TransposeOfGraph {
private int transposeMatrix[][];
private int numberOfVertices;
public TransposeOfGraph(int numnerOfVertices)
{
	this.numberOfVertices = numberOfVertices;
	transposeMatrix = new int[numberOfVertices +1][numberOfVertices +1];
	
	
}
public int[][] transpose (int adjacencyMatrix[][])
{
	for(int source =1; source<= numberOfVertices ; source++)
	{
		for(destination =1; destination<= numberOfVertices; destination++)
		{
			transposeMatrix[source][destination] = adjacencyMatrix[destination][source];
			
		}
	}
	return transposeMatrix;
	
}
public static void main(String args[])
{
	int number_of_nodes;
	Scanner scanner = null;
	System.out.println("Enter number of node in the graph");
	scanner = new Scanner(System.in);
	number_of_nodes = scanner.nextInt();
	int adjacency_matrix[][]= new int[number_of_nodes+1][number_of_nodes+1];
	int reanspose_matrix[][];
	System.out.println("Enter the adjacency matrix");
	for(int  i =1; i <= number_of_nodes; i++)
	
		for(int  j = 1 ; j<=number_of_nodes; j++)
		
	adjacency_matrix[i][j]= scanner.nextInt();
	TransposeOfGraph transposeOfGraph = new TransposeOfGraph(number_of_nodes );
	transpose_matrix = transposeOfGraph.transpose(adjacency_matrix);
	
	System.out.println("The transpose of matrix");
	for(int i = 1 ; i<= number_of_nodes; i++)
	{
		System.out.print("\t"+i);
		System.out.println();
		for(int source = 1; source <= number_of_nodes ; source++)
		{
			System.out.println(source + "\t");
			for(int destination = 1; destination<= number_of_nodes; destination++)
				
			{
				System.out.println(transpose_matrix[source][destination] +"\t");
				
			}
			System.out.println();
			
		}
		scanner.close();
	}
}
}
