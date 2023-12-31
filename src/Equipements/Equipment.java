package Equipements;

import Details.Microprocessor;
import Enumerations.MaterialState;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString //generates a redefinition of toString method with all attributes values
//@ToString(exclude = "microprocessor") //generates a redefinition of toString method with all attributes values except the microprocessor
//@ToString(of = {"id","name","price"}) //generates a redefinition of toString method with only the id, name and price attributes values
//@EqualsAndHashCode //generates a redefinition of Equals and hashCode methods using all attributes values
//@EqualsAndHashCode(of = {"id","name","price"}) //generates a redefinition of Equals and hashCode methods using only the id, name and price attributes values
//@EqualsAndHashCode(onlyExplicitlyIncluded = true) //generates a redefinition of Equals and hashCode methods using only the id attribute value
@EqualsAndHashCode(of="id") //generates a redefinition of Equals and hashCode methods using only
public class Equipment {
    //@EqualsAndHashCode.Include // using only the id attribute value (used with @EqualsAndHashCode(onlyExplicitlyIncluded = true))
    private Long id;
    private String name;
    private double price;
    private MaterialState state=MaterialState.IN_STOCK;
    //@ToString.Exclude //exclude the attribute microprocessor from the redefinition of toString method
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
   /* @Override
    //redefinition of toString method
    public String toString() {
        return "id: "+id+"\nname: "+name+"\nprice: "+price+"\nstate: "+state+"\nmicroprocessor: "+microprocessor+"\nram: "+ram;
    }*/

    //redefinition of Equals and hashCode methods
    //we use the id to compare two objects of type Equipment

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment equipment)) return false;
        //return Objects.equals(getId(), equipment.getId());
        //return this.id==equipment.id;
        return this.id==((Equipment)o).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }*/
}
