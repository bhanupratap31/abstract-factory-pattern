package com.example;

class ConcreteProductMacButton implements AbstractProductButton {
    @Override
    public void paint(){
        System.out.println("You have created MacButton.");
    }

    @Override
    public void onClick(){
        System.out.println("MacButton clicked!");
    }
    
}
