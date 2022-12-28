import java.util.Random;
import java.util.Scanner;

public class Counter {

    public static int count(int a, int b) { // a - сумма счёта в ресторане; b - кол-во человек
        return a / b;
    }

    public static int randomizeIt() { // случайная сумма счёта в пределах 5000 руб.
        int r = 5000;
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

    public static void shopCalc() { // калькулятор суммы выбранных товаров
        Scanner scanner = new Scanner(System.in);
        String shopAdd = "";
        String name = "";
        double price = 0;
        while (price != -1) { // бесконечный цикл, с выходом через case "0"
            shopAdd = scanner.next();
            switch (shopAdd) {
                case ("1"):
                    price = 50000.50 + price;
                    name = "iPhone X " + name;
                    System.out.println(name + " добавлено в корзину\n");
                    break;
                case ("2"):
                    price = 70000.00 + price;
                    name = "iPad 8 " + name;
                    System.out.println(name + " добавлено в корзину\n");
                    break;
                case ("3"):
                    price = 20000.90 + price;
                    name = "iPods 3 " + name;
                    System.out.println(name + " добавлено в корзину\n");
                    break;
                case ("0"):
                    System.out.println("До свидания, заходите еще!\n");
                    System.exit(0); // такой выход мы еще не проходили, подсмотрел в Ынтырнете
                    break;
                default:
                    System.out.println("Вы ничего не выбрали\n");
                    break;
            }
            System.out.println("У вас в корзине: " + name);
            System.out.println(String.format("На сумму: %.2f\n", price));
        }
    }
}

