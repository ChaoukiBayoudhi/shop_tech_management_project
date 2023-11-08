package Program;

import PcsMgt.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //System.out.println(computer.toString());
        System.out.println(computer);
        Computer computer1 = new Computer();
        System.out.println(computer1);
        System.out.println(computer.equals(computer1));
        System.out.println(computer.equals(computer));
        System.out.println(computer.getClass());

        System.out.println("Enter computer information :");
        System.out.print("id =");
        Scanner sc = new Scanner(System.in);
        //long id = sc.nextLong();
        //computer.setId(id);
        computer.setId(sc.nextLong());
        System.out.print("name =");
        sc.next();
        computer.setName(sc.nextLine());
        System.out.print("price =");
        computer.setPrice(sc.nextDouble());
        System.out.print("storage capacity =");
        computer.setDiskSpace(sc.nextDouble());
        System.out.print("battery =");
        computer.setBattery(sc.nextLine());

        //show the computer information in the screen
        computer.print();

    }

}