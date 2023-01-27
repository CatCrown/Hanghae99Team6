package 연습문제2016년;


import java.util.Arrays;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekdays = {"THU","FRI","SAT","SUN", "MON","TUE","WED"};
//        구현시작
        for(int i= 0; i< a-1; i++ ){
            sum += dates[i];
        }
        sum += b;
//        System.out.println(sum);

        answer = weekdays[sum%7];

        return answer;
//        result : "TUE"
    }

}

//0: 금 7마다 금요일
// a ; 5 b 24
// 1월 31, 2월 29, 3월 31 4월 30 5월 31
// 152/7 ->  금
class Date {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a=5;
        int b = 24;
        System.out.println(s.solution(a,b));

    }

}