package org.example.lab2.task2;

class SquareStickAdapter extends RoundStick {
    private SquareStick stick;
    
    public SquareStickAdapter(SquareStick stick) {
        super(0); //ключевое слово для суперкласса
        this.stick = stick;
    }
    public int getRadius() {
        // Вычислить половину диагонали квадратной палки по
        // теореме Пифагора.
        return (int) (stick.getWidth() * Math.sqrt(2) / 2);
    }
    
}