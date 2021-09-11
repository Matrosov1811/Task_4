import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите три числа");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        System.out.println("Среднее арифметическое = " + (x + y + z)/3);
        double result = Math.floor((x + y + z)/3/2);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
