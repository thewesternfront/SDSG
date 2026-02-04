package org.sdsg;

public class Armor {

    public Armor(String armorName, String armorType, int armorWeight, int armorDefense) {
        this.armorName = armorName;
        this.armorType = armorType;
        this.armorWeight = armorWeight;
        this.armorDefense = armorDefense;
    }

    public enum ArmorWeight {
        Light,
        Medium,
        Heavy;
    }
    String armorName;
    String armorType;
    int armorWeight;
    int armorDefense;
    int armorAttributes;    // These can be some type of a list
    // Example: strength, accuracy, and other attributes that can be enhanced


    // Getters and Setters //////////////////////////////
    public String getArmorName() {
        return armorName;
    }
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
    //////////
    public String getArmorType() {
        return armorType;
    }
    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
    //////////
    public int getArmorWeight() {
        return armorWeight;
    }
    public void setArmorWeight(int armorWeight) {
        this.armorWeight = armorWeight;
    }
    //////////
    public int getArmorDefense() {
        return armorDefense;
    }
    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }
    //////////
    public int getArmorAttributes() {
        return armorAttributes;
    }
    public void setArmorAttributes(int armorAttributes) {
        this.armorAttributes = armorAttributes;
    }



    public void getArmorStats(){
        System.out.println("Armor Name = " + getArmorName() + "\n" +
                           "Armor Type = " + getArmorType() + "\n" +
                           "Armor Weight = " + Integer.toString(getArmorWeight())
                          );
    }
}
