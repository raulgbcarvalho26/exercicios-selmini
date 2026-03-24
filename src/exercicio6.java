import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("Digie o calor de X");
        x = sc.nextDouble();
        x = x - 0.5;
        y = Math.pow(x, 1.0/ 3.0);
        System.out.printf("O valor de Y é de: %.3f" , y);



    }
}
