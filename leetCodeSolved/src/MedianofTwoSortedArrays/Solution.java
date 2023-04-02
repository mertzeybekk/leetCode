package MedianofTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        double median=0.0;
        for(int i=0;i<result.length-1;i++){
            for(int k=0;k<result.length-1;k++){
                if(result[k]>result[k+1]){
                    int temp=result[k];
                    result[k]=result[k+1];
                    result[k+1]=temp;
                }

            }
        }
        if((result.length)%2==0){
            median=(double)(result[(result.length/2)]+result[(result.length/2)-1])/2;
        }else {
            median=result[result.length/2];
        }
        System.out.println("median"+median);
        return median;
    }

    public static void main(String[]args){
        int[]array1={1,5};
        int[]array2={3,4};
        Solution solution=new Solution();
        solution.findMedianSortedArrays(array1,array2);

    }
}
