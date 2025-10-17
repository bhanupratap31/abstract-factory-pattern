package com.example;

public class Main {
    public static void main(String[] args) {
        String os = System.getProperty("os.name"); 
        GUIFactory factory; 

        if(os.contains("Windows")) {
            factory = new WindowsFactory(); 
        } else{
            factory = new MacFactory(); 
        }

        Application app = new Application(factory); 
        app.renderUI();
    }
}