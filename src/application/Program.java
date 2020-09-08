package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o nome do comprador ");
		String nome = sc.nextLine();
		System.out.println("Digite o email do comprador ");
		String email = sc.nextLine();
		System.out.println("Digite o ano de nascimento ");
		Date nasc = simpleDate.parse(sc.next());
		
		Client client = new Client(nome, email, nasc);
		
		System.out.println("Entre os dados do seu pedido ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order (new Date(), status, client);
				
		
		System.out.println("quantos items voce vai pedir ");
		int n = sc.nextInt();
		for (int i =0; i < n; i++) {
			System.out.println("nome do produto");
			String nomeProduto = sc.nextLine();
			sc.nextLine();
			System.out.println("Qual o preço do produto ? ");
			double priceProduto = sc.nextDouble();
			
			Product product = new Product (nomeProduto,priceProduto);
			System.out.println("Quantidade");
			
			int quantidadeProduto = sc.nextInt();
			
			OrderItem orderItem = new OrderItem (quantidadeProduto, priceProduto, product);
			
			order.addItem(orderItem);
			
		}
		
		
		
	}

}
