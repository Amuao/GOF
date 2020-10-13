package com.amu.gof.visitor_pattern.v1;

import com.amu.gof.visitor_pattern.v1.visitor.AccountBookViewer;

//消费的账单  相当于具体元素节点(concreteElement)
public class ConsumeBill implements Bill {
    private double amount;

    private String item;


    public ConsumeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }
}
