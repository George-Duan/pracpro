package com.artbook.bridge.image.example;

public class UnixImp implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Unix系统中显示图像");
    }
}
