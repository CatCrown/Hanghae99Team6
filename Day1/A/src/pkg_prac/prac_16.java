package pkg_prac;

public class prac_16 {
    public static void main(String[] args) {
        Solution a = new Solution();
        String b = new String("PooyY");
        boolean cc = a.solution(b);
        System.out.println(cc);
    }
}
class Solution {
    boolean solution(String s) {
        int ddd = 0;
        int dddd = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p'||s.charAt(i) == 'P'){
                ddd++;
            }if(s.charAt(i) == 'y'||s.charAt(i) == 'Y'){
                dddd++;
            }
        }
        boolean answer = (dddd == ddd) ? true : false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");

        return answer;
    }
}