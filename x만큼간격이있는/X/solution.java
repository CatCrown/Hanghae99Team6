package x만큼간격이있는.X;
//x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
/*

x : 2,	n : 5,	result : [2,4,6,8,10]

 */

import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
//        long[] answer = {};
        long[] answer = new long[n];
        // answer 길이가 0 -> 아무것도 못넣음,,,,,, long[] tmp = new long[123123] : 마지막 숫자가 배열의 길이
        long sum = x; //int 아닌 long으로 지정
        // sum 을 바꾸기
        for(int i = 0; i<n; i++){

            answer[i] = sum;
            sum += x;
 //
        }
        return answer;
    }
}

// x만큼간격이있는.X
//  - solution.java
//  - data.txt (정보 담겨있음) -> x, n

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
//        Scanner rd = new Scanner(new File("경로/경로/경로/파일이름.확장자")); // data.txt
//        int a = rd.nextLine();
//        s.solution(a);
        int x =-4;
        int n = 2;
        System.out.println(Arrays.toString(s.solution(x, n)));
    }
}


//
//class JKSolution {
//    public long[] solution(int x, int n) {
//        long[] answer = new long[n];
//        answer[0] = x;
//        for(int i = 1; i < answer.length;i++){
//            answer[i] = answer[i-1] + x;
//
//        }
//        return answer;
//    }
//}
//


// 2, 4   6
// 0  1  2  3   4   5
// x = 2