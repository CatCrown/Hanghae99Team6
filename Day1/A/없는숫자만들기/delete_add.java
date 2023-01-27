package Day1.A.없는숫자만들기;

import java.util.Scanner;

class Solution {
    public String solution(int a, int b) {
        int [] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] dates = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int date = 0;
        String answer = "";
        for (int i=0; i<a; i++){
        date += month[i];
        }
        date = date+b;
        answer = dates[date%7];
        return answer;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution input = new Solution();
        System.out.println("가격을 입력하세요");
        int inputNumber_01 = 5;//scan.nextInt();
        System.out.println("돈을 입력하세요");
        int inputNumber_02 = 24;//scan.nextInt();

        System.out.println(input.solution(inputNumber_01,inputNumber_02));

    }

}

//// -> 길이 10 : tmp {0,0,0,0,0,0,0,0,0,0,         0,0,0}
//// [1,2,3,4,6,7,8,0] -> forEach : 1,2,3,4,6,7,8,0 == 1
//// tmp [1,1,1,1,1,0,1,1,1,0,         0,0,0]
//// int temp = 0
//
//int cur = 0;
//int total = 0;
//for(int i = 0; i<tmp.length; i++){
//
//    if (tmp[i] == 1)
//        totla += cur;
//        }
//        cur++;
//        }
