package com.patterns.Builder;

/**
 * Created by Vetriselvan on 29-07-2017.
 */
abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildToppings();
}

class HawaiianPizaaBuilder extends PizzaBuilder {

    @Override
    public void  buildDough() {
        pizza.setDough("dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("sauce");
    }

    @Override
    public void buildToppings() {
        pizza.setTopping("toppings");
    }
}

class SpicyPizaaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("spicy dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("spicy sauce");
    }

    @Override
    public void buildToppings() {
        pizza.setTopping("spicy toppings");
    }
}