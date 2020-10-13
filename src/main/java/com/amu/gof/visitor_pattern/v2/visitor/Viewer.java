package com.amu.gof.visitor_pattern.v2.visitor;

import com.amu.gof.visitor_pattern.v2.AbstractBill;

//超级访问者接口（它支持定义高层操作）
public interface Viewer {

    void viewAbstractBill(AbstractBill bill);
}
