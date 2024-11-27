package org.example.models;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "NORMAL", 4, "WRAP");
        hamburger.addHamburgerAddition1("test", 3);
        hamburger.addHamburgerAddition2("test", 3);
        hamburger.addHamburgerAddition3("test", 3);
        hamburger.itemizeHamburger();
    }
}