import graph.GraphAdjList;
import graph.GraphAdjMatrix;

import java.util.Scanner;

public class Main {
    static void adjMatrixGraph() {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int edges = scanner.nextInt();
        GraphAdjMatrix graph = new GraphAdjMatrix(nodes);
        for (int i = 0; i < edges; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.creatWeightedEdge(u, v, w);
        }
        graph.print();
        int q = scanner.nextInt();
        while (q-- > 0) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            System.out.println(graph.isConnected(u, v));
        }
    }

    static void adjListGraph() {
//        1 2
//        1 3
//        1 4
//        2 5
//        3 4
//        3 5
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int edges = scanner.nextInt();
        GraphAdjList graph = new GraphAdjList(nodes);
        for(int i = 0;i < edges; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.createEdge(u,v,w);
        }
        graph.print();
    }

    public static void main(String[] args) {
        // adjMatrixGraph();
        adjListGraph();
    }
}
