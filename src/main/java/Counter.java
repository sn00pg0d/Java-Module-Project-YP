import java.util.Random;
import java.util.Scanner;

public class Counter {

    public static int count(int a, int b) { // a - сумма счёта в ресторане; b - кол-во человек
        return a / b;
    }

    public static int randomizeIt(int r) { // случайная сумма счёта в пределах 5000 руб.
        r = 5000;
        return new Random().nextInt(r);
    }

    public static int pers(int p) { // ввод с клавы количества людей, с условием - больше двух
        Scanner scanner = new Scanner(System.in);
        while (p <= 1) {
            p = scanner.nextInt();
            if (p <= 1) {
                System.out.println("Некорректное число, пожалуйста повторите ввод");
            }
        }
        return p;
    }
}
