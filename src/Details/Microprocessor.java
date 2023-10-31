package Details;

import Enumerations.MicroprocessorBrand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Microprocessor {
    private long id;
    private String name;
    private MicroprocessorBrand brand;
    private int nbCores;
    private float frequency;
}
