package entities;

import enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrdemItem> itens = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }



    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrdemItem> getItens() {
        return itens;
    }

    public void addItens(OrdemItem item){
        itens.add(item);
    }
    public void removeItens(OrdemItem item){
        itens.remove(item);
    }
    public double total(){
        double sum = 0;
        for (OrdemItem produc: itens) {
            sum += produc.subTotal();
        }
        return sum;
    }
}
