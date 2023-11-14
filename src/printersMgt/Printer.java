package printersMgt;

import Details.Microprocessor;
import Enumerations.MaterialState;
import Enumerations.PrinterBrand;
import Enumerations.PrinterType;
import Equipements.Equipment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Printer extends Equipment {


    private PrinterBrand brand;

    private int speedPrinting;
    private int maxNumberPages;
    private PrinterType type;

    @Override
    public String toString() {
        return "Printer{" +
                 super.toString()+
                "brand=" + brand +
                ", speedPrinting=" + speedPrinting +
                ", maxNumberPages=" + maxNumberPages +
                ", type=" + type +
                "} " ;
    }
}
