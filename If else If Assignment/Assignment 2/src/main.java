import java.util.Scanner;

public class main {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        if(age < 16){
            System.out.println("You can't drive.");
        }else if(age<17 && age>16){
            System.out.println("You can drive but  not drink.");
        }else if(age<24 && age>18){
            System.out.println("You can vote but not rent a car.");
        }else{
            System.out.println("You can do pretty much anything.");
        }
    }
}
