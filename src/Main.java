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
    }
}