import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random di = new Random();

        System.out.println("--- Welcome To Snake And Ladder Game ---");
        int start = 0;
        System.out.println("Starting Point : " + start);

        int dice = di.nextInt(1,7);
        System.out.println("The Dice Output is : " + dice);



    }
}