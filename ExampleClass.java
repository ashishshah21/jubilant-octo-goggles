import java.util.LinkedList;

public class ExampleClass {

    //inner class

    static class Graph {
        int numVertices;
        LinkedList<Integer>[] tempList;
        //constructor
        Graph(int numVertices) {
            this.numVertices = numVertices;
            tempList = new LinkedList[numVertices];
            for (int i = 0; i < numVertices; i++) {
                tempList[i] = new LinkedList<>();
            }
        }

        //Method to add an edge between two nodes of a graph
        public void addEdge(int fromNode, int toNode) {
            tempList[fromNode].addFirst(toNode);
        }

        public void DFSRecursion(int startVertex) {
            boolean[] visitedArr = new boolean[numVertices];
            dfs(startVertex, visitedArr);
        }

        // DFS Recursion takes place here

        public void dfs(int start, boolean[] visitedArr) {
            visitedArr[start] = true;

            System.out.println("Value of Start is: " + start);
            for(int i = 0; i < tempList[start].size(); i++) {
                int toNode = tempList[start].get(i);
                System.out.println("Templist size: " +tempList[start].size());
                System.out.println("Node at " + i + " is :"+toNode);
                if (!visitedArr[toNode])
                    dfs(toNode,visitedArr);
            }
        }


    }

    public static void main( String args[] ) {
        System.out.println("Your DFS path is: ");

        int nVertices = 6;

        Graph g = new Graph(nVertices);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        // Root node given as argument to the function
        g.DFSRecursion(0);
    }
}

