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

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов "+ boxerWeight+ " кг.");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов "+ weightDifference+ " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов "+ boxerWeight+ " кг.");
        var weightDifference1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов (способ 1) "+ weightDifference1+ " кг.");
        var weightDifference2 = boxerWeight % boxerWeight1;
        System.out.println("Разница между весами бойцов (способ 2)"+ weightDifference2+ " кг.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var workHours = 640;
        var hoursForOne = 8;
        var employees = workHours / hoursForOne;
        System.out.println("Всего работников в компании — "+ employees+ " человек");
        employees += 94;
        workHours = employees * hoursForOne;
        System.out.println("Если в компании работает "+ employees + " человек, то всего " + workHours +" часа работы может быть поделено между сотрудниками");
    }
}