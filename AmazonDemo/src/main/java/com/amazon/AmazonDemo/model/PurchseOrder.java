package com.amazon.AmazonDemo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class PurchseOrder {
    @Id
    @GeneratedValue
    private int id;
    private int quantity;
    private LocalDate orderTime;
    private int totalAmount;
    @OneToMany(cascade = CascadeType.ALL)
    List<Product>products;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
        this.orderTime = orderTime;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", orderTime=" + orderTime +
                ", totalAmount=" + totalAmount +
                ", products=" + products +
                '}';
    }
}
