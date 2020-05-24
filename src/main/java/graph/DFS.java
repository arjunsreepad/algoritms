package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
	public static void main(String[] args) {
		Graph graph = new Graph(8);

		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 6);
		graph.addEdge(6, 0);
		graph.addEdge(0, 5);
		graph.addEdge(4, 7);

		dfs(graph, 4);

	}

	private static void dfs(Graph graph, int startingNode) {
		boolean visitedNodes[] = new boolean[graph.nodes];
		
		for (int i = 0; i < graph.nodes; i++) {
			if (!visitedNodes[i])
				
				dfsUtil(graph, i, visitedNodes);
			
		}
	}

	private static void dfsUtil(Graph graph, int node, boolean[] visitedNodes) {

		System.out.println(node);
		visitedNodes[node] = true;
		Iterator<Integer> ite = graph.edgesList[node].iterator();
		while (ite.hasNext()) {
			node = ite.next();
			if (!visitedNodes[node])
				dfsUtil(graph, node, visitedNodes);
		}

	}

}
