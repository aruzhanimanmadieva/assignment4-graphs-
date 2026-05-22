public class Main{
    public static void main(String[] args){
        Graph graph=new Graph();
        //create vertices
        for(int i=0;i<10;i++){
            graph.addVertex(new Vertex(i));
        }
        // Add weighted edges
        graph.addWeightedEdge(0,1,4);
        graph.addWeightedEdge(0,2,2);
        graph.addWeightedEdge(1,3,5);
        graph.addWeightedEdge(1,4,1);
        graph.addWeightedEdge(2,5,3);
        graph.addWeightedEdge(2,6,6);
        graph.addWeightedEdge(3,7,2);
        graph.addWeightedEdge(4,8,7);
        graph.addWeightedEdge(5,9,4);
        //Print graph
        System.out.println("GRAPH STRUCTURE");
        graph.printGraph();
        //Traversals
        System.out.println();
        graph.bfs(0);
        graph.dfs(0);
        graph.dijkstra(0);
        //Experiments
        Experiment experiment=new Experiment();
        experiment.runMultipleTests();
        experiment.printResults();
    }
}