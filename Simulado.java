import java.util.Scanner;

public class Simulado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fases_Faceis;
        int fases_Dificeis;
        int horas_Faceis;
        int horas_Dificeis;
        int total_Horas;
        double valorTotal;

        System.out.println("Digite quantas de fases faceis: ");
        fases_Faceis = sc.nextInt();

        fases_Dificeis = 96 - fases_Faceis;

        horas_Faceis = fases_Faceis * 1;
        horas_Dificeis = fases_Dificeis * 2;

        total_Horas = horas_Faceis + horas_Dificeis;

        valorTotal = total_Horas * 5;

        System.out.println("\nQuantidade fases faceis é: " + fases_Faceis);
        System.out.println("Quantidade fases dificeis é: " + fases_Dificeis);
        System.out.println("Horas nas fases faceis são: " + horas_Faceis);
        System.out.println("Horas nas fases dificeis são: " + horas_Dificeis);
        System.out.println("Total de horas gastas para finalizar o jogo: " + total_Horas);
        System.out.printf("Valor em reais da jogatina: R$ %.2f%n", valorTotal);

        sc.close();
    }
}