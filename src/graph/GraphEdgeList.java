package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphEdgeList {
    private class Edge {
        int u;
        int v;
        int w;
        boolean isDirected;
        Edge(int u, int v,int w, boolean isDirected) {
            this.u = u;
            this.v = v;
            this.w = w;
            this.isDirected = isDirected;
        }
    }

    private List<Edge> edgeList;
    private int edges;

    public GraphEdgeList(int edges) {
        this.edges = edges;
        edgeList = new ArrayList<>();
    }

    public void createEdge(int u,int v, int w){
        edgeList.add(new Edge(u,v,w,false));
    }
    public boolean isConnected(int u, int v){
        // {u,v}
        // {2,1} 2 1
        // 1 2
        // {1,2} != {2,1}
        // u = 1
        // v = 2
        // O(edges)
        for(int i = 0; i < edges; ++i){
            if(edgeList.get(i).u == u && edgeList.get(i).v == v){
                return true;
            }
            if(edgeList.get(i).u == v && edgeList.get(i).v == u && !edgeList.get(i).isDirected){
                return true;
            }
        }
        return false;
    }
}
