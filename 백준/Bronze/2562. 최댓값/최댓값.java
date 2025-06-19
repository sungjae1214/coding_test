import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[9];
        int max = 0;
        int cnt = 1;
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(max<a[i]) max = a[i];
        }
        for(int i = 0; i<a.length; i++){
            if(a[i]==max) break;
            else cnt++;
        }
        System.out.print(max+" "+cnt);
    }
}