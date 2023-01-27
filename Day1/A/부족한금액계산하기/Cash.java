package Day1.A.부족한금액계산하기;
//새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. p[n]= price*n
//즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.


class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i =1 ; i <=count;i++){
            sum += price*i;


//            1, 2, 3, 4
//            3  6  9  12  30
//            30 - 20 = 10
        }
        if(money>=sum){
            return 0;
        }
        answer = sum - money;
        return answer;
//      result : 10
    }
}
class SSolution{
    public static void main(String[] args) {/**/
        Solution s = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(s.solution(price, money, count));

    }
}
