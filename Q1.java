public class Solution {
       static int index = 0;
       static int arr[]; 
    public static int[] printNos(int x) {
        arr = new int[x];
        printRecursiveNo(x);
        return arr;
    }
    static void printRecursiveNo(int x){
        if (index==x){
            return;
        }
        arr[index]=index+1;
        index++;
        printRecursiveNo(x);
    }
}
