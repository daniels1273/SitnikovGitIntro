import java.util.Scanner;

public class RunnerHahaha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hahaha!!");
        System.out.println("Man this is too easy");
        boolean isEasy = true;
        int xAmount = 0;
        int yAmount = 0;

        System.out.print("Is this actually easy tho? ");
        boolean isEasyReal = scan.hasNextBoolean();

        if (isEasyReal){
            xAmount = 12;
        } else {
            yAmount = 7896785;
        }

        System.out.println("a" + isEasyReal + xAmount + yAmount);
    }
}
