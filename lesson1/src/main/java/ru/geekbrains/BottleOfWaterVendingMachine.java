package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume) {

        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName() == name && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String brand, String topping) {
        for (Product prod : products) {
            if (prod instanceof Chocolate) {
                if (Objects.equals(prod.getBrand(), brand) && Objects.equals(((Chocolate) prod).getTopping(), topping)) {
                    return (Chocolate) prod;
                }
            }

        }
        return null;
    }


}
