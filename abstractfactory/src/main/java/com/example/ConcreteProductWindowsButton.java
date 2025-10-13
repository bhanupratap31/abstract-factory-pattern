package com.example;

public class ConcreteProductWindowsButton implements AbstractProductButton{

    public ConcreteProductWindowsButton() {
    }
    @Override
    public void paint(){
        System.out.println("You have created WindowsButton.");
    }

    @Override
    public void onClick(){
        System.out.println("WindowsButton clicked!");
    }
}
