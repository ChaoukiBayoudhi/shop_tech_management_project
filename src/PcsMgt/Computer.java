package PcsMgt;


import Details.Microprocessor;
import Details.Screen;
import Enumerations.ComputerBrand;
import Enumerations.MaterialState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //generates all getters for all attributes
@Setter //generates all setters for all attributes
@AllArgsConstructor //generates a constructor with all attributes
@NoArgsConstructor //generates a constructor with no attributes
public class Computer {
    //attributes
    private long id;
    private Microprocessor microprocessor;
    private Screen screen;
    private String battery;
    //initialize the brand to OTHER by default
    private ComputerBrand brand=ComputerBrand.OTHER;
    private MaterialState state= MaterialState.IN_STOCK;
    private double price;
    private double diskSpace;
    private double ram;
}
