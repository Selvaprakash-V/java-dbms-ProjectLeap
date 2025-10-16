package com.amazon.AmazonDemo.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int price;
    private int quantity;
    private String description;
    private String review;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="purchaseOrder")
    private PurchseOrder order;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public PurchseOrder getOrder() {
        return order;
    }

    public void setOrder(PurchseOrder order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", review='" + review + '\'' +
                ", order=" + order +
                '}';
    }
}
