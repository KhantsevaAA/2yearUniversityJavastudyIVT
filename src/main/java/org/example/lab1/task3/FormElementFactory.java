package org.example.lab1.task3;

interface Button {
    void render();
    void onClick();
}

interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}

interface Input {
    void render();
    Input value(String value);
    String value();
}

interface FormElementFactory {
    Button createButton();
    Checkbox createCheckbox();
    Input createInput();
}