import java.util.Scanner;
public class Add_2 {
    ///백준2558
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
    }
    static int sum(int a,int b){
        return a+b;
    }
}
