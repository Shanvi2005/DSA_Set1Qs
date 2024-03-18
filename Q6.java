import java.util.ArrayList;
import java.util.List;
public class Solution {
    static List<Long> L;
    static long count;
    static long facNo;
    public static List<Long> factorialNumbers(long n) {
        L = new ArrayList<>() ;   
        count=1;
        facNo = 1;   
        addFactorial(n);
        return L;
    }

    static void addFactorial(long n){
        
        if (facNo>n){
            return;
        }
        L.add(facNo);
        count++;
        facNo*=count;
        addFactorial(n);

    }
}
