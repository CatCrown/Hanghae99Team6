package 가운데글자;
import java.util.Scanner;
import java.util.Arrays;

public class MiddleChar {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcde"));
    }
}


/*class Solution {
    public String solution(String s) {
        String answer = " ";
        return answer;
    }
}*/

class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length();
        answer = a%2 != 0 ?  String.valueOf(s.charAt(a/2)) : String.valueOf(s.charAt(a/2-1)+""+s.charAt(a/2));
        return answer;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution input = new Solution();
        System.out.println("문자열을 입력하세요");
        String inputText = scan.nextLine();
        System.out.println(input.solution(inputText));
    }

}

// Scanner rd = new Scanner(new File("경로/경로/경로/파일이름.확장자"));
// rd.nextLine();

// jk solution
class JKSolution {
    public String solution(String s) {

        if (s.length() % 2 != 0) {
            return s.substring(s.length() / 2,s.length() / 2+1); // 01234 substring(1,3) -> 1234
        }
        return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
    }

}