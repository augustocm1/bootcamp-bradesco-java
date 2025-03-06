import java.util.Scanner;

public class ContaTerminal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num_conta;
		String agencia,nome_cliente;
		float saldo;

		System.out.print("Digite o número da conta: ");
		num_conta = sc.nextInt();
		System.out.print("Digite a agência: ");
		agencia = sc.next();
		System.out.print("Digite o nome do cliente: ");
		nome_cliente = sc.next();
		System.out.print("Digite o saldo: ");
		saldo = sc.nextFloat();

		System.out.println("Olá "+ nome_cliente +", obrigado por criar uma conta em nosso banco, sua agência é "
		+ agencia +", conta "+ num_conta +" e seu saldo "+ saldo +" já está disponível para saque.");
	}
}
