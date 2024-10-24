package com.example.Sneaker24.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sneaker")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int size;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int quantity;

    public Long getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
