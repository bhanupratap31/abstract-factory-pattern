package com.example;

public class ConcreteProductMacButton implements AbstraceProductButton {
    @Override
    public void paint(){
        System.out.println("You have created MacButton.");
    }

    @Override
    public void onClick(){
        System.out.println("MacButton clicked!");
    }
    
}
