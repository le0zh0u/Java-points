
/**
 * Created by zhouchunjie on 2017/4/18.
 */
public class DichotomySort {
    public static void main(String[] args){
        int[] a = {4,2,1,6,3,6,0,-5,1,1};

        int i,j;
        int low, high, mid;
        int temp;
        for (i = 1; i< a.length; i++){
            temp = a[i];
            low = 0;
            high = i-1;
            while (low <= high){
                mid=(low+high)/2;
                if (a[mid] > temp){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            for (j = i-1; j>high;j--){
                a[j+1] = a[j];
            }
            a[high+1] = temp;
        }
        for (i=0; i<a.length; i++){
            System.out.printf("%d   ", a[i]);
        }

    }
}
