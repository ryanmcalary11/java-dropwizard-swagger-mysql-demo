package org.kainos.ea.core;


public class ProductValidator
{
    public String isValidProduct(ProductRequest product)
    {
        if(product.getName().length()>50)
        {
            return "Name greater than 50 characters";
        }

        if(product.getDescription().length()>500)
        {
            return "Description greater than 500 characters";
        }

        if(product.getPrice().length() < 10)
        {
            return "Price less than £10";

}
