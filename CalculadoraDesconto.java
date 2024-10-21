package AP1;
import java.util.Scanner;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = input.nextDouble();

        double valorDesconto = (percentualDesconto / 100) * valorProduto;

        double precoFinal = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f\n", precoFinal);

        input.close();
    }
}
