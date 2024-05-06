package com.artbook.bridge.image.example;

public class WindowsImp implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        //调用Windows系统的绘制函数绘制图像矩阵
        System.out.println("在Windows系统中显示图像");
    }
}
