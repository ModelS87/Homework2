public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper+4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weight1Fighter = 78.2;
        var weight2Fighter = 82.7;
        var weightBoth = weight1Fighter + weight2Fighter;
        System.out.println("Общий вес бойцов " + weightBoth);
        var differency = weight2Fighter - weight1Fighter;
        System.out.println("Разница между весами бойцов " + differency);
        var differency1 = weight2Fighter % weight1Fighter;
        System.out.println("Разница весов бойцов " + differency1 + " кг ");
        var hours = 640;
        var workersHours = 8;
        var workers = hours / workersHours;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        hours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + hours + " часа работы может быть поделено между сотрудниками");



    }
}