package Graph;
//Java Program to do a Breadth First Search/Traversal on a graph non-recursively
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
static  void breathFirstSearch(int[][] matrix, int source)
{
	boolean[] visited = new boolean[matrix.length];
	visited[source-1] =true;
	Queue<Integer>queue = new LinkedList<>();
	queue.add(source);
	System.out.println("The breath first order is");
	while(!queue.isEmpty())
	{
		System.out.println(queue.peek());
		int x =queue.poll();
		//int i ;
		for(int i = 0; i<matrix.length;i++)
		{
			if(matrix[x-1][i]== 1 &&visited[i]==false)
			{
				queue.add(i+1);
				visited[i] =true;
			}
		}
		
	}
}
public static void main(String args[])
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int vertices;
	try {
		vertices = Integer.parseInt(br.readLine());
		
	}
	catch(IOException e)
	{
	System.out.println("An error occured");
	return;
	}
	int[][] matrix = new int[vertices][vertices];
	System.out.println("Enter the adjacency matrix");
	int  i , j;
	for(i = 0 ; i<vertices; i++)
	{
		for(j=0;j<vertices;j++)
		{
			try {
				matrix[i][j]= Integer.parseInt(br.readLine());
				
			}
			catch(IOException e)
			{
				System.out.println("An error occured");
				
			}
		}
	}
	int source;
	System.out.println("Enter the vertex");
	try {
		source = Integer.parseInt(br.readLine());
		
		
	}
	catch(IOException e)
	{
		System.out.println("An eror occured");
		return;
		
	}
	breathFirstSearch(matrix,source);
	 //breadthFirstSearch(matrix,source);
	 
	
}
}
