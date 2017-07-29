package com.patterns.Builder;

/**
 * Created by Vetriselvan on 29-07-2017.
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() throws PizzaYetToBeConstructedException{
        Pizza pizza =  this.pizzaBuilder.getPizza();
        if(pizza == null)
            throw new PizzaYetToBeConstructedException("Pizza Yet to Be Constructed");
        return pizza;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
    }
}


class PizzaYetToBeConstructedException extends Exception {

    public PizzaYetToBeConstructedException() {
    }
    public PizzaYetToBeConstructedException(String message) {
        super(message);
    }
    public PizzaYetToBeConstructedException(String message, Throwable cause) {
        super(message, cause);
    }
}