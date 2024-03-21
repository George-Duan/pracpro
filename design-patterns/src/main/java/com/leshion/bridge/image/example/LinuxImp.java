package com.leshion.bridge.image.example;

public class LinuxImp implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux系统中显示图像");
    }
}
