import java.util.PriorityQueue;

public class Task973KClosestPointToOrigin {
    public static void main(String[] args) {
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> priorityQueue =
                new PriorityQueue<>((x , y) -> (x[0] * x[0] + x[1] * x[1]) - (y[0] * y[0] + y[1] * y[1]));

        for (int[] point : points) {
            priorityQueue.add(point);
        }

        int[][] result = new int[k][2];
        for(int i =0; i < k; i++) {
            result[i] = priorityQueue.remove();
        }

        return result;
    }
}
