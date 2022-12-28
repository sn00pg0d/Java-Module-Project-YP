import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        Counter counter = new Counter();
        Scanner scanner = new Scanner(System.in);
        double needToPay;
        int persons = 0;
        int rand = 0;
        rand = counter.randomizeIt();
        System.out.println("Большое спасибо, что посетили наш ресторан!\n");
        System.out.println("Ваш счёт составил: " + rand + "руб.\n");
        System.out.println("На скольких персон делить счёт?");
        persons = counter.pers(persons);
        needToPay = counter.count(rand, persons);
        System.out.println("Каждый из вас должен: " + needToPay + " руб.\n");
        System.out.println("Выберите себе игрушку из списка:");
        System.out.println("1 - iPhone X\n2 - iPad 8\n3 - iPods 3\n0 - Выход");
        counter.shopCalc();



    }

}


