package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import entities.Account;
import entities.AccountEnum;
import entities.Address;
import entities.Client;
import service.BankService;
import service.ServiceFactory;

/**
 * OBSERVAÇÕES: 
 * NÃO é permitido o uso de nenhuma estrutura de repetição (for, while, do-while).
 * Tente, ao máximo, evitar o uso das estruturas if, else if, else e switch-case
 * 
 */
public class PrincipalMateus {

	private static BankService service = ServiceFactory.getService();
	
	private static List<Client> clientes = new ArrayList<>();
	private static List<Address> enderecos = new ArrayList<>();
	private static List<Account> contas = new ArrayList<>();
	
	public static void main(String[] args) {
		//TO test here
		// Complete o código aqui
		Address adress1 = new Address("Rua Larousse", 76, "Apt. 1301", "PE", "Brazil");
		Address adress2 = new Address("Rua Gringa", 42, "Apt. 201", "NY", "United States");
		
		Client c1 = new Client("Mateus", "mateus@email.com", adress1);
		Client c2 = new Client("Edward", "Edward@email.com", adress2);


		Account a1 = new Account(0432, 92, 200, c1, AccountEnum.SAVING);
		Account a2 = new Account(0432, 94, 400, c2, AccountEnum.JOINT);

		contas.add(a1);
		contas.add(a2);

		clientes.add(c1);
		clientes.add(c2);

		imprimirNomesClientes();
		imprimirMediaSaldos();
		imprimirPaisClienteMaisRico();
		imprimirSaldoMedio(0432);
		imprimirClientesComPoupanca();
		getEstadoClientes(0432);
		getNumerosContas("Brazil");
		getMaiorSaldo(c1.getEmail());
		sacar(0432, 94, 100);
		depositar("Brazil", 300);
		transferir(0432, 92, 94, 200);
		getSomaContasEstado("PE");
		getEmailsClientesContasConjuntas();
		isPrimo(3);
		getFatorial(5);
	}

	/**
	 * 1. Imprima na tela o nome e e-mail de todos os clientes (sem repetição), usando o seguinte formato:
	 * Ze Mane - ze@mail.br
	 */
	public static void imprimirNomesClientes() {
		clientes.stream()
		.map(cliente -> cliente.getName() +" - "+ cliente.getEmail())
		.distinct()
		.forEach(System.out::println);
	}

	/**
	 * 2. Imprima na tela o nome do cliente e a média do saldo de suas contas, ex:
	 * Ze Mane - 352
	 */
	public static void imprimirMediaSaldos() {
		clientes
		.stream()
		.forEach(cliente -> {
			double media = 
					contas
					.stream()
					.filter(conta -> conta.getClient().getName().equals(cliente.getName()))
					.mapToDouble(conta -> conta.getBalance())
					.average()
					.getAsDouble();
			
			System.out.println(cliente.getName() + " - " + media);
		});
	}

	/**
	 * 3. Considerando que só existem os países "Brazil" e "United States", 
	 * imprima na tela qual deles possui o cliente mais rico, ou seja,
	 * com o maior saldo somando todas as suas contas.
	 */

	public static void imprimirPaisClienteMaisRico() {
		double sumClientBrazil = 
				contas
				.stream()
				.filter(conta -> conta.getClient().getAddress().getCountry().equals("Brazil"))
				.mapToDouble(conta -> conta.getBalance())
				.sum();

		double sumClientUSA = 
				contas
				.stream()
				.filter(conta -> conta.getClient().getAddress().getCountry().equals("United States"))
				.mapToDouble(conta -> conta.getBalance())
				.sum();
		// Complete o código aqui

		int result = Double.compare(sumClientBrazil, sumClientUSA);
		System.out.println(result == 1 ? "Brazil" : "United States");
	}

	/**
	 * 4. Imprime na tela o saldo médio das contas da agência
	 * @param agency
	 */
	public static void imprimirSaldoMedio(int agency) {	
		double average = 
				contas
				.stream()
				.filter(conta -> conta.getAgency() == agency)
				.mapToDouble(conta -> conta.getBalance())
				.average()
				.getAsDouble();
		System.out.println(average);
	}

	/**
	 * 5. Imprime na tela o nome de todos os clientes que possuem conta poupança (tipo SAVING)
	 */
	public static void imprimirClientesComPoupanca() {		
		contas
		.stream()
		.filter(conta -> conta.getType() == AccountEnum.SAVING)
		.map(conta -> conta.getClient())
		.map(client -> client.getName())
		.forEach(System.out::println);
	}

	/**
	 * 6.
	 * @param agency
	 * @return Retorna uma lista de Strings com o "estado" de todos os clientes da agência
	 */
	public static List<String> getEstadoClientes(int agency) {
		List<String> stateOfAllClients = 
				contas
				.stream()
				.filter(conta -> conta.getAgency() == agency)
				.map(conta -> conta.getClient().getAddress().getState())
				.collect(Collectors.toList());
		return (List<String>) stateOfAllClients;
	}

	/**
	 * 7.
	 * @param country
	 * @return Retorna uma lista de inteiros com os números das contas daquele país
	 */
					
	public static List<Integer> getNumerosContas(String country) {
		// Complete o código aqui
		List<Integer> countryNumbers = contas.stream()
											.filter(account -> account.getClient().getAddress().getCountry() == country)
											.map(account -> account.getNumber())
											.collect(Collectors.toList());
				
		return countryNumbers;
	}
	

	/**
	 * 8.
	 * Retorna o somatório dos saldos das contas do cliente em questão 
	 * @param clientEmail
	 * @return
	 */
	public static double getMaiorSaldo(String clientEmail) {
		double sumBalance =
				contas
				.stream()
				.filter(conta -> conta.getClient().getEmail().equals(clientEmail))
				.mapToDouble(conta -> conta.getBalance())
				.sum();
		return sumBalance;
	}

	/**
	 * 9.
	 * Realiza uma operação de saque na conta de acordo com os parâmetros recebidos
	 * @param agency
	 * @param number
	 * @param value
	 */
	public static void sacar(int agency, int number, double value) {
		contas
		.stream()
		.filter(conta -> conta.getAgency( ) == agency && conta.getNumber() == number)
		.mapToDouble(conta -> { 
			double operacao = conta.getBalance() - value; 
			conta.setBalance(operacao);
			return operacao;
		})
		.sum();	
	}

	/**
	 * 10. Realiza um deposito para todos os clientes do país em questão	
	 * @param country
	 * @param value
	 */
	public static void depositar(String country, double value) {
		contas
		.stream()
		.filter(conta -> conta.getClient().getAddress().getCountry().equals(country))
		.mapToDouble(conta -> {
			double deposito = conta.getBalance() + value;
			conta.setBalance(deposito);
			return deposito;
		})
		.sum();
	}

	/**
	 * 11. Realiza uma transferência entre duas contas de uma agência.
	 * @param agency - agência das duas contas
	 * @param numberSource - conta a ser debitado o dinheiro
	 * @param numberTarget - conta a ser creditado o dinheiro
	 * @param value - valor da transferência
	 */
	public static void transferir(int agency, int numberSource, int numberTarget, double value) {
		contas
		.stream()
		.filter(conta -> conta.getAgency() == agency && conta.getNumber() == numberSource)
		.mapToDouble(conta -> {
			double transferencia = conta.getBalance() - value;
			conta.setBalance(transferencia);
			return transferencia;
		})
		.sum();
		
		contas
		.stream()
		.filter(conta -> conta.getAgency() == agency && conta.getNumber() == numberTarget)
		.mapToDouble(conta -> {
			double valorRecebido = conta.getBalance() + value;
			conta.setBalance(valorRecebido);
			return valorRecebido;
		})
		.sum();
		
	}

	/**
	 * 12.
	 * @param clients
	 * @return Retorna uma lista com todas as contas conjuntas (JOINT) dos clientes
	 */											//List<Client> clients
	
	public static List<Account> getContasConjuntas(List<Client> clients) {
		List<Account> jointAccounts = new ArrayList<Account>();
		// Complete o código aqui
		jointAccounts = contas.stream().filter(acc -> acc.getType() == AccountEnum.JOINT).filter(acc -> acc.getClient() == clients).collect(Collectors.toList());
	
		return jointAccounts;
	}

	/**collector
	 * 13.
	 * @param state
	 * @return Retorna uma lista com o somatório dos saldos de todas as contas do estado 
	 */
	public static double getSomaContasEstado(String state) {
		double sumAccountState =
				contas
				.stream()
				.filter(conta -> conta.getClient().getAddress().getState().equals(state))
				.mapToDouble(conta -> conta.getBalance())
				.sum();
		return sumAccountState;
	}

	/**
	 * 14.
	 * @return Retorna um array com os e-mails de todos os clientes que possuem contas conjuntas
	 */			
	public static List<String> getEmailsClientesContasConjuntas() {
		  	List<String> emailsAllClientsJoinAccounts =
		  		contas
		  		.stream()
		  		.filter(conta -> conta.getType().equals(AccountEnum.JOINT))
		  		.map(conta -> conta.getClient().getEmail())
				.collect(Collectors.toList());
		
		return emailsAllClientsJoinAccounts;		
	}

	/**
	 * 15.
	 * @param number
	 * @return Retorna se o número é primo ou não
	 */
	public static boolean isPrimo(int number) {
		return IntStream
				.rangeClosed(2, (number/2))
				.noneMatch(i -> number % i==0);
	}

	/**
	 * 16.
	 * @param number
	 * @return Retorna o fatorial do número
	 */
	public static int getFatorial(int number) {
		int factorial =
				IntStream.rangeClosed(1, number)
				.reduce(1, (x,y) -> x*y);
		return factorial;
	}
}
