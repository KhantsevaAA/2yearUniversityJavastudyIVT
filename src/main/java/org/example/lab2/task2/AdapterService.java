package org.example.lab2.task2;

class AdapterService {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);
        System.out.println(hole.fits(roundStick)); // TRUE
        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);
        System.out.println(
                hole.fits(smallSquareStickAdapter)); // TRUE
        System.out.println(
                hole.fits(largeSquareStickAdapter)); // FALSE
    }
}