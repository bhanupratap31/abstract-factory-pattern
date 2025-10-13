package com.example;


public class WindowsFactory implements GUIFactory {
    
    @Override 
    public AbstractProductButton createButton (){
        return new ConcreteProductWindowsButton(); 
    }

    @Override 
    public AbstractProductCheckbox createCheckbox (){
        return new ConcreteProductWindowsCheckbox(); 
    }
}
