import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random di = new Random();

        System.out.println("--- Welcome To Snake And Ladder Game ---");

        int start = 0;
        int position = 0;
        int winning = 100;

        System.out.println("Starting Point : " + start);


        int check;

        while (position <= winning) {

            int dice = di.nextInt(1, 7);
            System.out.println("The Dice Output is : " + dice);
            check = di.nextInt(3);

            switch (check) {

                case 0: {

                    System.out.println("No Play || Staying in the same position");
                    break;
                }

                case 1: {

                    position += dice;
                    System.out.println(" Wow , it's a ladder your position is increased " + dice);

                    if( position > winning){
                        position -= dice;
                    } else if (position == winning) {
                        System.out.println("You Won The Game");
                        System.out.println(position);
                        System.exit(0);
                        //break;
                    }
                    break;
                }

                case 2: {


                    if ((position - dice) < start) {
                        position = start;
                    }
                    else {
                        position -=  dice;
                        System.out.println(" Opps! it's a snake your position is decreased by " + dice);
                    }
                    break;

                }

                default: {

                    System.out.println("Wrong Wrong Wrong");
                }
            }
            System.out.println(position);


        }
    }
}
