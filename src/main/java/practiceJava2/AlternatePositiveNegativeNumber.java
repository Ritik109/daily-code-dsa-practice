package practiceJava2;

import java.util.Arrays;

public class AlternatePositiveNegativeNumber {
    public static void main(String[] args) {
        AlternatePositiveNegativeNumber arrange = new AlternatePositiveNegativeNumber();
        arrange.rearrange(new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2},9);
        System.out.println("--------------------------------------------");
        arrange.rearrange(new int[]{-5 ,-2, 5, 2, 4, 7, 1, 8, 0,  -8},10);

    }

    void rearrange(int arr[], int n) {
        // code here
        int wrongValueIndex=-1;
        for (int i=0;i<n;i++){
            if (wrongValueIndex!=-1){
                if ((arr[wrongValueIndex]>=0 && arr[i]<0) || (arr[wrongValueIndex]<0 && arr[i]>=0)){
                    rightRotate(arr,wrongValueIndex,i);
                    if (i - wrongValueIndex >= 2)
                        wrongValueIndex+=2;
                    else
                        wrongValueIndex=-1;
                }
            }

            else if ((arr[i]>=0 && i%2!=0) || (arr[i]<0 && i%2==0)){
                wrongValueIndex=i;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    void rightRotate(int arr[],int start,int end){
        int temp=arr[end];
        for(int i=end;i>start;i--){
            arr[i]=arr[i-1];
        }
        arr[start]=temp;
    }
}
