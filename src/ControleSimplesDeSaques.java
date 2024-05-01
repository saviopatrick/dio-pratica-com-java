import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i = 0; i < 3; i++) {

            double valorDoSaque = scanner.nextDouble();

            if (valorDoSaque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            } else {
                if (valorDoSaque <= limiteDiario) {
                    limiteDiario -= valorDoSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                } else {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
        }
        // sair
        scanner.close();
    }
}
