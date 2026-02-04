package org.sdsg;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Create a Character and get their stats
        Character Troy = new Character("Troy", "Void Elf", "Frost Mage");
        Troy.describeCharacter();

        Armor myArmor = new Armor();
        myArmor.printArmorWeight();
    }
}
