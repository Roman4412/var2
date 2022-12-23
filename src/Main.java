public class Main {
    public static void main(String[] args) {
        // 1
        byte byteVar = -127;
        short shortVar = 11;
        int intVar = 12567;
        long longVar = 12857123L;
        float floatVar = 1.2f;
        double doubleVar = 12.224;
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        // 2
        float numOne = 27.12f;
        long numTwo = 987678965549L;
        double numThree = 2.786;
        short numFour = 569;
        short numFive = -159;
        int numSix = 27897;
        byte numSeven = 67;
        System.out.println();
        // 3
        byte ludmilasPupils = 23;
        byte annsPupils = 27;
        byte katePupils = 30;
        short paper = 480;
        int paperForPupil = paper / (ludmilasPupils + annsPupils + katePupils);
        System.out.println("На каждого ученика рассчитано " + paperForPupil + " листов бумаги");
        System.out.println();
        // 4
        int capacityMin = 16 / 2;
        int twentyMin = 20;
        int day = 24 * 60;
        int threeDays = day * 3;
        int month = day * 30;
        int capacityTwentyMin = twentyMin * capacityMin;
        System.out.println("За 20 минут машина произвела " + capacityTwentyMin + " штук бутылок");
        int capacityDay = day * capacityMin;
        System.out.println("За один день машина произвела " + capacityDay + " штук бутылок");
        int capacityThreeDays = capacityMin * threeDays;
        System.out.println("За тря дня машина произвела " + capacityThreeDays + " штук бутылок");
        int capacityMonth = capacityMin * month;
        System.out.println("За месяц машина произвела " + capacityMonth + " штук бутылок");
        System.out.println();
        // 5
        int totalTin =  120;
        int whitePaintForRoom = 2;
        int brownPaintForRoom = 4;
        int classrooms = totalTin / (brownPaintForRoom + whitePaintForRoom);
        int totalBrownPaint = classrooms * brownPaintForRoom;
        int totalWhitePaint = classrooms * whitePaintForRoom;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();
        // 6
        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 100 * 2;
        int eggsWeight = 70 * 4;
        int totalWeightGr = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalWeightKg = totalWeightGr / 1000f;
        System.out.println(totalWeightGr + " г");
        System.out.println(totalWeightKg + " кг");
        System.out.println();
        // 7
        short weight = 7 * 1000;
        int firstCondition = weight / 250;
        System.out.println("Дней потребуется при ежедневном похудении на 250 г - " + firstCondition);
        int secondCondition = weight / 500;
        System.out.println("Дней потребуется при ежедневном похудении на 500 г - " + secondCondition);
        int average = (firstCondition + secondCondition) / 2;
        System.out.println("Дней в среднем потребуется - " + average);
        System.out.println();
        // 8
        int marysSalary = 67760;
        int densSalary = 83690;
        int krisesSalary = 76230;

        float newSalaryMary = marysSalary + marysSalary / 100f * 10;
        float newSalaryDen = densSalary + densSalary / 100f * 10;
        float newSalaryKris = krisesSalary + (krisesSalary / 100f * 10);

        float maryDiff = (newSalaryMary * 12) - (marysSalary * 12);
        float denDiff = (newSalaryDen * 12) - (densSalary * 12);
        float krisDiff = (newSalaryKris * 12) - (krisesSalary * 12);

        System.out.println("Мария теперь получает " + newSalaryMary + " рублей, годовой доход вырос на " + maryDiff + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей, годовой доход вырос на " + denDiff + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей, годовой доход вырос на " + krisDiff + " рублей");


    }
}