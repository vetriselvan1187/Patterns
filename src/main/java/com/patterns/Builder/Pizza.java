package com.patterns.Builder;

/**
 * Created by Vetriselvan on 29-07-2017.
 */
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        StringBuilder pizza = new StringBuilder();
        pizza.append((this.dough != null) ? this.dough : "").append(this.sauce != null ? this.sauce : "")
                .append(this.topping != null ? this.topping : "");
        return pizza.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        Pizza other  = (Pizza) obj;
        return (sauce != null && sauce.equals(other.sauce))
                && (dough != null && dough.equals(other.dough))
                && (topping != null && topping.equals(other.topping));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (sauce == null ? 0 : sauce.hashCode());
        result = prime * result + (dough == null ? 0 : dough.hashCode());
        result = prime * result + (topping == null ? 0 : topping.hashCode());
        return result;
    }
}
