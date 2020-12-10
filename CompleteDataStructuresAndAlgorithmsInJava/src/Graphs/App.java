package Graphs;

public class App {

    public static void main(String[] args) {

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex4);

        //vertex2.addNeighbour(vertex1);
        vertex2.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex5);

        //vertex3.addNeighbour(vertex2);
        //vertex3.addNeighbour(vertex5);

        //vertex4.addNeighbour(vertex1);
        //vertex4.addNeighbour(vertex5);

        vertex5.addNeighbour(vertex3);
        vertex5.addNeighbour(vertex4);

//        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
//        breadthFirstSearch.bfs(vertex1);

//        DepthFirstSearchStack depthFirstSearchStack = new DepthFirstSearchStack();
//        depthFirstSearchStack.dfs(vertex1);

//        DepthFirstSearchRecursive depthFirstSearchRecursive = new DepthFirstSearchRecursive();
//        depthFirstSearchRecursive.dfsRecursive(vertex1);

        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.dfsRecursive(vertex1);

    }

}
