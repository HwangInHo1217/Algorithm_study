import java.util.Scanner;
public class Tiling_2n_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int DP[]=new int[1001];
        DP[1]=1;
        DP[2]=3;

        for(int i=3;i<=n;i++){
            DP[i]=(DP[i-1]+DP[i-2]*2)%10007;
        }
        System.out.println(DP[n]);
    }
}
/*
* 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×17 직사각형을 채운 한가지 예이다.



입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.*/