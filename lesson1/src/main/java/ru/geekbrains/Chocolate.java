package ru.geekbrains;

public class Chocolate extends Product {
    private String color;
    private String topping;


    public String getColor() {
        return color;
    }

    public String getTopping() {
        return topping;
    }

    public Chocolate(String brand, String name, double price, String color, String topping) {
        super(brand, name, price);
        this.color = color;
        this.topping = topping;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - %.2f - %s - %s", brand, name, price, color, topping);
    }
}
