package ua.dlogushiv.productmanager.model;

import javax.persistence.*;

@Entity
@Table(schema = "product", name = "products")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "producer")
    private String producer;
    @Column(name = "cost")
    private double cost;
    @Column(name = "description")
    private String description;

    public Product() {
    }

    public Product(int i, String test, String testProducer, int i1, String something) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
