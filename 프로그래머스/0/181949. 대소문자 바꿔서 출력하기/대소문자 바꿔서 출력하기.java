import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>'Z') answer += (char)(str.charAt(i)-('a'-'A'));
            else answer += (char)(str.charAt(i)+('a'-'A'));
        }
        System.out.print(answer);
    }
}