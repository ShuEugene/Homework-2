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


    }
}