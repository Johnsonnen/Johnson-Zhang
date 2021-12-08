import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your weight?");
        int weight = input.nextInt();

        System.out.println("Which planet do you want to go?");
        System.out.println("1.Venus " + "2.Mars " + "3.Jupiter "+"4.Saturn "+"5.Uranus "+"6.60Neptune ");
        int planet = input.nextInt();

        if(planet == 1){
            int aweight = (int) (weight * 0.78);
            System.out.println("Your actual weight will be: " + aweight);
        }else if(planet == 2){
            int aweight = (int) (weight * 0.39);
            System.out.println("Your actual weight will be: " + aweight);
        }else if(planet == 3){
            int aweight = (int) (weight * 2.65);
            System.out.println("Your actual weight will be: " + aweight);
        }else if(planet == 4){
            int aweight = (int) (weight * 01.17);
            System.out.println("Your actual weight will be: " + aweight);
        }else if(planet == 5){
            int aweight = (int) (weight * 1.05);
            System.out.println("Your actual weight will be: " + aweight);
        }else if(planet == 6){
            int aweight = (int) (weight * 1.23);
            System.out.println("Your actual weight will be: " + aweight);
        }else{
            System.out.println("Planet Not Found*");
        }
    }
}
