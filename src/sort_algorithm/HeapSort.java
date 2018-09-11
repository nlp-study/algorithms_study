package sort_algorithm;

import java.util.Arrays;

public class HeapSort {
    public static void maxHeapify(int[]A,int i)
    {
        int left = i*2;
        int right = i*2 + 1;
        int maxIndex = i;
        if(left<A.length && A[left] > A[i])
        {
            maxIndex = left;
        }
        if(right<A.length && A[right] > A[maxIndex])
        {
            maxIndex = right;
        }

        if(maxIndex != i)
        {
            int temp = A[i];
            A[i] = A[maxIndex];
            A[maxIndex] = temp;
            maxHeapify(A,maxIndex);
        }
    }

    public static void main(String[] args) {
        int[]A = {1,2,3,4,5};
        int i = 1;
        maxHeapify(A, i);
        System.out.println("A = [" + Arrays.toString(A) + "]");
    }
}
