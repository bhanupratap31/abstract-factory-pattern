package com.example;

class MacFactory implements GUIFactory{
    @Override 
    public AbstractProductButton createButton (){
        return new ConcreteProductMacButton(); 
    }

    @Override 
    public AbstractProductCheckbox createCheckbox (){
        return new ConcreteProductMacCheckbox(); 
    }
}
