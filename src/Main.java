import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1.");
        int ageOld = 25;
        if (ageOld >= 18) {
            System.out.println("Если возраст человека равен " + ageOld + ", то он совершеннолетний");
        }
        int ageChild=17;
        if (ageChild>=18)
            System.out.println("Вы совершеннолетний");
        else
            System.out.println("Если возраст человека равен "+ageChild+", то он не достиг совршеннолетияБнужно подождать");

    }
        public static void task2() {
            System.out.println("Задача 2.");
            int tempOnStreet = 8;
            if (tempOnStreet < 5)
                System.out.println("На улице холодно,надеть шапку.");
            else
                System.out.println("Сегодня тепло,можно идти без шапки.");
            int tempOnStreet2 = 4;
            if (tempOnStreet2 < 5)
                System.out.println("На улице холодно,надеть шапку.");
            else
                System.out.println("Сегодня тепло,можно идти без шапки.");
        }

        public static void task3 () {
            System.out.println("Задача 3.");
            int speed1 = 95;
            if (speed1 > 60)
                System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф.");
            else
                System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно.");
            int speed2 = 55;
            if (speed2 > 60)
                System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф.");
            else
                System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно.");

        }

        public static void task4 () {
            System.out.println("Задача 4.");
            int age = 60;
            if (age < 2)
                System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
            else if (age >= 2 && age <= 6)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            else if (age >= 7 && age <= 18)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            else if (age >= 18 && age <= 24)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
            else if (age >= 24 && age <= 60)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
            else if (age > 60)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно отдыхать.");


        }


        public static void task5 () {
            System.out.println("Задача 5.");
            int age = 6;
            if (age < 5)
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе.");
            else if (age >= 5 && age < 14)
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            else if (age > 14)
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого.");
        }

        public static void task6 () {
            System.out.println("Задача 6.");
            int seating = 60;
            int totalPlaces = 102;
            int people = 85;
            if (people < seating)
                System.out.println("Есть сидячие места.");
            else if (people > seating && people < totalPlaces)
                System.out.println("Есть стоячие места");
            else if (people > totalPlaces)
                System.out.println("Вагон полностью забит.");
        }

        public static void task7 () {
        //можно ввести сканнер,наконец
            System.out.println("Задача 7.");
            Scanner chislo=new Scanner(System.in);
            int one=chislo.nextInt();
            int two=chislo.nextInt();
            int three=chislo.nextInt();
            if (one>two&&one>three)
                System.out.println("Самое большое число "+one);
            else if (two>one&&two>three)
                System.out.println("Cамое большое число "+two);
            else if (three>one&&three>two)
                System.out.println("Самое большое число "+three);
        }
    }
