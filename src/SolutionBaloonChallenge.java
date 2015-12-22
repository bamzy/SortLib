import java.util.ArrayList;
import java.util.List;

/**
 * Created by bamdad on 12/18/2015.
 */
public class SolutionBaloonChallenge {
    List<Intersection> map = new ArrayList<Intersection>();
    int solution(int A[], int B[], int N, int K){
        long n = N, k=K;
        // create a link list of intersection map
        for (int i=0;i<n;i++){

            Intersection node = new Intersection(A[i]);
            if (map.indexOf(node)== -1 ) {
                node.getNeighbours().add(new Intersection(B[i]));
                map.add(node);
            } else {
                map.get(map.indexOf(node)).getNeighbours().add(new Intersection(B[i]));
            }
        }
        //two consecutive BFS to find the longest
            bfs(map.get(0));
        for (int i=0;i<k; i++){
        }
        return -1;

    }

    private void bfs(Intersection node) {
        while ((map.get(map.indexOf(node))).getNeighbours().size() != 0) {
            System.out.println("-->" + node.getId());
            bfs((map.get(map.indexOf(node))).getNeighbours().remove(0));
        }
        return ;

    }


    private class Intersection {
        long id;

        public Intersection(long id) {
            this.id = id;
        }

        public List<Intersection> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Intersection> neighbours) {
            this.neighbours = neighbours;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        List<Intersection> neighbours = new ArrayList<Intersection>();
        public boolean equals(Object o) {
            if (o instanceof Intersection) {
                //id comparison
                Intersection mo = (Intersection) o;
                return mo.id == id;
            }
            return false;
        }

    }

}
