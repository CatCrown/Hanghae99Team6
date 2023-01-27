class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int a = 45;
        for (int i = 0; i < numbers.length; i++) {
            a -= numbers[i];
        }

        return a;
    }
}
public class practice_6{

    public static void main(String[] args) {
    Solution numbers = new Solution();
    int[] a = new int[]{0,1,2,3,4,5,6};
    int b = numbers.solution(a);
    System.out.println(b);

    }
}