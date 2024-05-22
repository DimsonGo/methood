import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Задание 1
        checkYear(2025);
        //Задание с операционной системой
        int userOs = 0;
        int yearOs = 2022;
        deviceOs(userOs, yearOs);

        int days = calculateDistance(56);;
        if (days > 0){
            System.out.println("Для доставки потребуется " + days + " дней");
        } else {
            System.out.println("Доставки нет");
        }
    }


    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 1584) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static int calculateDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20){
            days++;
        }
        if (distance > 60){
            days++;
        }
        return days;
    }


    public static void deviceOs(int userOs, int yearOs) {
        int currentYear = LocalDate.now().getYear();
        if (userOs == 0 && yearOs >= currentYear){
            System.out.println("Установите обычное обновление на iOS");
        } else if (userOs == 0 && yearOs < currentYear){
            System.out.println("Уставновите облегченное обновление на IOS");
        } else if (userOs == 1 && yearOs >= currentYear) {
            System.out.println("Установите обычное обновление на Android");
        } else if (userOs == 1 && yearOs < currentYear) {
            System.out.println("Установите облегченное обновление на Android");
        }
    }
}