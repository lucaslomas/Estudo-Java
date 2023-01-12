package programm;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date(DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println();
        System.out.println("Enter Order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        LocalDateTime moment = LocalDateTime.now();
        Order ordem = new Order(moment,OrderStatus.valueOf(status), new Client(name, email, birthDate));
        System.out.println("How many items to this order: ");
        int quantitiesProduct = sc.nextInt();
        for (int i = 1; i <= quantitiesProduct; i++){
            System.out.println();
            System.out.println("Enter #" + i + "data item: ");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product Price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrdemItem ordemItens = new OrdemItem(quantity, priceProduct, new Product(nameProduct, priceProduct));
            ordem.addItens(ordemItens);
        }
        System.out.println();
        System.out.println("Ordem Summary");
        System.out.println("Order moment: " + ordem.getMoment());
        System.out.println("Order Status: " + ordem.getStatus());
        System.out.println("Client: " + ordem.getClient().getName() + " ("+ordem.getClient().getBirthDate()+")"+" - " + ordem.getClient().getEmail());
        System.out.println("Order Item: ");
        for (OrdemItem p: ordem.getItens()) {
            System.out.println(p.getProduct().getName() + ", R$" + p.getProduct().getPrice() + ",Quantity: " + p.getQuantity()+ ", Subtotal: " + p.subTotal());
        }
        System.out.println("Total: " + ordem.total());


    }
}