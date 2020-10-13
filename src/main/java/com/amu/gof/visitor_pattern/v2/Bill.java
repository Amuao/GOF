package com.amu.gof.visitor_pattern.v2;

import com.amu.gof.visitor_pattern.v2.visitor.AbstractViewer;
import com.amu.gof.visitor_pattern.v2.visitor.Viewer;

//账单类 相当于Element
public interface Bill {

    void accept(Viewer viewer);
}
