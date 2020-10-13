package com.amu.gof.visitor_pattern.v2.visitor;


import com.amu.gof.visitor_pattern.v2.AbstractBill;
import com.amu.gof.visitor_pattern.v2.ConsumeBill;
import com.amu.gof.visitor_pattern.v2.IncomeBill;

//账单查看者接口（相当于Visitor）比Viewer接口低一个层次的访问者接口
public abstract class AbstractViewer implements Viewer {
    //查看消费的单子
    public abstract void viewConsumeBill(ConsumeBill bill);

    //查看收入的单子
    public abstract void viewIncomeBill(IncomeBill bill);

    public final void viewAbstractBill(AbstractBill bill){}
}
