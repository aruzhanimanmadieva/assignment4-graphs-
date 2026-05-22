public class Experiment {
    // Run BFS and DFS,and Dijkstra
    public void runTraversals(Graph g){
        long startBFS=System.nanoTime();
        g.bfs(0);
        long endBFS=System.nanoTime();

        long startDFS=System.nanoTime();
        g.dfs(0);
        long endDFS=System.nanoTime();

        long startDijkstra=System.nanoTime();
        g.dijkstra(0);
        long endDijkstra=System.nanoTime();

        System.out.println("BFS Time: " + (endBFS-startBFS)+ " ns");
        System.out.println("DFS Time: " + (endDFS-startDFS)+ " ns");
        System.out.println("Dijkstra Time: " + (endDijkstra-startDijkstra)+ " ns");
    }
    // Multiple graph tests
    public void runMultipleTests(){
        int[] sizes={10,30,100};
        for(int size: sizes){
            System.out.println("\nGRAPH SIZE: "+ size);
            Graph graph=new Graph();
            // Add vertices
            for(int i=0;i<size;i++){
                graph.addVertex(new Vertex(i));
            }
            //Add weighted edges
            for(int i=0;i<size-1;i++){
                int weight=(i%5)+1;
                graph.addWeightedEdge(i,i+1,weight);
            }

            runTraversals(graph);
        }
    }
    public void printResults(){
        System.out.println("\nExperiments completed.");
    }
}
