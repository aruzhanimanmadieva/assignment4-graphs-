import java.util.*;
public class Graph {
    private Map<Integer, List <Integer>> adjacencyList;
    //Matrix for weighted edges
    private int[][] weights;

    public Graph(){
        adjacencyList=new HashMap<>();

        //100 vertices
        weights=new int[100][100];
    }
    // Add vertex
    public void addVertex(Vertex v){
        adjacencyList.putIfAbsent(v.getId(),new ArrayList<>());
    }
    // Add edge
    public void addEdge(int from,int to){
        adjacencyList.get(from).add(to);
        //Undirected graph
        adjacencyList.get(to).add(from);
    }
    //weighted edge for Dijkstra
    public void addWeightedEdge(int from,int to,int weight){
        addEdge(from,to);
        weights[from][to]=weight;
        weights[to][from]=weight;
    }
    //Print graph
    public void printGraph(){
        for(int vertex : adjacencyList.keySet()){
            System.out.print(vertex + " -> ");
            for(int neighbor : adjacencyList.get(vertex)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    // BFS Traversal
    public void bfs(int start){
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        visited.add(start);
        queue.add(start);
        System.out.print("BFS: ");
        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.print(current + " ");
            for(int neighbor : adjacencyList.get(current)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    // DFS Traversal
    public void dfs(int start){
        Set<Integer> visited=new HashSet<>();
        System.out.print("DFS: ");
        dfsRecursive(start,visited);
        System.out.println();
    }
    private void dfsRecursive(int current,Set<Integer> visited){
        visited.add(current);
        System.out.print(current + " ");
        for(int neighbor : adjacencyList.get(current)){
            if(!visited.contains(neighbor)){
                dfsRecursive(neighbor,visited);
            }
        }
    }
    //BONUS TASK-Dijkstra Algorithm
    public void dijkstra(int start){
        int size=adjacencyList.size();
        int[] distance=new int[size];
        boolean[] visited=new boolean[size];

        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start]=0;
        for(int i=0;i<size-1;i++){
            int minVertex=-1;
            int minDistance=Integer.MAX_VALUE;

            for(int j=0;j<size;j++){
                if(!visited[j] && distance[j]<minDistance){
                    minDistance=distance[j];
                    minVertex=j;
                }
            }
            visited[minVertex]=true;

            for(int neighbor :adjacencyList.get(minVertex)){
                if(!visited[neighbor] && weights[minVertex][neighbor]!=0
                    && distance[minVertex] !=Integer.MAX_VALUE
                    && distance[minVertex]+weights[minVertex][neighbor]<distance[neighbor]){

                    distance[neighbor]=distance[minVertex]+weights[minVertex][neighbor];
                }
            }
        }
        //Results
        System.out.println("\nDIJKSTRA SHORTEST PATHS:");
        for(int i=0;i<size;i++){
            System.out.println("To " + i + "=" + distance[i]);
        }
    }
}
