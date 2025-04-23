public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача№1");
        int a = 4000;
        byte b = 22;
        float c = 3.75f;
        short d = 25645;
        long i = 9233567899L;
        double f = -1.7E+308;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);

        System.out.println("Задача№2");
        float m = 27.12f;
        long v = 987678965549L;
        double x = 2.786;
        short k = 569;
        int t = - 259;
        int p = 27897;
        byte u = 67;
        System.out.println(m);
        System.out.println(v);
        System.out.println(x);
        System.out.println(k);
        System.out.println(t);
        System.out.println(p);
        System.out.println(u);

        System.out.println("Задача№3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        byte numberStudents = (byte) (classLP + classAS + classEA);
        short totalPaper = 480;
        int paperStudents = totalPaper / numberStudents;
        System.out.println("На каждого ученика расчитано " + paperStudents + " листов бумаги.");


        System.out.println("Задача#4");
        short time = 2;
        short bottle = 16;
        short bottleInMinute = (short) (bottle / time);
        short day = (24 * 60);
        int dayWeight =  (bottleInMinute * day);
        short day1 = (1440 * 3);
        int dayWeight2 =  (bottleInMinute * day1);
        long month =  (1440 * 30);
        long monthWeight = (bottleInMinute * month);
        time = 20;
        bottle = (short) (bottleInMinute * time);
        System.out.println("За " + time + " минут машина произвела " + bottle + " штук бутылок");
        System.out.println(" За " +  " сутки машина произвела " + dayWeight + " штук бутылок ");
        System.out.println(" За " + " 3 дня машина произвела " + dayWeight2 + " штук бутылок");
        System.out.println(" За" + " месяц машина произвела " + monthWeight + " штук бутылок");



        System.out.println("Задача№5");
        short numberCans = 120;
        short cansWhite = 2;
        short cansBrown = 4;
        int classesAtSchool = cansWhite + cansBrown;
        System.out.println(classesAtSchool + " классов ");
        long numberOfCansOfWhitePaint = (numberCans / classesAtSchool)  * cansWhite;
        System.out.println(numberOfCansOfWhitePaint + " банок ");
        long numberOfCansOfBrownPaint = (numberCans / classesAtSchool) * cansBrown;
        System.out.println(numberOfCansOfBrownPaint + " банок ");
        System.out.println("В школе, где " + classesAtSchool + " классов, " + " нужно " + numberOfCansOfWhitePaint + " банок белой краски и " + numberOfCansOfBrownPaint + " банок коричневой краски" );


        System.out.println("Задача№6");
        byte  bananas = 5;
        int milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        byte oneBananasWeight = 80;
        byte milkWeight = 105;
        byte oneIceCreamWeight = 100;
        byte oneEggsWeight = 70;
        System.out.println(" вес одного банана = " + oneBananasWeight + " грамм ");
        System.out.println(" 100 мл молока = "  + milkWeight + " грамм ");
        System.out.println(" 1 брикет мороженого = " + oneIceCreamWeight + " грамм ");
        System.out.println(" вес 1 яйца = " + oneEggsWeight + " грамм ");
        int weightProducts = (oneBananasWeight * bananas) + (milkWeight * 2) + (oneIceCreamWeight * iceCream) + (oneEggsWeight * eggs);
        System.out.println(" общий вес завтрака составляет " + weightProducts + " грамм");
        float kg = (float) weightProducts / 1000;
        System.out.println(" общий вес составляет " + kg + " кг");

        System.out.println(" Задача№7");
        short needLost = 7000;
        short inDay = 250;
        short inDay2 = 500;
        int result = needLost/inDay;
        int result2 = needLost/inDay2;
        System.out.println(result + " дней, если спортсмен будет терять каждый день по 250 грамм ");
        System.out.println(result2 + " дней, если спортсмен будет терять каждый день по 500 грамм");
        int result3 = (result + result2)/2;
        System.out.println(result3 + " дней, в среднем потребуется, чтобы добиться результата похудения");

        System.out.println(" Задача№8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaWeather = (short) (masha * 1.1);
        int denisWeather = (short) (denis * 1.1);
        int kristinaWeather = (short) (kristina * 1.1);
        System.out.println(" Маша теперь получает " + (mashaWeather + masha) +  " рублей. " + " Годовой доход вырос на 9000 рублей " );
        System.out.println(" Денис теперь получает " + (denisWeather + denis) +  " рублей. " +  " Годовой доход вырос на 26523 рублей ");
        System.out.println(" Кристина теперь получает " + (kristinaWeather + kristina) + " рублей " + " Годовой доход вырос на 18317 рублей ");






    }
}