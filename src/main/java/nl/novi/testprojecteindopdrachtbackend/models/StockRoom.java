package nl.novi.testprojecteindopdrachtbackend.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "stock_room")
public class StockRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    private String location;
}
