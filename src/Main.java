


public class Main {

    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7539;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWieghtBoxer = weightBoxer1 + weightBoxer2;
        System.out.println(totalWieghtBoxer);
        var differenceWeightBoxer = weightBoxer1 - weightBoxer2;
        System.out.println(differenceWeightBoxer);
        //задача 7
        var boxerRemains = weightBoxer2 % weightBoxer1;
        System.out.println(boxerRemains);
        //задача 8
        var totalWorkHours = 640;
        var workHoursFor1Employee = 8;
        var numberEmployees = totalWorkHours / workHoursFor1Employee;
        System.out.println("Всего работников в компании - "+ numberEmployees +" человек");
        numberEmployees = numberEmployees + 94;
        totalWorkHours = numberEmployees * workHoursFor1Employee;
        System.out.println("Если в компании работает " + numberEmployees+ " человек, то всего " + totalWorkHours +
                " часов работы может быть поделено между сотрудниками");

    }
}
