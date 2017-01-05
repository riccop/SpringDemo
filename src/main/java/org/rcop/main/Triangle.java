/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rcop.main;

import java.util.List;

/**
 *
 * @author elfri
 */
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {

        System.out.println("Point = (" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("Point = (" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("Point = (" + pointC.getX() + ", " + pointC.getY() + ")");

    }

}
