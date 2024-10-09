import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        int maxLimit = 400;
        int sumWeight = 0;
        while (sumWeight <= maxLimit) {

            System.out.println("Введите вес человека: ");
            int humanWeight = new Scanner(System.in).nextInt();
            sumWeight += humanWeight;
            if (sumWeight > maxLimit) {
                System.out.println("Вес превышен на " + (sumWeight - maxLimit) + "кг");
            }
        }
    }
}
