public class Experiment {
    // Run BFS and DFS
    public void runTraversals(Graph g){
        long startBFS=System.nanoTime();
        g.bfs(0);
        long endBFS=System.nanoTime();

        long startDFS=System.nanoTime();
        g.dfs(0);
        long endDFS=System.nanoTime();
        System.out.println("BFS Time: " + (endBFS-startBFS)+ " ns");
        System.out.println("DFS Time: " + (endDFS-startDFS)+ " ns");
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
            // Add edges
            for(int i=0; i<size-1;i++){
                graph.addEdge(i,i+1);
            }
            runTraversals(graph);
        }
    }
    public void printResults(){
        System.out.println("\nExperiments completed.");
    }
}
