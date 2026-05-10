public class Main{
    public static void main(String[] args){
        Graph graph=new Graph();
        //create vertices
        for(int i=0;i<10;i++){
            graph.addVertex(new Vertex(i));
        }
        // Add edges
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,6);
        graph.addEdge(3,7);
        graph.addEdge(4,8);
        graph.addEdge(5,9);
        //Print graph
        System.out.println("GRAPH STRUCTURE");
        graph.printGraph();
        //Traversals
        System.out.println();
        graph.bfs(0);
        graph.dfs(0);
        //Experiments
        Experiment experiment=new Experiment();
        experiment.runMultipleTests();
        experiment.printResults();
    }
}