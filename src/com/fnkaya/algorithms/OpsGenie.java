package com.fnkaya.algorithms;

import java.util.ArrayList;
import java.util.List;

public class OpsGenie {

    public static void main(String[] args) {

        System.out.println(priceCheck(new ArrayList<>(List.of("eggs", "milk", "cheese")),
                new ArrayList<>(List.of(2.89f, 3.29f, 5.79f)),
                new ArrayList<>(List.of("eggs", "eggs", "cheese", "milk")),
                new ArrayList<>(List.of(2.89f, 2.99f, 5.97f, 3.29f))));
    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {

        int error = 0;

        for (int i = 0; i < productSold.size() ; i++) {
            String product = productSold.get(i);
            Float productPrice = 0f;

            if (products.contains(product))
                productPrice = productPrices.get(products.indexOf(product));

            if (!soldPrice.get(i).equals(productPrice))
                error++;
        }

        return error;
    }
}
