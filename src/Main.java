import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 1.7");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;
        int maxAccumulation = 2459000;
        double total = 0;
        int i = 0;
        while (total < maxAccumulation) {
            i++;
            total = total + deposit + total * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int birthPerThousand = 17;
        int deathPerThousand = 8;
        int year = 1;
        while (year <= 10) {
            int populationGrowthPerYear = populationY * (birthPerThousand - deathPerThousand) / 1000;
            populationY = populationY + populationGrowthPerYear;

            System.out.println("Год " + year + ", численность населения составляет " + populationY + " человек");
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int maxAccumulation = 12_000_000;
        int increment = 7;

        double total = 15000;
        int i = 0;
        while (total < maxAccumulation) {

            total = total + total * increment / 100;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        }
        System.out.println("Для накопления 12 миллионов потребовалось " + i + " месяцев");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int maxAccumulation = 12_000_000;
        int increment = 7;
        double accumulation = 15000;
        int i = 0;
        while (accumulation < maxAccumulation) {
            accumulation = accumulation + accumulation * increment / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей");
            }
        }
        System.out.println("Для накопления 12 миллионов потребовалось " + i + " месяцев");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int increment = 7;
        double accumulation = 15000;
        int countMonths = 9 * 12;
        int i = 0;
        DecimalFormat decimalFormat = new DecimalFormat();
        while (i < countMonths) {
            accumulation = accumulation + accumulation * increment / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + decimalFormat.format(accumulation) + " рублей");
            }
        }
        System.out.println("Сумма накоплений за 9 лет составила " + decimalFormat.format(accumulation));
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        int day = 1;
        while (day <= 31) {
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
            }
            day++;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year2 = 2123;
        int year = 1823;
        while (year < year2) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }
    }

}
