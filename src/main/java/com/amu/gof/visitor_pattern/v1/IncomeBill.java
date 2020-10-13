package com.amu.gof.visitor_pattern.v1;

import com.amu.gof.visitor_pattern.v1.visitor.AccountBookViewer;

//收入的单子 相当于具体元素节点(concreteElement)
public class IncomeBill implements Bill{
    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
