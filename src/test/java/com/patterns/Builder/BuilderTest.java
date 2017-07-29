package com.patterns.Builder;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

/**
 * Created by Vetriselvan on 29-07-2017.
 */

public class BuilderTest {

    @Test
    public void testBuilder() {
        System.out.println("test started");

        PizzaBuilder pizzaBuilder = new HawaiianPizaaBuilder();
        Waiter waiter = new Waiter(pizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = null;
        try {
            pizza = waiter.getPizza();
        } catch(Exception ex) {
        }
        Pizza testPizza = new Pizza();
        testPizza.setSauce("sauce");
        testPizza.setTopping("toppings");
        testPizza.setDough("dough");

        assert(testPizza.equals(pizza));
        System.out.println("test ended");
    }
}
