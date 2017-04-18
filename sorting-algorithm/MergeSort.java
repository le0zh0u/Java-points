
/**
 * Created by zhouchunjie on 2017/4/19.
 */
public class MergeSort {
    public static void merge(int array[], int start1, int end1, int start2, int end2) {
        int i, j;
        {
            i = start1;
            j = start2;
        }
        int k = 0;
        int[] temp = new int[end2 - start1 + 1];

        while (i <= end1 && j <= end2) {
            if (array[i] > array[j]) {
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
            }
        }
        while (i <= end1) {
            temp[k++] = array[i++];
        }
        while (j <= end2) {
            temp[k++] = array[j++];
        }
        k = start1;
        for (int element : temp) {
            array[k++] = element;
        }

    }

    public static void mergeSort(int array[], int start, int end){
        if (start<end){
            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, mid+1, end);
        }
    }

    public static void main(String[] args){
        int[] a = {4,2,1,6,3,6,0,-5,1,1};
        int i;
        mergeSort(a, 0,a.length-1);
        for (i = 0; i<a.length; i++){
            System.out.printf("%d   ", a[i]);
        }
    }
}
