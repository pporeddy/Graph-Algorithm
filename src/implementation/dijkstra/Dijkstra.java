package implementation.dijkstra;

import java.util.List;



public class Dijkstra {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		Vertex v0 = new Vertex("Harrisburg");
		Vertex v1 = new Vertex("Baltimore");
		Vertex v2 = new Vertex("Washington");
		Vertex v3 = new Vertex("Philadelphia");
		Vertex v4 = new Vertex("Binghamton");
		Vertex v5 = new Vertex("Allentown");
		Vertex v6 = new Vertex("New York");
		v0.adjacencies = new Edge[]{ new Edge(v1,  79.83),
				new Edge(v5,  81.15),
				new Edge(v2,  131.15),
				new Edge(v4,  181.15)};
		v1.adjacencies = new Edge[]{ new Edge(v2,  39.42),
				new Edge(v3, 103.00) };
		v2.adjacencies = new Edge[]{ new Edge(v2,  0.00) };
		v3.adjacencies = new Edge[]{ new Edge(v1, 102.53),
				new Edge(v5,  61.44),
				new Edge(v6,  96.79) };
		v4.adjacencies = new Edge[]{ new Edge(v5, 133.04) };
		v5.adjacencies = new Edge[]{ new Edge(v0,  81.77),
				new Edge(v3,  62.05),
				new Edge(v4, 134.47),
				new Edge(v6,  91.63) };
		v6.adjacencies = new Edge[]{ new Edge(v3,  97.24),
				new Edge(v5,  87.94) };

		DijkstraCommons commons = new DijkstraCommons();
		
		commons.computePaths(v0);
		Vertex vertice = v6;

		System.out.println("Distance to " + vertice + ": " + vertice.minDistance);
		List<Vertex> path = commons.getShortestPath(vertice);
		System.out.println("Path: " + path);
	}

}
