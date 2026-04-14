import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        valor2 = sc.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        valor3 = sc.nextDouble();

        if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2) {
            System.out.println(" Os valores formam um triangulo");
        } else {
            System.out.println(" Os valores não formam um triangulo");
        }
    }
}
