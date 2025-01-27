import java.util.Scanner;
public class Prime{
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
}
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int num =scanner.nextInt();
    if(isprime(num)){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    }
    }
