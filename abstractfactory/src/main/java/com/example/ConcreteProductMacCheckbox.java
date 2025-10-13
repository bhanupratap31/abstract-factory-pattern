package com.example;

public class ConcreteProductMacCheckbox implements AbstractProductCheckbox {
    @Override 
    public void paint(){
        System.out.println("You have created MacCheckbox.");
    }

    @Override
    public void onSelect(){
        System.out.println("MacCheckbox selected!");
    }
}