import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random di = new Random();

        System.out.println("--- Welcome To Snake And Ladder Game ---");
        int start = 0;
        int position = 0;
        System.out.println("Starting Point : " + start);

        int dice = di.nextInt(1,7);
        System.out.println("The Dice Output is : " + dice);

        int check;

        check = di.nextInt(3);

        switch (check){

            case 0:{

                System.out.println("No Play || Staying in the same position");
                break;
            }

            case 1:{

                position += dice;
                System.out.println(" Wow , it's a ladder your position is increased " + dice);
                break;
            }

            case 2:{

                position -= dice;
                System.out.println(" Opps! it's a snake your position is decreased by " + dice);
            }

            default:{

                System.out.println("Wrong Wrong Wrong");
            }
        }


    }
}