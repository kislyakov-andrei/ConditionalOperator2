public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения Android по ссылке.");
        }
        // Task 2
        System.out.println("Task 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2010;

        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }else if (clientOS1 == 0 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        else if (clientOS1==1 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию для  Android по ссылке.");}

        // Task 3
        System.out.println("Task 3");
        int year = 2010;

        if (year>1584 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }


        // Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");}
        else if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTime);}
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime += 1));
        }
        else {System.out.println("Потребуется дней: " + (deliveryTime+=2));}

        // Task 5
        System.out.println("Task 5");
        int monthNumber=6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber +" месяц года относится к сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+ " месяц года относится к сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+" месяц года относится к сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц года относится к сезону Осень.");
                break;
            default:
                System.out.println("В году 12 месяцев. " + monthNumber + " месяца не существует.");
        }



}
}