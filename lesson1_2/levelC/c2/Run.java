package lesson1_2.levelC.c2;

/*
Создайте enum класс с перечислением месяцев года. Создайте метод,
который на вход принимает значение месяца, а на выходе отдаёт пору года.
В методе main класса Run вызовите этот метод
и выведите в консоль результат работы этого метода.
 */
public class Run {
    public static void main(String[] args) {
        Enum manthValue = new Enum();
        switch (manthValue.January) {
            case February:
                System.out.println("Зима");
                break;
            case March:
                System.out.println("Весна");
                break;
            case April:
                System.out.println("Весна");
                break;
            case May:
                System.out.println("Весна");
                break;
            case July:
                System.out.println("Лето");
                break;
            case June:
                System.out.println("Лето");
                break;
            case August:
                System.out.println("Лето");
                break;
            case September:
                System.out.println("Осень");
                break;
            case October:
                System.out.println("Осень");
                break;
            case November:
                System.out.println("Осень");
            case December:
                System.out.println("Зима");
                break;
            /*default:
                System.out.println("Нет такого месяца");*/
        }
    }
}
