package printersMgt;

import Enumerations.MaterialState;
import Enumerations.PrinterBrand;
import Enumerations.PrinterType;

public class Printer {
    private Long id;
    private PrinterBrand brand;
    private int speedPrinting;
    private int maxNumberPages;
    private PrinterType type;
    private double price;
    private MaterialState state;
}
