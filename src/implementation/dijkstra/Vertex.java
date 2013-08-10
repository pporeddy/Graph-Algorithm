package implementation.dijkstra;

/*
 * This class stores information of vertex like name, minimum distance, previous vertex
 * adjacent edges. It implements Comparable to compare distances of each vertex.
 */
public class Vertex implements Comparable<Vertex> {
	
	//  Set the name of the Vertex
	public Vertex(String argName) { name = argName; }
	
	// Vertex name
	public final String name;
	// Array of edges from the vertex
	public Edge[] adjacencies;
	// Initialize minimum distances of all vertices to INFINITY
    public double minDistance = Double.POSITIVE_INFINITY;
    // Display vertex name
    public String toString() { return name; }
    // Backtrack to print shortest path
    public Vertex previous;
	
    @Override
	public int compareTo(Vertex o) {
		return Double.compare(minDistance, o.minDistance);
	}



}
