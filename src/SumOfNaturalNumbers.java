import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void SUM_N(int n){
         int SUM=0;
        for (int i=1;i<=n;i++){
           SUM = SUM + i;

        }
        System.out.println(SUM);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        SUM_N(num);
        sc.close();
    }

}
