import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        checkYear(2025);
        deviceOs(1, 2024);

        int days = calculateDistance(56);;
        if (days > 0){
            System.out.println("Для доставки потребуется " + days + " дней");
        } else {
            System.out.println("Доставки нет");
        }
    }


    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 1584) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " невисокосный");
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
        if (userOs == 0 && yearOs == 2024 && yearOs <= 2027){
            System.out.println("Установите обновление на IOS");
        } else if (userOs == 0 && yearOs <= 2023){
            System.out.println("Уставновите облегченное обновление на IOS");
        } else if (userOs == 1 && yearOs == 2024 && yearOs <= 2027 ) {
            System.out.println("Установите обновление на Android");
        } else if (userOs == 1 && yearOs <= 2023) {
            System.out.println("Установите облегченное обновление на Android");
        }
    }
}