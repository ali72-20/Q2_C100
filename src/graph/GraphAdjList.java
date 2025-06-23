package graph;


import java.util.ArrayList;
import java.util.List;


public class GraphAdjList {
    private class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private List<List<Pair>> adjList;
    private int nodes;

    public GraphAdjList(int nodes) {
        this.nodes = nodes;
        initGraph();
    }

    private void initGraph() {
        adjList = new ArrayList<>(nodes + 1);
        for (int i = 0; i <= nodes; ++i) {
            adjList.add(new ArrayList<>());
        }
    }

    public void createWeightedEdge(int u, int v, int w) {
        adjList.get(u).add(new Pair(v, w));
        adjList.get(v).add(new Pair(u, w));
    }
//    public void createUnWeightedEdge(int u, int v){
    //   graph must be List<List<Integer>>
//        adjList.get(u).add(v);
//        adjList.get(v).add(u);
//    }

    public void print() {
        for (int i = 1; i <= nodes; ++i) {
            System.out.print(i + "--> ");
            for (int j = 0; j < adjList.get(i).size(); ++j) {
                System.out.println(adjList.get(i).get(j).first + " " + adjList.get(i).get(j).second);
            }
            System.out.println();
        }
    }
}
