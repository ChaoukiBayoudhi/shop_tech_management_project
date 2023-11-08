package smartphonesMgt;

import Details.Screen;
import Equipements.Equipment;
import PcsMgt.Computer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Smartphone is the child class of Equipment
//Equipment is the parent class of Smartphone
//Smartphone inherits from Equipment everything(attributes and methods) except the constructors
//in Smarthones class we can access to the attributes and methods of Equipment directly except the private ones
public class Smartphone extends Equipment {
    private Screen screen;
    private  String battery;
    private String camera;
    private int diskSpace;

    public void print()
    {

    }
}
