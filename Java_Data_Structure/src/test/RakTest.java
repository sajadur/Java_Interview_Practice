package test;

import java.util.Arrays;

public class RakTest {

    public static void main(String... args){
        int A[] =  {13,7,2,8,3};
        System.out.println(solutionSubset2(A));
    }


    public int solution(int[] A) {
        // Implement your solution here
        int maxVal = Integer.MIN_VALUE;
        for (int value : A) {
            if (value % 4 == 0 && value > maxVal) {
                maxVal = value;
            }
        }
        return maxVal != Integer.MIN_VALUE ? maxVal : -1;
    }

    public static int solutionSubset(int[] A) {
        // Stores the number of set bits
        // at each bit position
        int bit[] = new int[32];

        // Traverse the given array arr[]
        for (int i = 0; i < A.length; i++) {

            // Current bit position
            int x = 31;

            // Loop till array element
            // becomes zero
            while (A[i] > 0) {

                // If the last bit is set
                if ((int)(A[i] & 1) == (int)1) {

                    // Increment frequency
                    bit[x]++;
                }

                // Divide array element by 2
                A[i] = A[i] >> 1;

                // Decrease the bit position
                x--;
            }
        }

        // Size of the largest possible subset
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 32; i++) {
            max = Math.max(max, bit[i]);
        }

       return max;
    }

    public static int solutionSubset2(int[] A) {
        int max = 0;
        int n = A.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            int and = -1;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) > 0) {
                    and &= A[i];
                }
            }
            if (and > 0 && Integer.bitCount(mask) > max) {
                max = Integer.bitCount(mask);
            }
        }
        return max;
    }
}
