import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh dang x.a^2 + x.b + c = 0 ");
        System.out.println("Nhap a = ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b = ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c = ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getA() == 0) {
            System.out.printf("Nghiem phuong trinh x = %.2f", -equation.getC() / equation.getB());
        } else {
            if (equation.getDiscriminant() < 0) {
                System.out.print("Phuong trinh vo nghiem\n");
            } else if (equation.getDiscriminant() == 0) {
                System.out.printf("Phuong trinh nghiem kep x1 = x2 = %.2f \n", equation.getDoubleEperience());
            } else {
                System.out.printf("Phuong trinh co hai nghiem phan biet x1 = %.2f va x2 = %.2f \n", equation.getRoot1(), equation.getRoot2());
            }
        }
    }
}
