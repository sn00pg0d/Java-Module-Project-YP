import java.util.Scanner;

public class Counter {
    // создал класс как считалку, чтобы не захламлять main, но устроил бедлам здесь
    // после автовыравнивания (альт + ктрл + L), стало немного получше
    // да-да.. тему "Декомпозиция" я вообще не усвоил, а сейчас боюсь тут всё менять, сдам так В)

    public static int pers() { // это запоминает кол-во человек введенных с клавы
        Scanner scanner = new Scanner(System.in);
        int persons = 0;
        System.out.println("Введите количество человек");
        while (persons <= 1) {
            persons = scanner.nextInt();
            if (persons <= 1) {
                System.out.println("Некорректное число, пожалуйста повторите ввод");
            }
        }
        return persons;
    }

    public static void shopCalc() { // это калькулятор суммы выбранных товаров и вообще всего
        Scanner scanner = new Scanner(System.in);
        String shopAdd = "";
        String name = "";
        double price = 0;
        int persons = pers();
        System.out.println("Выберите себе игрушку из списка:");
        System.out.println("1 - iPhone X\n2 - iPad 8\n3 - iPods 3\n0 или Завершить - Выход");
        while (price != -1) { // бесконечный цикл, с выходом через "завершить"
            shopAdd = scanner.next();
            String end = "завершить";
            if (shopAdd.equals("1")) {
                price = 50000.50f + price;
                name = "iPhone X; " + name;
                System.out.println(name + " добавлено в корзину\n");
            } else if (shopAdd.equals("2")) {
                price = 70000.00f + price;
                name = "iPad 8; " + name;
                System.out.println(name + " добавлено в корзину\n");
            } else if (shopAdd.equals("3")) {
                price = 20000.90f + price;
                name = "iPods 3; " + name;
                System.out.println(name + " добавлено в корзину\n");
            } else if (((shopAdd.equals("0")) || (shopAdd.equalsIgnoreCase(end)))) {
                double otvet = price / persons;
                // я честно не понял как сделать через floor(), мы разве проходили такое?
                // пришлось гуглить как перевести цифры в строку и обратно
                String rubles = String.valueOf(otvet);
                if (rubles.endsWith("0")) { // endsWith нашел в контекстном меню, хз что это но сработало -_-
                    double yaWord = Double.parseDouble(String.valueOf(rubles)); // Double.parseDouble подсказал сам Андроид Студио, вроде тож работает
                    System.out.println(String.format("Каждый из вас должен заплатить: %.2f рубля\n", yaWord));
                    System.out.println("До свидания, заходите еще!");
                    break;
                }
                double bWord = Double.parseDouble(String.valueOf(rubles));
                System.out.println(String.format("Каждый из вас должен заплатить: %.2f рубль\n", bWord));
                System.out.println("До свидания, заходите еще!");
                break;
            } else {
                System.out.println("Вы ничего не выбрали\n");
            }
            System.out.println("Добавленные товары: " + name);
            System.out.println(String.format("На сумму: %.2f\n", price));
            System.out.println("Хотите приобрести что-то еще?");
        }
    }
} // ну вроде бы всё, спасибо за проверку! до встречи :)