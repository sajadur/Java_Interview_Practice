package queue.letcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_378_kth_smallest_element {

    public static void main(String... args){
        int [][] ma = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(ma,8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for (int j=0; j<col;j++){
                queue.add(matrix[i][j]);
                if(queue.size() == k){
                    queue.poll();
                }
            }
        }
        return queue.peek();
    }
}
