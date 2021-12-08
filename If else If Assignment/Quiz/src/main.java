import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int crtans = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Here comes the quiz!");

        System.out.print("""
        Q1) What is the capital of America?;
        1) Washington, D.C.;
        2) Washington;
        3) California""");
        int ans1 = input.nextInt();
        if(ans1 == 1) {
            System.out.print("Correct!");
            crtans ++;
        }else{
            System.out.println("Wrong, the answer should be Washington, D.C.");
        }

        System.out.println("""
                
                
                Q2) What is the product of 4 and 6? 
                1) 10
                2) 18
                3) 24""");
        int ans2 = input.nextInt();
        if(ans2 == 3){
            System.out.println("Correct!");
            crtans ++;
        }else{
            System.out.println("Wrong, the correct answer should be 24");
        }

        System.out.println("""
    Quiz finished
    You got"""+" "+crtans+" "+
                 """
                 out of 2 correct"""
    );
    }
}
