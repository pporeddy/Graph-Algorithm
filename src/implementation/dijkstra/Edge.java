package implementation.dijkstra;

/* This class is used to store the information about edge
 * it has edge weight and target vertex
 */

public class Edge {
	
	// Target Vertex of the Edge
	public final Vertex target;
	// Weight of the Edge
	public final double weight;
	
	/*Initialize Target and Weight of the Edge
	 * @param Sets the target Vertex
	 * @param Sets the weight of the Edge
	 */
	public Edge(Vertex aTarget, double aWeight) {
		target=aTarget;
		weight= aWeight;
		
	}

}
