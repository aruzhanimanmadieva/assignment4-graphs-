# Assignment 4 — Graph Traversal and Representation System +Bonus task
 
- Name: Aruzhan Imanmadiyeva
- Group:SE-2514
- Course: ADS
- Assignment: Graph Traversal and Representation System

---
## Bonus Task — Dijkstra Algorithm

This bonus task extends the graph traversal project by implementing Dijkstra’s Algorithm.

The graph was modified to support weighted edges. A new method dijkstra(int start) was added to calculate the shortest distance from a starting vertex to all other vertices.

The implementation uses arrays and loops without a priority queue.
## Screenshots:
<img width="1839" height="598" alt="image" src="https://github.com/user-attachments/assets/36e4fa79-e28b-46f4-ba06-01f8e003e252" />

<img width="1865" height="825" alt="image" src="https://github.com/user-attachments/assets/599b914e-09a5-4fb2-9d8e-b8c2bf0bea71" />

<img width="1874" height="650" alt="image" src="https://github.com/user-attachments/assets/9368b80c-e8e3-4bf1-bb00-b722106ebca2" />



Example Output:

DIJKSTRA SHORTEST PATHS:
To 0 = 0
To 1 = 4
To 2 = 2
To 3 = 9

Time Complexity:
O(V²)

Dijkstra’s Algorithm is used for finding shortest paths in weighted graphs.

Difference Between BFS and Dijkstra:

BFS finds shortest paths only in unweighted graphs, while Dijkstra works with weighted graphs.

BFS traversal
DFS traversal
Performance analysis using execution time measurements

The experiments showed that both algorithms have time complexity O(V + E).
# Project Overview

This project demonstrates graph representation and graph traversal algorithms in Java.

A graph is a data structure made of:

- Vertices (nodes)
- Edges (connections)

The graph in this project is implemented using an adjacency list.

The project includes:

- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Performance testing using System.nanoTime()

Graphs of different sizes were tested:

- Small graph — 10 vertices
- Medium graph — 30 vertices
- Large graph — 100 vertices

---

# Graph Structure

## Vertex

A vertex represents a node in the graph.

Example:
0
1
2
Edge
An edge represents a connection between two vertices.
Example: 0 -> 1

Adjacency List
The graph is stored using an adjacency list.
Example: 0 -> 1 2
1 -> 0 3
2 -> 0
This means:
Vertex 0 is connected to 1 and 2
Vertex 1 is connected to 0 and 3
Adjacency lists are memory efficient for sparse graphs.

Classes Description

Vertex.java

<img width="1226" height="430" alt="image" src="https://github.com/user-attachments/assets/062469d4-df69-4ef3-955c-a505cfd8e863" />
This class represents a graph vertex.
Fields
id — unique vertex identifier
Methods
Constructor
getId()
toString()

Edge.java

<img width="1207" height="535" alt="image" src="https://github.com/user-attachments/assets/1dd2f836-413d-4670-92a3-65f22200b85d" />

updated edge.java
<img width="1219" height="562" alt="image" src="https://github.com/user-attachments/assets/423b1956-0b12-4ec2-829d-e737320ecc4b" />


This class represents an edge between vertices.
Fields
source
destination
Methods
Constructor
Getters
toString()

Graph.java

<img width="1234" height="948" alt="image" src="https://github.com/user-attachments/assets/2a9dfcf3-e86c-4fb3-8ef1-74ae72814aa7" />
<img width="994" height="861" alt="image" src="https://github.com/user-attachments/assets/cb7012eb-fefc-41db-907d-0b02a5a99fb8" />

updated graph.java
<img width="1115" height="988" alt="image" src="https://github.com/user-attachments/assets/42de2a8b-353f-4ee1-baed-8bfe394c0944" />
<img width="1084" height="979" alt="image" src="https://github.com/user-attachments/assets/11dfc55b-4198-4525-87cd-5114480efaca" />
<img width="1165" height="927" alt="image" src="https://github.com/user-attachments/assets/b4023413-2f6c-43d4-96dd-a969193426ef" />



This class stores the graph using an adjacency list.
Main Methods
addEdge()
printGraph()
bfs()
dfs()

Experiment.java

<img width="1105" height="1013" alt="image" src="https://github.com/user-attachments/assets/f6c62210-eaef-4906-9ed9-4687546d0d00" />

This class runs performance tests for graphs of different sizes.
Functions
Creates graphs
Measures execution time
Compares BFS and DFS performance

Main.java

<img width="1015" height="865" alt="image" src="https://github.com/user-attachments/assets/cf4dab40-494e-4da9-b370-6703f94f57c8" />


<img width="1034" height="933" alt="image" src="https://github.com/user-attachments/assets/31c8a8de-0098-431a-bdcc-011e243ba7ef" />


This is the main program.
It:
Creates the graph
Adds edges
Runs BFS
Runs DFS
Prints results

Breadth-First Search (BFS)
Description
BFS explores the graph level-by-level.
It uses a queue data structure.

BFS Steps
Start from the first vertex
Add it to the queue
Visit all neighboring vertices
Continue until the queue becomes empty
Example BFS Traversal:
0 1 2 3 4 5
BFS Time Complexity: O(V + E)
Where:
V = number of vertices
E = number of edges


BFS Use Cases
Shortest path algorithms
GPS navigation
Social network analysis

Depth-First Search (DFS)
Description
DFS explores as deeply as possible before backtracking.
It uses recursion.

DFS Steps
Start from a vertex
Visit one neighbor
Continue deeply
Backtrack when no unvisited neighbors remain

Example DFS Traversal: 0 1 3 7 4 2
DFS Time Complexity: O(V + E)
DFS Use Cases

Maze solving
Cycle detection
Topological sorting

Experimental Results
Execution Time Comparison

|Graph Size  | BFS Time (ns) | DFS Time (ns)|
|------------|---------------|--------------|
|10 Vertices | 202400        | 139800       |
|30 Vertices | 439800        | 405300       |
|100 Vertices| 1638900       | 1084200      |

Observations

Larger graphs require more traversal time.
BFS and DFS both become slower as the number of vertices increases.
DFS was slightly faster in some tests.
Both algorithms showed linear growth relative to graph size.

⸻

Analysis Questions

1.How does graph size affect BFS and DFS performance?

As graph size increases, traversal time also increases because more vertices and edges must be visited.

⸻

2.Which traversal was faster?

DFS was slightly faster in some experiments because recursion avoided some queue operations used in BFS.

⸻

3.Do results match the expected complexity O(V + E)?

Yes. The execution time increased proportionally with the graph size, which matches the expected complexity.

⸻

4.How does graph structure affect traversal order?

Traversal order depends on how vertices are connected. Different edge structures produce different BFS and DFS outputs.

⸻

5.When is BFS preferred over DFS?

BFS is preferred when the shortest path is needed because it explores level-by-level.

⸻

6.What are the limitations of DFS?

DFS can go very deep into the graph and may use more stack memory because of recursion.

⸻

Screenshots

Graph Structure Output
<img width="955" height="300" alt="image" src="https://github.com/user-attachments/assets/00babc10-f30c-4391-9b11-405bcbfae9b0" />
<img width="298" height="82" alt="image" src="https://github.com/user-attachments/assets/1b71d126-abf5-49e7-921f-209fb6ac7845" />

BFS Traversal Output
<img width="1040" height="318" alt="image" src="https://github.com/user-attachments/assets/e8e6e683-cbea-42a0-b1b5-fbb1d5745d65" />
DFS Traversal Output
<img width="1786" height="199" alt="image" src="https://github.com/user-attachments/assets/c1a8c36d-1708-4782-ac09-101e500652aa" />


Reflection

During this assignment, I learned how graphs are represented using adjacency lists and how traversal algorithms work.

I learned that BFS explores vertices level-by-level, while DFS explores deeply before backtracking. Both algorithms are important in graph theory and computer science.

One challenge during implementation was understanding recursion in DFS and managing visited vertices correctly. I also learned how graph size affects algorithm performance.

⸻

Conclusion

This project successfully implemented graph traversal algorithms using Java.

The project demonstrated:

Graph representation with adjacency lists




