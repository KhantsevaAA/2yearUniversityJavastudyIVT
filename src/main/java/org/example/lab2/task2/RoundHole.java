package org.example.lab2.task2;

class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundStick stick) {
    return this.getRadius() >= stick.getRadius();
    }
}