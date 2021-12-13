import java.util.Random;
import java.util.Scanner;

public class main {
    public static void  main(String[] args){
        int tolround = 0;
        int pyscore = 0;
        String win = "You win!";
        String lose = "You lose";
        String draw = "It's a draw";
        String cps= """
                Computer: Scissors!
                
                """;
        String cpr= """
                Computer: Rock!
                
                """;
        String cpp= """
                Computer: Paper!
                
                """;//Veriables
        while (true) {
            Random rand = new Random();
            Scanner input = new Scanner(System.in);
            System.out.println("""
            
            Wanna play a round of 'Rock Paper Scissors'?
            1) yes
            2) no
            """);//Ask user if they want to begin
            int startgm = input.nextInt();
            if(startgm == 1) {
                while (true) {
                    int upperbound = 3;
                    int int_random = rand.nextInt(upperbound);//generate int: 0,1,2 for cp's answer
                    System.out.println("""
                            Which one do you choose?
                            1) Rock!
                            2) Paper!
                            3) Scissors!
                            """);
                    int ans = input.nextInt();//get player's choice
                    if (ans == 1) {
                        System.out.println("You: Rock!");//Print what you have chosen
                        if (int_random == 0) {
                            System.out.println(cpr + draw);
                        } else if (int_random == 1) {
                            System.out.println(cpp + lose);
                        } else {
                            System.out.println(cps + win);
                            pyscore++;
                        }
                        tolround++;
                        break;
                    } else if (ans == 2) {
                        System.out.println("You: Paper!");//Print your choice
                        if (int_random == 0) {
                            System.out.println(cpr + win);
                            pyscore++;
                        } else if (int_random == 1) {
                            System.out.println(cpp + draw);
                        } else {
                            System.out.println(cps + lose);//print results
                        }
                        tolround++;
                        break;
                    } else if (ans == 3) {
                        System.out.println("You: Scissors!");//Print what you have chosen
                        if (int_random == 0) {
                            System.out.println(cpr + lose);
                        } else if (int_random == 1) {
                            System.out.println(cpp + win);
                            pyscore++;
                        } else {
                            System.out.println(cps + draw);//print results
                        }
                        tolround++;
                        break;
                    } else {
                        System.out.println("""
                                INVALID ANSWER
                                please choose from 1,2,3
                                """);//Error handle
                    }
                }
            }else if(startgm == 2){
                System.out.println("You win "+pyscore+" rounds out of "+tolround);//print final result
                break;
            }else{
                System.out.println("Invalid Input");//Error handle
            }
        }
    }
}
