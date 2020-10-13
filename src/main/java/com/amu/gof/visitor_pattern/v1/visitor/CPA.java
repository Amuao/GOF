package com.amu.gof.visitor_pattern.v1.visitor;

import com.amu.gof.visitor_pattern.v1.ConsumeBill;
import com.amu.gof.visitor_pattern.v1.IncomeBill;

//注册会计师类，查看账本的类之一 ,相当于具体访问者(concreteVisitor)
public class CPA implements AccountBookViewer {

    //注会在看账本时，如果是支出，则如果支出是工资，则需要看应该交的税交了没
    @Override
    public void view(ConsumeBill consumeBill) {
        if (consumeBill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }

    //如果是收入，则所有的收入都要交税
    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("注会查看收入交税了没。");
    }
}
