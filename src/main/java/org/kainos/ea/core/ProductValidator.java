package org.kainos.ea.core;

public class ProductValidator {

    public String isValidProduct(ProductRequest product)
    {
        if (product.getName().length()> 75)
        {
            return  "Name greater than 75 characters";
        }

        if (product.getDescription().length()> 500) {
            return "Description greater than 500 characters";
        }
        if (product.getPrice().length()> 10)
        {
            return "Price less then £10";
        }
        return null;
    }

}
