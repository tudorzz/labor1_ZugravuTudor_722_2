import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myInt = keyboard.nextInt();
        int ct=0;
        float sum=0;
        while(myInt!=0) {
            sum+=myInt;
            ct+=1;
            System.out.println("enter an integer");
            myInt = keyboard.nextInt();

        }
        System.out.println("result: "+sum/ct);
    }
}