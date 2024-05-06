package com.artbook.bridge.image.example;

public class Client {

    public static void main(String[] args) {
        Image image = new PNGImage();
        ImageImp imp = new LinuxImp();
        image.setImageImp(imp);
        image.parseFile("小龙女.PNG");
    }
}
