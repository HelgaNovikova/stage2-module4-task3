package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double square = rectangle.getSideA() * rectangle.getSideB();
        double perimeter = 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
        RectangleWarehouse.getInstance().put(rectangle.getId(), new RectangleValues(square, perimeter));
    }
    // Write your code here!
}
