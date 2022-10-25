package Entities;

import java.util.Date;

public class Order {
    private Integer id;
    private Date momment;
    private OrderStatus status;

    public Order(){

    }

    public Order(Integer id, Date momment, OrderStatus status) {
        this.id = id;
        this.momment = momment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomment() {
        return momment;
    }

    public void setMomment(Date momment) {
        this.momment = momment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
