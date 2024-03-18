public class Solution
{
    static int index=0;
    static int num;
    static int arr[];
    public static int[] printNos(int x) {
        arr = new int[x];
        num=x;
        recursivePrint();
        return arr;
    }

    static void recursivePrint(){
        if (num <1|| index>=arr.length){
            return;
        }
        arr[index]=num;
        index++;
        num--;
        recursivePrint();
    }
}
