import java.util.Scanner;

public class Counter {

    public static int pers() { // Исправлено, с учетом замечания
        Scanner scanner = new Scanner(System.in);
        int persons = 0;
        System.out.println("Введите количество человек");
        while (persons <= 1) {
            if (scanner.hasNextInt()) {
                persons = scanner.nextInt();
                if (persons <= 1) {
                    System.out.println("Количество человек должно быть больше одного");
                    System.out.println("--------------------------------------------\n");
                    return pers();
                }
            } else {
                System.out.println("Некорректное число, пожалуйста повторите ввод");
                System.out.println("----------------------------------------------\n");
                return pers();
            }
        }
        return persons;
    }

    public static double enterPrice() {
        Scanner scannerDb = new Scanner(System.in);
        double price;
        while (true) {
            System.out.println("ВВедите стоимость товара:");
            if (scannerDb.hasNextDouble()) {
                price = scannerDb.nextDouble();
                System.out.printf("Стоимость товара: %.2f\n", price);
                System.out.println("-----------------------------\n");
                return price;
            }
            System.out.println("Надо ввести цифры в формате рубль,копейки\n");
            return enterPrice();
        }
        //return price;
    }

    public static void shopCalc() { // это калькулятор суммы выбранных товаров и вообще всего
        Scanner scannerStr = new Scanner(System.in);
        String shopAdd;
        String basket = "";
        double sum = 0;
        int persons = pers();
        while (true) { // Исправлено, с учетом замечания
            System.out.println("Введите название товара:");
            if (scannerStr.hasNext()) {
                shopAdd = scannerStr.next();
                String end = "завершить";
                if (shopAdd.equalsIgnoreCase(end)) {
                    System.out.println("\n-------------");
                    System.out.println("Закрытие программы");
                    break;
                }
                System.out.printf("%s добавлено в корзину\n", shopAdd);
                System.out.println("-----------------------------\n");
                //enterPrice();
                double price = enterPrice();

                sum = sum + price;
                basket = basket + shopAdd;
                System.out.printf("Добавленные товары: %s\n ", basket);
                System.out.printf("На сумму: %.2f\n", sum);
                System.out.println("\nХотите приобрести что-то еще?");
                System.out.println("----------------------------------\n");
            }


        }


    }

}
















            /*} else if (shopAdd.equals("3")) {
                price = 20000.90f + price;
                name = "iPods 3; " + name;
                System.out.println(name + " добавлено в корзину");
                System.out.println("-----------------------------\n");
            } else if (((shopAdd.equals("0")) || (shopAdd.equalsIgnoreCase(end)))) {
                double otvet = price / persons;
                // я честно не понял как сделать через floor(), мы разве проходили такое?
                // пришлось гуглить как перевести цифры в строку и обратно
                String rubles = String.valueOf(otvet);
                if (rubles.endsWith("0")) { // endsWith нашел в контекстном меню, хз что это но сработало -_-
                    double yaWord = Double.parseDouble(String.valueOf(rubles)); // Double.parseDouble подсказал сам Андроид Студио, вроде тож работает
                    System.out.println("---------------------------------------------------------\n");
                    System.out.println(String.format("Каждый из вас должен заплатить: %.2f рубля\n", yaWord));
                    System.out.println("До свидания, заходите еще!");
                    break;
                }
                double bWord = Double.parseDouble(String.valueOf(rubles));
                System.out.println("---------------------------------------------------------\n");
                System.out.println(String.format("Каждый из вас должен заплатить: %.2f рубль\n", bWord));
                System.out.println("До свидания, заходите еще!");
                break;
            } else {
                System.out.println("Вы ничего не выбрали");
                System.out.println("---------------------\n");*/














