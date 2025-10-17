package com.example;

class ConcreteProductWindowsButton implements AbstractProductButton{
    @Override
    public void paint(){
        System.out.println("You have created WindowsButton.");
    }

    @Override
    public void onClick(){
        System.out.println("WindowsButton clicked!");
    }
}
