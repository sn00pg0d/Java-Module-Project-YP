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

    public static int pers(int persons) { // ввод с клавы количества людей, с условием - больше двух
        Scanner scanner = new Scanner(System.in);
        //int p;
        int needToPay;
        persons = 0;
        int rand;
        rand = randomizeIt();
        System.out.println("Большое спасибо, что посетили наш ресторан!\n");
        System.out.println("Ваш счёт составил: " + rand + "руб.\n");
        System.out.println("На скольких персон делить счёт?");
        persons = scanner.nextInt();
        //persons = pers(persons);
        needToPay = count(rand, persons);
        System.out.println("Каждый из вас должен: " + needToPay + " руб.\n");
        while (persons <= 1) {
            persons = scanner.nextInt();
            if (persons <= 1) {
                System.out.println("Некорректное число, пожалуйста повторите ввод");
            }
        }
        return persons;
    }

    public static void shopCalc() { // калькулятор суммы выбранных товаров
        Scanner scanner = new Scanner(System.in);
        String shopAdd = "";
        String name = "";
        double price = 0;
        System.out.println("Выберите себе игрушку из списка:");
        System.out.println("1 - iPhone X\n2 - iPad 8\n3 - iPods 3\n0 или Завершить - Выход");
        while (price != -1) { // бесконечный цикл, с выходом через "завершить"
            shopAdd = scanner.next();
            String end = "завершить";
                if (shopAdd.equals("1")) {
                    price = 50000.50 + price;
                    name = "iPhone X; " + name;
                    System.out.println(name + " добавлено в корзину\n");
                } else if (shopAdd.equals("2")) {
                    price = 70000.00 + price;
                    name = "iPad 8; " + name;
                    System.out.println(name + " добавлено в корзину\n");
                } else if (shopAdd.equals("3")) {
                    price = 20000.90 + price;
                    name = "iPods 3; " + name;
                    System.out.println(name + " добавлено в корзину\n");
                } else if (((shopAdd.equals("0")) || (shopAdd.equalsIgnoreCase(end)))) {
                    System.out.println("До свидания, заходите еще!\n");
                    break;
                } else {
                    System.out.println("Вы ничего не выбрали\n");
                }
                System.out.println("У вас в корзине: " + name);
                System.out.println(String.format("На сумму: %.2f\n", price));
                System.out.println("Хотите приобрести что-то еще?");
            }
        }
    }


