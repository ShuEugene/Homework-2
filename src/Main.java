public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat =  3.6;
        var paper = 763789;
        System.out.println("\n" +
                "dog = " + dog + ", cat = " + cat + ", paper = " + paper + ".");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\n" +
                "Значения переменных, после увеличения каждой на 4:" + "\n" +
                        "dog = " + dog + ", cat = " + cat + ", paper = " + paper + ".");

        dog = (int) (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("\n" +
                "Значения переменных, после уменьшения:" + "\n" +
                "dog = " + dog + ", cat = " + cat + ", paper = " + paper + ".");

        var friend = 19;
        System.out.println("\n" + "friend = " + friend);

        friend *= 2;
        System.out.println("\n" + "После умножения на 2 friend = " + friend);

        friend /= 7;
        System.out.println("\n" + "После деления на 7 friend = " + friend);

        var frog = 3.5;
        System.out.println("\n" + "frog = " + frog);

        frog *= 10;
        System.out.println("\n" + "После умножения на 10 frog = " + frog);

        frog /= 3.5;
        System.out.println("\n" + "После деления на 3,5 frog = " + frog);

        frog += 4;
        System.out.println("\n" + "После увеличения на 4 frog = " + frog);

        // ДЗ-3 Урока 3
        System.out.println("\n\n" +
                "Здесь начинается ДЗ №3 Урока №3 (Переменные)");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("\n" +
                "Вес первого боксёра - " + boxer1Weight + " кг, \n" +
                "Вес 2-го боксёра - " + boxer2Weight + " кг, \n" +
                "Вес обоих боксёров - " + (boxer1Weight + boxer2Weight) + " кг, \n" +
                "Разница в весе боксёров - " + Math.abs(boxer1Weight - boxer2Weight) + " кг.");

        System.out.println("\n" +
                "Разница в весе боксёров, полученная вычитанием от бóльшего: " +
                (boxer2Weight - boxer1Weight) + " кг.");

        System.out.println("\n" +
                "Разница в весе боксёров, полученная вычислением остатка от деления: " +
                (boxer2Weight % boxer1Weight) + " кг.");

        // В зависимости от толкования условий ДЗ №2.8,
        // вижу два варианта решения:
        // Вариант 1
        var workingHours = 640;
        var shiftHours = 8;
        var numberOfWorkers = workingHours / shiftHours;
        System.out.println("\nДЗ №2.8. Вариант 1:");
        System.out.println("Всего сотрудников в компании - " + numberOfWorkers + " человек(-а).");
        var changeOfStaff = 94;
        var newNunberOfWorkers = numberOfWorkers + changeOfStaff;
        var newShiftHours = (double) workingHours / (double) newNunberOfWorkers;
        var distributedHours = newShiftHours * changeOfStaff;
        System.out.printf("Если штат увеличить до %d человек(-а), " +
                "то всего %.1f час(-ов) может быть поделено между новыми сотрудниками.",
                newNunberOfWorkers, distributedHours);
        /*
        Пояснение:
        1. Можно сказать с уверенностью, что толкование задачи, изложенное ниже,
        является естественным не для всех, и мне следовало проще подойти к условиям и решению задачи,
        однако в первых нескольких прочтениях условий задачи я увидел его смысл толкования следующим...
        2. Из условий задачи (пункта 1-го) ясно, что есть "640 рабочих часов",
        которые "поделены между сотрудниками".
        Такая формулировка может быть истолкована таким образом,
        что 640 часов - это ограниченное количество часов, которое готова оплатить
        либо определила на выполнение поставленной задачи Компания;
        то есть при увеличении количества привлечённых сотрудников,
        именно это количество (640) часов должно быть распределено на увеличившийся штат;
        3. Исходя из такого толкования и пункта 2 условий задачи,
        следует посчитать "количество часов,
        которое !должно! («может») быть поделено между сотрудниками"
        (исходя из увеличенного количества сотрудников и прежнего/ограниченного количества часов -
        то есть количество часов, необходимое для 94-х сотрудников),
        а не увеличенное в следствие увеличения штата (и отсутствия ограничений) количество часов
        (как это можно было истолковать в более простом варианте);
         */

        // Вариант 2
        System.out.println("\n\nДЗ №2.8. Вариант 2:");
        workingHours = 640;
        shiftHours = 8;
        numberOfWorkers = workingHours / shiftHours;
        System.out.println("Всего сотрудников в Компании - " + numberOfWorkers + " человек(-а).");
        changeOfStaff = 94;
        newNunberOfWorkers = numberOfWorkers + changeOfStaff;
        var newWorkingHours = newNunberOfWorkers * shiftHours;
        System.out.println("Если в Компании работает " +
                newNunberOfWorkers + " сотрудник(-а/-ов), " +
                "то всего " +
                newWorkingHours + " час(-а/-ов) работы может быть поделено между ними.");
    }
}