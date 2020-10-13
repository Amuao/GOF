package com.amu.gof.visitor_pattern.v1;

import com.amu.gof.visitor_pattern.v1.visitor.AccountBookViewer;

//账单类 相当于Element
public interface Bill {

    void accept(AccountBookViewer viewer);
}
