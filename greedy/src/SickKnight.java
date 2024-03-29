import java.util.Scanner;
import java.math.*;
public class SickKnight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;

        n=sc.nextInt();
        m=sc.nextInt();

        if(n == 1){
            System.out.println(1);
        }
        else if(n == 2){
            System.out.println(min(4, ((m-1)/2)+1 ));
        }
        else {
            if (m<7) {
                System.out.println(min(4,m));
            }
            else {
                System.out.println(m-2);
            }
        }

    }
    public static int min(int x, int y){
        if(x<y)
            return x;
        else
            return y;
    }
}
/*
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	15211	6567	5559	43.003%
문제
병든 나이트가 N × M 크기 체스판의 가장 왼쪽아래 칸에 위치해 있다. 병든 나이트는 건강한 보통 체스의 나이트와 다르게 4가지로만 움직일 수 있다.

2칸 위로, 1칸 오른쪽
1칸 위로, 2칸 오른쪽
1칸 아래로, 2칸 오른쪽
2칸 아래로, 1칸 오른쪽
병든 나이트는 여행을 시작하려고 하고, 여행을 하면서 방문한 칸의 수를 최대로 하려고 한다. 병든 나이트의 이동 횟수가 4번보다 적지 않다면, 이동 방법을 모두 한 번씩 사용해야 한다. 이동 횟수가 4번보다 적은 경우(방문한 칸이 5개 미만)에는 이동 방법에 대한 제약이 없다.

체스판의 크기가 주어졌을 때, 병든 나이트가 여행에서 방문할 수 있는 칸의 최대 개수를 구해보자.

입력
첫째 줄에 체스판의 세로 길이 N와 가로 길이 M이 주어진다. N과 M은 2,000,000,000보다 작거나 같은 자연수이다.

출력
병든 나이트가 여행에서 방문할 수 있는 칸의 개수중 최댓값을 출력한다.
 */
