package com.leshion.decorator;

public class Client {
    public static void main(String[] args) {
        Component component, componentSB;

        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        Component blackComponent = new BlackBorderDecorator(componentSB);
        blackComponent.display();
    }
}
