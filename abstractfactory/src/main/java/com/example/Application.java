package com.example;

class Application {
    private final AbstractProductButton button; 
    private final AbstractProductCheckbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton(); 
        this.checkbox = factory.createCheckbox(); 
    }

    public void renderUI() {
        button.paint(); 
        checkbox.paint();
    }
}
