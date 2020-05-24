package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

		bfs(graph, 1);

	}

	private static void bfs(Graph graph, int startingPoint) {
		boolean[] visitedNodes = new boolean[graph.nodes];

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(startingPoint);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.println(node + "  ");
			visitedNodes[node] = true;
			Iterator<Integer> ite = graph.edgesList[node].iterator();
			while (ite.hasNext()) {
				node = ite.next();
				if (!visitedNodes[node])
					queue.add(node);
			}

		}

	}

}
