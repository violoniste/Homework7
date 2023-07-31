public class Main {
    public static void main(String[] args) {
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
        System.out.println("task1:");

        int total = 0;
        int salary = 15000;
        int goal = 2_459_000;
        int month = 0;
        while (total < goal) {
            total += total * 0.01;      // В задаче не указано, учитывать проценты или нет. Оставил как было.
            total += salary;
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");

        int population = 12_000_000;
        int born = 17;
        int death = 8;
        for (int i = 1; i <= 10 ; i++) {
            int thousands = population / 1000;      // Сколько тысяч
            population += thousands * born;         // Сколько родилось
            population -= thousands * death;        // Сколько умерло

            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");

        int total = 15_000;
        int goal = 12_000_000;
        int percent = 7;
        int month = 0;
        while (total < goal) {
            total += total * (percent / 100f);
            month++;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5:");

        int total = 15_000;
        int goal = 12_000_000;
        int percent = 7;
        int month = 0;
        while (total < goal) {
            total += total * (percent / 100f);
            month++;

            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Итого: " + month + " месяцев, сумма накоплений равна " + total + " рублей");
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6:");

        int total = 15_000;
        int goal = 12_000_000;
        int percent = 7;
        int month = 0;
        do {
            total += total * (percent / 100f);
            month++;

            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        while (month / 12 < 9);

        System.out.println("Итого: " + month + " месяцев, сумма накоплений равна " + total + " рублей");
    }

    public static void task7() {
        System.out.println();
        System.out.println("task7:");

        int friday = 4;
        for (int day = 1; day <= 31; day++) {
            // Наверное тут чего-то происходит в течении недели

            if (day == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                friday += 7;        // Определяем, когда там следующая пятница будет
            }
        }
    }

    public static void task8() {
        System.out.println();
        System.out.println("task8:");

        int period = 79;
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;

        // Первый способ
        for (int year = startYear; year < endYear ; year++) {
            if (year % period == 0) {
                System.out.println(year);
            }
        }

        System.out.println();

        // Второй способ
        int year = 0;
        while (year <= endYear) {
            if (year >= startYear)
                System.out.println(year);

            year += period;
        }
    }
}