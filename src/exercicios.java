import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, valorquilowatts, valorresidencia, valortotal;
        double desconto, quilowatts;
        System.out.println("Digite aqui o seu salário ");
        salario = sc.nextDouble();
        System.out.println("Digite aqui a quantidade de quilowatts ");
        quilowatts = sc.nextDouble();
        valorquilowatts = (salario/7)/100;
        valortotal = valorquilowatts * quilowatts;
        System.out.println("O valor do quilowatts é R$ " + valorquilowatts);
        System.out.println("O valor total da conta é R$ " + valortotal);
        System.out.println("O valor da conta com os 10% de desconto é R$" +valortotal * 0.9);

    }
}
