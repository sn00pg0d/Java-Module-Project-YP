import java.util.Scanner;
//import java.math.MathContext;

public class Counter {

    public static int pers() { // Исправлено, с учетом замечания, теперь не падает при строковых итд
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

    public static String enterName() { // ввод названия товара
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название товара или 'завершить' для выхода:");
            String shopAdd = scanner.next();
            String end = "завершить";
            if (shopAdd.equalsIgnoreCase(end)) {
                System.out.println("\n-------------");
                System.out.println("Закрытие программы");
                //break;
                System.exit(0); // break не закрывает программу, а возобновляет цикл видимо изза return enterName()
            }                   // буду благодарен, если подскажите как гасить приложуху без System.exit() :)
            System.out.printf("%s добавлено в корзину\n", shopAdd);
            System.out.println("-----------------------------\n");
            return shopAdd;
        }
        //return enterName();
    }

    public static double enterPrice() { // ввод стоимости товара
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите стоимость товара:");
        if (scanner.hasNextDouble()) {
            double price = scanner.nextDouble();
            System.out.printf("Стоимость товара: %.2f\n", price);
            System.out.println("-----------------------------\n");
            return price;
        }
        System.out.println("Вы ввели неверные данные, повторите ввод\n");
        return enterPrice();
    }

    public static void shopCalc() { // калькулятор суммы выбранных товаров
        int persons = pers();
        String basket = ""; // корзина
        String rubleySumma; // окончание в Сумме
        String rubleyOtvet; // окончание в Ответе
        double sum = 0;
        while (true) {
            String shopAdd = enterName();
            double price = enterPrice();
            sum = sum + price;
            basket = (shopAdd.trim() + "\n" + basket.trim()); // при одном товаре в корзине - всё равно
                                                              // присутствует пустое место, трим не помогает
            double otvet = sum / persons;
            // проверка окончания в Сумме
            // начало
            int rublSum = (int) Math.floor(sum);
            String rublStr = String.valueOf(rublSum);
            if ((rublStr.endsWith("2")) || (rublStr.endsWith("3")) || (rublStr.endsWith("4"))) {
                rubleySumma = "рубля";
            } else if ((rublStr.endsWith("1")) && (sum < 10)) {
                rubleySumma = "рубль";
            } else {
                rubleySumma = "рублей";
            }
            // конец

            // проверка окончания в Ответе
            // начало
            int rublOtv = (int) Math.floor(otvet);
            String otvetStr = String.valueOf(rublOtv);
            if ((otvetStr.endsWith("2")) || (otvetStr.endsWith("3")) || (otvetStr.endsWith("4"))) {
                rubleyOtvet = "рубля";
            } else if ((otvetStr.endsWith("1")) && (otvet < 10)) {
                rubleyOtvet = "рубль";
            } else {
                rubleyOtvet = "рублей";
            }
            // конец

            // принтф - прикольно конечно, но читать как-то не очень удобно, в отличии от нескольких принтлн
            System.out.printf("\nИтого\n------------------------\nДобавлены товары:\n%s\nВсего человек: %d\nВсего товаров на сумму: %.2f %s\nКаждый из вас должен заплатить: %.2f %s\n------------------------\n", basket, persons, sum, rubleySumma, otvet, rubleyOtvet);
            System.out.println("\nХотите приобрести что-нибудь еще?");
            System.out.println("----------------------------------\n");
        }
    }
}
