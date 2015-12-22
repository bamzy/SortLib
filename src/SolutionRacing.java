import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Bamdad on 9/5/2015.
 */
class SolutionRacing {
    class Node{
        public int nodeIndex;
        public boolean visited;
        public List<Integer> nextNode;
        public int distance;
        public Node(){
            nextNode= new ArrayList<Integer>();
            visited = false;
        }
    }
    public int solve(int[] A, int[] B, int K) {
        Hashtable<Integer, Node> tree = new Hashtable();
        long N = A.length;
        for (int i=0; i< N; i++) {
            Node node = new Node();
            if (tree.get(A[i]) == null) {
                node.nextNode.add(B[i]);
                tree.put(A[i], node);
            }
            else
                ((Node)(tree.get(A[i]))).nextNode.add(B[i]);
            Node node2 = new Node();
            if (tree.get(B[i]) == null) {
                node2.nextNode.add(A[i]);
                tree.put(B[i], node2);
            }
            else
                ((Node)(tree.get(B[i]))).nextNode.add(A[i]);
        }
        int maxDistance = 0;
        dfs(A[0], tree );
//        dfs(longestDestNode, tree);
        //find the longest path starting from that
        return 0;


    }
    public static long depth = 0, max =0;
    public static int longestDestNode = 0;
    private void dfs(int source, Hashtable tree) {
        if (((Node) (tree.get(source))).visited)
            return;
        else
            ((Node) (tree.get(source))).visited = true;
        if (((Node) (tree.get(source))).nextNode != null) {
            int i = 0;
            while (((Node) (tree.get((((Node) (tree.get(source))).nextNode.get(i))))).visited == true && i < ((Node) (tree.get(source))).nextNode.size()) {
                int newSource = ((Node) (tree.get(source))).nextNode.get(0);
                depth++;
                if (depth > max)
                    max = depth;
                dfs(newSource, tree);
            }
            depth--;
            return;
        }
    }
}