package org.example.lab1.task3;

class WebButton implements Button {
    public void render() {
        System.out.println("render WebButton");
    }

    public void onClick() {
        System.out.println("Event on click WebButton");
    }
}

class WebCheckbox implements Checkbox {
    private boolean state;

    public void render() {
        System.out.println(
                String.format("render WebCheckbox. With state %s", state));
    }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}

class WebInput implements Input {
    private String value;

    public Input value(String value) {
        this.value = value;
        return null;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(
                String.format("render WebInput. With value %s", value));
    }
}

class WebFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new WebButton();
    }

    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    public Input createInput() {
        return new WebInput();
    }
}
