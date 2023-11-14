package Equipements;

import Details.Microprocessor;
import Enumerations.MaterialState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    private Long id;
    private String name;
    private double price;
    private MaterialState state=MaterialState.IN_STOCK;
    private Microprocessor microprocessor;
    private double ram;

    /*public void print(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("state: "+state);
        System.out.println("microprocessor: "+microprocessor);
        System.out.println("ram: "+ram);

    }*/

    //if we redefine the method toString() we don't need the print() method
    @Override
    //redefinition of toString method
    public String toString() {
        return "id: "+id+"\nname: "+name+"\nprice: "+price+"\nstate: "+state+"\nmicroprocessor: "+microprocessor+"\nram: "+ram;
    }
}
