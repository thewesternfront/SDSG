package org.sdsg;

public class Armor {
    public enum ArmorWeight {
        Light,
        Medium,
        Heavy;
    }

    public void printArmorWeight(){
        System.out.println(ArmorWeight.Light);
    }
}
