package com.example;

public class ConcreteProductWindowsCheckbox implements AbstractProductCheckbox {
    @Override 
    public void paint(){
        System.out.println("You have created WindowsCheckbox.");
    }

    @Override
    public void onSelect(){
        System.out.println("WindowsCheckbox selected!");
    }
}
