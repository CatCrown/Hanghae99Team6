package pkg_prac;

//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로,
// 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
public class prac_21 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String ss = ("world image ii");
        String bbb= s.solution(ss);
        System.out.println(bbb);
    }
}
class Solution1 {
    public String solution(String s) {


        int idx = 0;
        StringBuilder sb = new StringBuilder();




        //        String s = "TrY hello world"
//                            0123012345012340
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            //        1번 -> 공백
            if (tmp.equals(" ")) {
                sb.append(tmp);
                idx = 0;
            } else if (idx % 2 == 0) {
                //        2번 -> 짝수
                sb.append(tmp.toUpperCase());
                idx++;

            } else {
                //        3번 -> 홀수일떄
                sb.append(tmp.toLowerCase());
                idx++;
            }

        }

        return String.valueOf(sb);
    }
}

// String -> 문자열, 불변 -> 바꿀수 없어요 -> 맘에 안듦
// StringBuffer & StringBuilder
// 쓰레드 : ok,     쓰레드 : no
// -> StringBuilder 를 써라

// StringBuilder sb = new StringBuilder();
// sb.append("바보").append("멍청이") -> sb = "바보멍청이"
// sb.append(" ") -> "바보멍청이 "