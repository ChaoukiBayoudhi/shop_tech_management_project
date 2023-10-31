package printersMgt;

import Details.Microprocessor;
import Enumerations.MaterialState;
import Enumerations.PrinterBrand;
import Enumerations.PrinterType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Printer {
    private Long id;
    private PrinterBrand brand;
    private Microprocessor microprocessor;

    private int speedPrinting;
    private int maxNumberPages;
    private PrinterType type;
    private double price;
    private MaterialState state;
}
