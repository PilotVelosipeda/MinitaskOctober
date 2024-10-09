import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        System.out.println("Введите сумму для вклада под 10% годовых : ");
        int deposit = new Scanner(System.in).nextInt();

        System.out.println("Введите сумму которую хотите получить на вкладе: ");
        int depositEnd = new Scanner(System.in).nextInt();

        double percent = 1.1;

        double years = (double) Math.log(1 + 0.1) * (depositEnd/deposit);
        System.out.println(years);
    }
}
