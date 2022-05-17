import java.util.*;


class ReduceArray{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    static int reduceArray(int n, int a[]){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i =0;i<n;i++)
        {
            pq.add(a[i]);
        }
        while(pq.size()>1)
        {
            int n1,n2;
            n1 = pq.poll();
            n2 = pq.poll();
            pq.add(n1-n2);
        }
        
        return pq.poll();
    }
}