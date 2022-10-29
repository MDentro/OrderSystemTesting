package nl.novi.testprojecteindopdrachtbackend.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class ProductInputDto {
    public Long id;

    @NotBlank
    public String name;

    @Min(value = 0)
    public double price;

    @NotBlank
    public String category;

    @Size(min=3, max=250)
    public String productDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
