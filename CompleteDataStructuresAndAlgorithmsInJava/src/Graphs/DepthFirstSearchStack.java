package Graphs;

import java.util.Stack;

public class DepthFirstSearchStack {

    public void dfs(Vertex root) {

        Stack<Vertex> stack = new Stack<>();
        root.setVisited(true);
        stack.push(root);

        while (!stack.isEmpty()) {
            Vertex currentVertex = stack.pop();
            System.out.print(currentVertex + " --> ");
            for (Vertex v : currentVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

}
