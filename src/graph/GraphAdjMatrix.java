package graph;

public class GraphAdjMatrix {

    private int[][] adjMatrix;
    private int nodes;
    public GraphAdjMatrix(int nodes) {
        this.nodes = nodes;
        adjMatrix = new int[nodes + 1][nodes + 1];
    }
    public void print(){
        for(int i = 0; i <= nodes; ++i){
            for(int j = 0;j <= nodes; ++j){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void creatUnWeightEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }
    public void creatWeightedEdge(int u, int v, int weight){
        adjMatrix[u][v] = weight;
        adjMatrix[v][u] = weight;
    }
    public boolean isConnected(int u,int v){
        return adjMatrix[u][v] != 0;
    }
}
