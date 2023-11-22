package impl;

import jdk.swing.interop.SwingInterOpUtils;
import patter.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
