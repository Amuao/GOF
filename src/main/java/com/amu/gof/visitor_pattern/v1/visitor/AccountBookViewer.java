package com.amu.gof.visitor_pattern.v1.visitor;


import com.amu.gof.visitor_pattern.v1.ConsumeBill;
import com.amu.gof.visitor_pattern.v1.IncomeBill;

//账单查看者接口（相当于Visitor）
public interface AccountBookViewer {
    //查看消费的单子
    void view(ConsumeBill consumeBill);

    //查看收入的单子
    void view(IncomeBill incomeBill);

}
