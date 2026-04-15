class Solution {
    public double solution(double num1, double num2) {
        double temp = 1000*(num1/num2);
        System.out.print(temp);
        int answer = (int)(temp);
        return answer;
    }
}