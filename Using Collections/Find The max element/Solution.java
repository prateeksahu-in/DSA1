import java.util.*;


public class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    public void insert(int element) {
        pq.add(element);
    }

    public int getMax() {
        int max = pq.peek();
        pq.poll();
        return max;

    }
};
