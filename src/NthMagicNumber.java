import java.util.Scanner;

public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findNthMagicnum(num));

    }
    public static int findNthMagicnum(int sum){
        int sol =0;
        int count = 2;
        if(sum==1) {
            sol = 5;
            return sol;
        }
        for(int i=2;i<=sum;i++){
            if(i%2 ==0){
                sol = power(5,count);
            }
            else{
                sol = power(5,count)+5;
                count++;
            }
        }
        return sol;
    }
    public static  int power(int base,int pow){
        int i=base;
        while(pow-1>0){
            base = base *i;
            pow--;
        }
        return base;
    }
}
