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
            }}
        else if (clientDeviceYear >= 2015) {
                System.out.println("Установите  версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию для  Android по ссылке.");
            }

    }
}