import java.util.Scanner;
public class Bmi {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bmi calculator");
        System.out.println("enter your weight in kilograms");
        double weight=scanner.nextDouble();
        System.out.println("enter your height in meters");
        double height=scanner.nextDouble();
        double Bmi=weight/(height*height);
        if (Bmi<18.6) {
            System.out.println("under weight");
            
        }
        else if(Bmi>18.6 && Bmi<24.5){
            System.out.println("over weight");
        }
    }
}



