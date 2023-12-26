package org.example.lab1.task2;


interface Button {
    void render();
}

interface Dialog {
    void render();
}

// implements используется для реализации интерфейсов
class WebButton implements Button {
    public void render() {
        System.out.println("render WebButton");
    }
}

class MobButton implements Button {
    public void render() {
        System.out.println("render MobButton");
    }
}

abstract class AbstractDialog implements Dialog {
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}

// extends используется для создания иерархии классов, где один класс
// наследуется от другого
// использовать все свойства и методы родительского класса и добавлять
// собственные.
class WebDialog extends AbstractDialog {
    Button getButton() {
        return new WebButton();
    }

}

class MobDialog extends AbstractDialog {
    Button getButton() {
        return new MobButton();
    }
}