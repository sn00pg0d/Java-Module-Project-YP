import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        Counter counter = new Counter();
        Scanner scanner = new Scanner(System.in);
        double needToPay;
        int persons = 0;
        int rand = 0;
        rand = counter.randomizeIt(rand);
        System.out.println("Ваш счёт составил " + rand);
        System.out.println("На скольких персон делить счёт?");
        persons = counter.pers(persons);
        needToPay = counter.count(rand, persons);
        System.out.println("Каждый из вас должен, примерно " + needToPay + " руб.");
    }

}


