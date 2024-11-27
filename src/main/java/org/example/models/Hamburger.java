package org.example.models;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);
        if (addition1Name != null) {
            System.out.println("Addition1: " + addition1Name);
        }
        if (addition2Name != null) {
            System.out.println("Addition2: " + addition2Name);
        }
        if (addition3Name != null) {
            System.out.println("Addition3: " + addition3Name);
        }
        if (addition4Name != null) {
            System.out.println("Addition4: " + addition4Name);
        }

        price += addition1Price + addition2Price + addition3Price + addition4Price;
        System.out.println("Price: " + price);
        return price;
    }
}
