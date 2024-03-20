
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 100;
        short b = 32000;
        byte c = 120 ;
        long d = 900000000;
        float e = -3.1412f;
        double f = 3.14687123456789;
        System.out.println("Значение переменной  a с типом int равно "+ a);
        System.out.println("Значение переменной  b с типом short равно "+ b);
        System.out.println("Значение переменной  c с типом byte равно "+ c);
        System.out.println("Значение переменной  d с типом long равно "+ d);
        System.out.println("Значение переменной  e с типом float равно "+ e);
        System.out.println("Значение переменной  f с типом double равно "+ f);
        //Задача 2

        float aA = 27.12f;
        long bB = 987_678_965_549l;
        float cC = 2.786f;
        short dD = 569;
        short eE = -159;
        int fF = 27897;
        byte g = 67;
        // Задача 3
        byte l = 23;
        byte anna = 27;
        byte katya = 30;
        short total = 480;
        int oneStudent = total / (l+anna+katya);
        System.out.println("Задача 3");
        System.out.println("На каждого ученика приходиться - "+ oneStudent + " листов бумаги");

        // Задача 4
        byte per2Min = 16;
        int per1Min = per2Min / 2;
        int per20Min = per1Min * 20;
        int per24Hours = per1Min * 60 *24;
        int per3Days = per24Hours * 3;
        int per1Month = per24Hours * 30;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + per20Min + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + per24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + per3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + per1Month + " штук бутылок");
        //Задача 5
        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classroom = totalPaint / (whitePaint+brownPaint);
        int allWhitePaint = classroom * whitePaint;
        int allBrownPaint = classroom * brownPaint;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + classroom + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");
    //Задача 6
        int banana = 80;
        int bananaUsed = 5;
        int milk = 105;
        int milkUsed = 2;
        int ice = 100;
        int iceUsed = 2;
        int eggs = 70;
        int eggsUsed = 4;
        int recepi = banana * bananaUsed + milk * milkUsed + ice * iceUsed + eggs * eggsUsed;
        int recepiKg = recepi / 1000;
        System.out.println("Задача 6");
        System.out.println("Результат в граммах равен - " + recepi );
        System.out.println("Результат в Килограммах равен - " + recepiKg );
    //Задача 7
        int oneWeight = 250;
        int secondWeight = 500;
        int humanWeight = 7000;
        int x = humanWeight / oneWeight;
        int y = humanWeight / secondWeight;
        int z = (x + y)/2;
        System.out.println("Задача 7");
        System.out.println("Дней нужно если спортстмен будет терять по 250 грамм - " + x);
        System.out.println("Дней нужно если спортстмен будет терять по 500 грамм - " + y);
        System.out.println("В средней нужно " + z +" день");
    // Задача 8

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        int mashaNew = (int) (masha * 1.1);
        int krisNew = (int) (kris * 1.1);
        int denisNew = (int) (denis * 1.1);
        int mashaNewItog = mashaNew * 12;
        int krisNewItog = krisNew * 12;
        int denisNewItog = denisNew * 12;
        int mashaItog = masha * 12;
        int denisItog = denis * 12;
        int krisItog = kris * 12;
        int mashaDiferent = mashaNewItog - mashaItog;
        int krisDiferent = krisNewItog - krisItog;
        int denisDiferent = denisNewItog - denisItog;
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiferent+ " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiferent+ " рублей");
        System.out.println("Кристина теперь получает " + krisNew + " рублей. Годовой доход вырос на " + krisDiferent+ " рублей");
    }
}