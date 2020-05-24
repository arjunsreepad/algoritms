package graph;

import java.util.Iterator;

public class MotherVertex {
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
		int vertex = -1;
		for (int i = 0; i < graph.nodes; i++) {
			if (!visitedNodes[i])
				vertex = i;
				dfsUtil(graph, i, visitedNodes);
			
		}
		System.out.println("Mother vertex " + vertex);
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