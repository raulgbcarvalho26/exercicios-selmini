import java.util.Scanner;
public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, dezena;
        System.out.println("Informe um valor com 3 dígitos (100-999) -> ");
        valor = sc.nextInt();
        dezena = valor % 100/10;
        System.out.println("Dezena = " + dezena);

    }
}
