package Graphs;

import java.util.Stack;

public class TopologicalSort {

    private Stack<Vertex> stack;

    public TopologicalSort() {
        this.stack = new Stack<>();
    }

    public void dfsRecursive(Vertex vertex) {

        vertex.setVisited(true);

        for (Vertex v : vertex.getNeighbourList()) {
            if (!v.isVisited()) {
                dfsRecursive(v);
            }
        }
        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return this.stack;
    }

}
