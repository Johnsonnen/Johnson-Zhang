public class Main {
    public static class ElseAndIf
    {
        public static void main(String[]args){

            int people = 30;
            int cars = 40;
            int buses = 15;

            if ( cars > people )/*Compares the number of cars to people*/
            {
                System.out.println( "We should take the cars." );
            }
            else if ( cars < people )/*If the number of cars is not larger than the number of people, this line of code will run*/
            {
                System.out.println( "We should not take the cars." );
            }
            else/*If the number of cars is neither bigger nor less than the number of people, this will run*/ {
                System.out.println("We can't decide.");
            }
            /*After removing this else statement, it won't print "We can't decide" when previous statement are not satisfied*/

            if ( buses > cars )
            {
                System.out.println( "That's too many buses." );
            }
            else if ( buses < cars )/*If the number of bus is not bigger than the number of cars, this runs*/
            {
                System.out.println( "Maybe we could take the buses." );
            }
            else/*This runs if the previous if and else if's precondition are not satisfied*/
            {
                System.out.println( "We still can't decide." );
            }

            if ( people > buses )
            {
                System.out.println( "All right, let's just take the buses." );
            }
            else
            {
                System.out.println( "Fine, let's stay home then." );
            }

        }/*Else if will run when If's precondition is not satisfied and when its predition is reached, but when the precondition of Else if and If are both not satisfied Else will run.*/
    }
}
