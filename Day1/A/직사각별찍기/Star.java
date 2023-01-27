package Day1.A.직사각별찍기;
// https://school.programmers.co.kr/learn/courses/30/lessons/12969

// input : 5 3

/*
output :

 *****
 *****
 *****

 */

import java.util.Scanner;


class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//너비
        int b = sc.nextInt();//높이

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                // 0, 1,2,3,4 -> 5번
                System.out.print("*");
            } // end : for loop b
            System.out.println();
        }
    }
}