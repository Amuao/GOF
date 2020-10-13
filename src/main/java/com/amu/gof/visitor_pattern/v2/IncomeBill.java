package com.amu.gof.visitor_pattern.v2;


import com.amu.gof.visitor_pattern.v2.visitor.AbstractViewer;
import com.amu.gof.visitor_pattern.v2.visitor.Viewer;

//收入的单子 相当于具体元素节点(concreteElement)
public class IncomeBill extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
        ;
    }

    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer) viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
