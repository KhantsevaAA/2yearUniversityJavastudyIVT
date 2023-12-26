package org.example.lab1.task3;

class MobButton implements Button {
    public void render() {
        System.out.println("render MobButton");
    }

    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}

class MobCheckbox implements Checkbox {
    private boolean state;

    public void render() {
        System.out.println(String.format("render MobCheckbox. With state %s", state));
    }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}

class MobInput implements Input {
    private String value;

    public  Input value(String value) {
        this.value = value;
        return null;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(String.format("render MobInput. With value %s", value));
    }
}

class MobFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }
}