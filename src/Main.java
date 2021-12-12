////Вычислить значение выражения по формуле (все переменные принимают действиетльные значения)
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter x: ");
        Scanner temp_x = new Scanner(System.in);
        double x = temp_x.nextDouble();

        System.out.println("Enter y: ");
        Scanner temp_y = new Scanner(System.in);
        double y = temp_y.nextDouble();

        double F;
        F = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(F);

    }
}
