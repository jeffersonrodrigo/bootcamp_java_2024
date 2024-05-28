import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Tarefas: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da conta: ");
        int conta = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Digite o saldo atual: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        
        scanner.close();
    }
}
