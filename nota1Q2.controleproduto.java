import java.util.Scanner;

class Produto {
    String codigo;
    String nome;
    String tamanhoOuPeso;
    String cor;
    double valor;
    int quantidade;

    void mostrarDetalhes() {
        System.out.println("Detalhes do Produto:");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoOuPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade em Estoque: " + quantidade);
    }

    void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada. Estoque atualizado.");
        } else {
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    double calcularDesconto(double valorFinal) {
        return valorFinal * 0.95; // 5% de desconto
    }
}

public class ControleProduto {
    public static void main(String[]
