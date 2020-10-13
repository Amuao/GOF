package com.amu.gof.visitor_pattern.v2.visitor;

import com.amu.gof.visitor_pattern.v2.AbstractBill;

/**
 * 财务主管（CFO）是针对AbstractBill这一层定义的操作，而原来的老板（Boss）和注册会计师（CPA）
 * 都是针对ConsumeBill和IncomeBill这一层定义的操作，这时已经产生了跨越层次结构的行为，
 * 老板和注册会计师都跨过了抽象单子这一层，直接针对具体的单子定义操作。
 *
 */
//财务主管类，查看账本的类之一，相当于具体访问者(concreteVisitor)作用于高层的层次结构
public class CFO implements Viewer  {

    //财务主管对每一个单子都要核对项目和金额
    public void viewAbstractBill(AbstractBill bill) {
        System.out.println("财务主管查看账本时，每一个都核对项目和金额，金额是" + bill.getAmount() + "，项目是" + bill.getItem());
    }
}
