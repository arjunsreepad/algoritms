package graph;

import java.util.LinkedList;

public class Graph {
	int nodes;
	LinkedList<Integer> edgesList[];
	
	public Graph(int nodes) {
		edgesList = new LinkedList [nodes];
		for (int i = 0; i < nodes; i++) {
			edgesList[i] = new LinkedList<Integer>();
		}
		this.nodes = nodes;
	}
	
	public void addEdge(int node, int edge) {
		edgesList[node].add(edge);
	}

}
