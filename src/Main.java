import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();
        System.out.println(" a- uzundugu");
        triangle.a= scanner.nextInt();
        System.out.println(" b- uzundugu");
        triangle.b= scanner.nextInt();
        System.out.println(" c- uzundugu");
        triangle.c= scanner.nextInt();
        triangle.area();
    }
}