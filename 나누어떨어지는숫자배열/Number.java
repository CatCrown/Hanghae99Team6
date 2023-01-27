package 나누어떨어지는숫자배열;

//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.


import java.util.ArrayList;
import java.util.Collections;

//import java.util.List;

public class Number {
    public static void main(String[] args) {
        Solution s = new Solution();
        int divisor = 5;
        int[] arr = new int[]{5,9,7,10};
        // int[] arr = {5, 9, 7, 10};
        System.out.println(s.solution(arr, divisor));

    }
}

class Solution {
//    int[] -> ArrayList<Integet>
    public ArrayList<Integer> solution(int[] arr, int divisor) {
//        int[] answer = {};
        ArrayList<Integer> qwe = new ArrayList<>(); // ArrayList -> 가변배열
        // 선언방식 : ArrayList<type> name = new ArrayList<>();
        // name.add(something) -> name의 맨 끝에 something을 추가 : append the somthing at the end of the ArrayList 'name'
        // Collections.sort(name) -> name을 오름차순으로 정렬 : sort the ArrayList 'name' as ascending order

        for (int num : arr) {
            // 향상된 for문
            if (num % divisor == 0) {
                qwe.add(num);
            }
        }
        Collections.sort(qwe);// 오름차순, ArrayList<type>을 사용시 collections.sort()를 사용한다.

        if(qwe.size() == 0){
            qwe.add(-1);
        }
        return qwe;
    }
}
// 향상된 for문
// for(타입 변수명 : 배열){
//    변수명 ->  배열[0] 번째 부터 끝까지
//      배열 = {1,2,3}
//      변수명 -> 1, 2, 3
//}