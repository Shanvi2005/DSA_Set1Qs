import java.util.ArrayList;
import java.util.List;
public class Solution {
    static List<String> L = new ArrayList<>();
    static int count = 0;
    public static List<String> printNtimes(int n){
        L = new ArrayList<>(n);
        recursivePrint(n);
        return L;
    }
    static void recursivePrint(int n){
        if (count==n){
            return;
        }
        L.add("Coding Ninjas");
        count++;
        recursivePrint(n);
    }
}
