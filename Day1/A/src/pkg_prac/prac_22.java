package pkg_prac;
import java.util.*;

public class prac_22 {
    public static void main(String[] args) {
        Solution2 a = new Solution2();
        int n = 987;
        int bb = a.solution(n);
        System.out.println(bb);
    }
}


class Solution2 {
    public int solution(int n) {
//        int answer = 0;
        int sum = 0;
        String str =Integer.toString(n);
        for(int i = 0; i < str.length();i++){
              sum += n % 10;// 123  -> 3
                  n = n /10; // 123-> 12
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");
        return sum;
    }
}