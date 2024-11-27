package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());
        if (getAddition1Name() != null) {
            System.out.println("Addition1: " + getAddition1Name());
        }
        if (getAddition2Name() != null) {
            System.out.println("Addition2: " + getAddition2Name());
        }
        if (getAddition3Name() != null) {
            System.out.println("Addition3: " + getAddition3Name());
        }
        if (getAddition4Name() != null) {
            System.out.println("Addition4: " + getAddition4Name());
        }
        if (healthyExtra1Name != null) {
            System.out.println("Addition1: " + healthyExtra1Name);
        }
        if (healthyExtra2Name != null) {
            System.out.println("Addition2: " + healthyExtra2Name);
        }

        double totalPrice = getPrice()
                + getAddition1Price()
                + getAddition2Price()
                + getAddition3Price()
                + getAddition4Price()
                + healthyExtra1Price
                + healthyExtra2Price;
        setPrice(totalPrice);
        System.out.println("Price: " + getPrice());
        return getPrice();
    }
}
