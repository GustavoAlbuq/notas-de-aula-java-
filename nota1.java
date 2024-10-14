import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Notas (separadas por espaço): ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String situacao = (media >= 70) ? "Aprovado" : (media < 40) ? "Reprovado" : "Na Final";

        System.out.printf("Aluno: %s%nMédia: %.2f%nSituação: %s%n", nome, media, situacao);

        scanner.close();
    }
}
