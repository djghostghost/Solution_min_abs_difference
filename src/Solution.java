/**
 * Created by liguoxiang on 4/5/15.
 */

public class Solution {
   // 给你一个数组，找到一个分割点，使前后的差绝对值最小

    public int minAbsOfDifference(int[] array){

        if(array==null){
            return 0;
        }

        if(array.length==1){
            return 0;
        }

        if(array.length==2){
            return 1;
        }

        int length=array.length;

        //the index of foreside part
        int foreIndex=0;
        //the sum of foreside part
        int foreSum=array[foreIndex];

        //the index of tail part
        int tailIndex=length-1;
        //the sum of the tail part
        int tailSum=array[tailIndex];

        while(foreIndex!=tailIndex){
            if(foreSum<=tailSum){
                foreIndex++;
                foreSum+=array[foreIndex];
            }else{
                tailIndex--;
                tailSum+=array[tailIndex];
            }
        }


        return foreIndex;
    }


    private int min(int a,int b){
        return a<=b?a:b;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int a1[]={1,2,3,4,5,7,8,9,10};
        System.out.println(solution.minAbsOfDifference(a1));

    }
}
