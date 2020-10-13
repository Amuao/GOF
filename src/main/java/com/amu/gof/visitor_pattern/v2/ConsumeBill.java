package com.amu.gof.visitor_pattern.v2;

import com.amu.gof.visitor_pattern.v2.visitor.AbstractViewer;
import com.amu.gof.visitor_pattern.v2.visitor.Viewer;

//消费的账单  相当于具体元素节点(concreteElement)
public class ConsumeBill extends AbstractBill {


    public ConsumeBill(double amount, String item) {
      super(amount, item);
    }


    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
