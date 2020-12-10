package Graphs;

public class DepthFirstSearchRecursive {

    public void dfsRecursive(Vertex vertex){

    	vertex.setVisited(true);
		System.out.print(vertex + " --> ");

		for (Vertex v : vertex.getNeighbourList()){
			if(!v.isVisited() ){
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
	}

}
