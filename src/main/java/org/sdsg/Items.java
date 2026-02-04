package org.sdsg;

import java.io.PrintStream;

public class Items {
    String itemName;
    int itemWeight;
    String itemType;

    public enum ItemType {
        Weapon, Armor, Food;
    }

    public Items(String itemName, int itemWeight, String itemType) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemWeight() {
        return itemWeight;
    }
    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


    public void getItemStats() {
        System.out.println("Item Stats: \n" + "name \n" + itemName + "type \n" + itemType + "weight \n" + itemWeight );

    }
}
