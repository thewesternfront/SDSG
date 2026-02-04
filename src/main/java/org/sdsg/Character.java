package org.sdsg;

import static org.sdsg.Armor.ArmorWeight.Light;

public class Character {
    // Attributes
    String cname;
    String crace;
    String cclass;
    Armor carmor = new Armor();

    // Constructor
    public Character(String cname, String crace, String cclass) {
        this.cname = cname;
        this.crace = crace;
        this.cclass = cclass;
        Armor.ArmorWeight cArmorWeight = Light;

    }

    // Name /////////////////////////////////
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }

    // Race /////////////////////////////////
    public String getCrace() {
        return crace;
    }
    public void setCrace(String crace) {
        this.crace = crace;
    }

    // Class /////////////////////////////////
    public String getCclass() {
        return cclass;
    }
    public void setCclass(String cclass) {
        this.cclass = cclass;
    }

    // INFO /////////////////////////////////
    public void describeCharacter() {
        System.out.println("Character Name: " + cname + "\n" +
                           "Character Race: " + crace + "\n" +
                           "Character Class: " + cclass + "\n");
        System.out.println("Armor Weight = " + Light + "\n");


    }
}