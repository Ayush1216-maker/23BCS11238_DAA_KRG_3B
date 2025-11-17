import java.util.*;
class minPlatform {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        int[][] v = new int[n][2];
        for (int i = 0; i < n; i++) {
            v[i][0] = arr[i];
            v[i][1] = dep[i];
        }


        Arrays.sort(v, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {


            while (!pq.isEmpty() && pq.peek() < v[i][0]) {
                pq.poll();
            }


            pq.add(v[i][1]);


            ans = Math.max(ans, pq.size());
        }

        return ans;

    }
}











































