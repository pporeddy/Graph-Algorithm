package implementation.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraCommons {
	public void computePaths(Vertex source)
	{
	    source.minDistance = 0.0;
	    PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
	    vertexQueue.add(source);
	    
	    while(!vertexQueue.isEmpty()) {
	    	
	    	Vertex u = vertexQueue.poll();
	    	for (Edge e : u.adjacencies)
	        {
	            Vertex v = e.target;
	            double weight = e.weight;
	            double distanceThroughU = u.minDistance + weight;
	            if (distanceThroughU < v.minDistance) {
	            	vertexQueue.remove(v);
	                v.minDistance = distanceThroughU ;
	                v.previous = u;
	                vertexQueue.add(v);
	            }
	        }
	    }
	    
	}

	public List<Vertex> getShortestPath(Vertex target)
	{
		List<Vertex> path = new ArrayList<Vertex>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
			path.add(vertex);

		Collections.reverse(path);
		return path;
	}


}
