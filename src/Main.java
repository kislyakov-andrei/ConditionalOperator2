public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию Android по ссылке.");
        }
        // Task 2
        System.out.println("Task 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2010;
        if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию для  Android по ссылке.");
        }
        // Task 3
        System.out.println("Task 3");
        int year = 2021;

        if (year > 1584) {
            if (year % 4 == 0 || (year % 400 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Task 4
        System.out.println("Task 4");
        int deliveryDistance = 99;
        int deliveryTime = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней" + deliveryTime);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней " + (deliveryTime += 1));
            }
         else {
            System.out.println("Потребуется дней" + (deliveryTime += 2));
        }}
        else{
            System.out.println("Доставки нет.");}



}
}