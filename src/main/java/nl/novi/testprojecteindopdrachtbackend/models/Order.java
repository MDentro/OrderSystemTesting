package nl.novi.testprojecteindopdrachtbackend.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_price")
    @NotNull
    private double totalPrice;

    @Column
    @NotNull
    private boolean paid;
}
