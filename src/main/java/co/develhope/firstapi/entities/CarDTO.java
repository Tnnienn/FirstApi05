package co.develhope.firstapi.entities;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {

    @NotBlank(message = "Mandatory")
    public String id;
    @NotBlank(message = "Mandatory")
    public String modelName;
    public Double price;

}
