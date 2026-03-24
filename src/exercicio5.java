
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHoraAula, horasTrabalhadas, descontoInss, valorBruto, porcentagemInss, salarioLiquido;
        System.out.println("Digite o valor da hora-aula: ");
        valorHoraAula = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da porcentagem de desconto INSS: ");
        porcentagemInss = sc.nextDouble();

        porcentagemInss = calculadoraPorcentagem(porcentagemInss);
        valorBruto = calculadoraValorBruto(valorHoraAula, horasTrabalhadas);
        descontoInss = calculadoraDescontoInss(valorBruto, porcentagemInss);
        salarioLiquido = calculadoraSalarioLiquido(valorBruto, descontoInss);

        System.out.println("O valor do salario bruto é de R$: " + valorBruto);
        System.out.printf("O valor do desconto do INSS é de R$: %.1f", descontoInss);
        System.out.println("\nO valor do salario liquido é de R$: " + salarioLiquido);
        System.out.printf("O valor do salario bruto é de R$: ", salarioLiquido);
    }

    //  METODO 1
    public static double calculadoraPorcentagem(double porcentagemInss) {
        return porcentagemInss = porcentagemInss / 100;
    }

    //  METODO 2
    public static double calculadoraValorBruto(double valorHoraAula, double horasTrabalhadas) {
        return valorHoraAula * horasTrabalhadas;
    }

    //  METODO 3
    public static double calculadoraDescontoInss(double valorBruto, double porcentagemInss) {
        return valorBruto * porcentagemInss;
    }
    //  METODO 4
    public static double calculadoraSalarioLiquido(double valorBruto, double descontoInss) {
        return valorBruto - descontoInss;
    }
}
