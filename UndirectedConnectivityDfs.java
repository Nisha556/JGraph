package Graph;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
public class UndirectedConnectivityDfs {

	private Stack<Integer> stack;
	public  UndirectedConnectivityDfs()
	{
		stack = new Stack<Integer>();
		
	}
	public void dfs(int adjacency_matrix[][],int source)

{
		int number_of_nodes = adjacency_matrix[source].length-1;
		int visited[] = new int[number_of_nodes +1];
		int element = source;
		int i = source;
		
		visited[source] = 1;
		stack.push(source);
		while(!stack.isEmpty())
		{
			element = stack.peek();
			i =element;
			while(i<= number_of_nodes)
			{
				if(adjacency_matrix[element][i]== 1 && visited [i] == 0)

			{
					stack.push(i);
					visited[i]=1;
					element = i;
					i =1;
					continue;
					
					}
				i++;
				
			}
			stack.pop();
			
		}
		boolean connected = false;
		for(int vertex = 1; vertex <= number_of_nodes;vertex++)
		{
			if(visited[vertex]==1)
			{
				connected  =true;
				
			}
			else {
				connected = false;
				break;
				
			}
		}
		if(connected)
		{
			System.out.println("The graph is connectd");
			
		}
		else {
			System.out.println("The graph is disconnected");
			
		}
		}
	public static void main(String args[])
	{
		int number_of_nodes , source;
		Scanner scanner = null;
		try {
			System.out.println("Enter the number of the nodes in the graph");
			scanner = new Scanner(System.in);
			number_of_nodes= scanner.nextInt();
			int adjacency_matrix[][] = new int [number_of_nodes + 1][number_of_nodes +1];
			System.out.println("Enter the ajacency matrix");
			for(int i = 1; i<= number_of_nodes; i++)
				for(int j = 1 ;j<= number_of_nodes; j++)
					adjacency_matrix[i][j] = scanner.nextInt();
			for(int i = 1 ; i<= number_of_nodes; i++)
			{
				for(int j = 1; j<= number_of_nodes; j++)
				{
					if (adjacency_matrix[i][j] == 1 && adjacency_matrix[j][i] == 0)
					{
						adjacency_matrix[j][i]= 1;
						
					}
				}
			}
			System.out.println("Enter the source  for the graph");
			source = scanner.nextInt();
            UndirectedConnectivityDfs undirectedConnectivity= new UndirectedConnectivityDfs();

            undirectedConnectivity.dfs(adjacency_matrix, source);	
            
		}
		catch (InputMismatchException inputMismatch)
		{
			System.out.println("Wrong input format");
			
		}
		scanner.close();
	}
}
