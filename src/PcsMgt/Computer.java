package PcsMgt;


import Details.Screen;
import Enumerations.ComputerBrand;
import Equipements.Equipment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //generates all getters for all attributes
@Setter //generates all setters for all attributes
@AllArgsConstructor //generates a constructor with all attributes
@NoArgsConstructor //generates a constructor with no attributes
public class Computer extends Equipment {
    //attributes

    private Screen screen=new Screen();
    private String battery;
    //initialize the brand to OTHER by default
    private ComputerBrand brand=ComputerBrand.OTHER;
    private double diskSpace;

    //redefinition of the method print()
   /* @Override
    public void print(){
        super.print();
        System.out.println("screen: " + screen);
        System.out.println("battery: " + battery);
        System.out.println("brand: " +brand);
        System.out.println("diskSpace: " + diskSpace);
    }*/

    //redefinition of toString method

    @Override
    public String toString() {
        return "Computer{" +
                super.toString()+
                "screen=" + screen +
                ", battery='" + battery + '\'' +
                ", brand=" + brand +
                ", diskSpace=" + diskSpace +
                '}';
    }
}
