import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=(N*2)-1; j++){
                if(j<N-cnt) System.out.print(" ");
                else if(j>N+cnt) System.out.print("");
                else System.out.print("*");
            }
            System.out.println();
            cnt++;
        }
        cnt-=2;
        for(int i = 1; i<=N-1; i++){
            for(int j =1; j<=(N*2)-1; j++){
                if(j<N-cnt) System.out.print(" ");
                else if(j>N+cnt) System.out.print("");
                else System.out.print("*");
            }
            System.out.println();
            cnt--;
        }
    }
}