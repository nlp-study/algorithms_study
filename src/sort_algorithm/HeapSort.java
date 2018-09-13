package sort_algorithm;

import java.util.Arrays;

public class HeapSort {
    public static void maxHeapify(int[] A, int i,int maxLen) {
        System.out.println("i = " + i);
        int left = i * 2;
        int right = i * 2 + 1;
        int maxIndex = i;
        if (left < maxLen && A[left] > A[i]) {
            maxIndex = left;
        }
        if (right < maxLen && A[right] > A[maxIndex]) {
            maxIndex = right;
        }

        if (maxIndex != i) {
            maxHeapify(A, maxIndex,maxLen);
            int temp = A[i];
            A[i] = A[maxIndex];
            A[maxIndex] = temp;
            System.out.println("maxIndex = " + maxIndex + ", i = " + i);
        }
    }

    public static void heapSort(int[] A) {
        if (A == null || A.length < 0) {
            return;
        }
        for (int i = 1; i < A.length; ++i) {
            maxHeapify(A, 1,A.length-i+1);
            System.out.println("A = [" + Arrays.toString(A) + "]");
            int temp = A[1];
            A[1] = A[A.length-i];
            A[A.length-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 23, 4, -5, 6, 7};
        int i = 1;
//        maxHeapify(A, i,A.length);
        heapSort( A);
        System.out.println("A = [" + Arrays.toString(A) + "]");
    }
}
