package com.amu.gof.visitor_pattern.v2;


//抽象单子类，一个高层次的单子抽象
public abstract class AbstractBill implements Bill {

    protected double amount;

    protected String item;

    public AbstractBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
