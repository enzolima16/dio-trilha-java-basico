import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner:
        Scanner sc = new Scanner (System.in);
        //TODO: exibir as mensagens ao usuario:
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();
        System.out.println("Digite o número da sua conta.");
        int numConta = sc.nextInt();
        System.out.println("Insira também o seu nome.");
        String nome = sc.next();
        System.out.println("Por fim, insira o saldo da sua conta!");
        double saldo = sc.nextDouble();
    
        //Exibir mensagem final:
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível.");
    }
}
