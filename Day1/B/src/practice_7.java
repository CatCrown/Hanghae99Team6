class Solution1 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer += -1 * absolutes[i];
            }
        }
        return answer;
    }
}

public class practice_7{
    public static void main(String[] args){
        Solution1 s = new Solution1();
        int[] absolutes = {1,2,3};
        boolean[] signs = {true, false, true};

        int a = s.solution(absolutes,signs);
        System.out.println(a);

    }
}