package com.leshion.command;

import java.util.ArrayList;

public class FBSettingWindow {

    private String title;

    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title){
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void addFunctionButton(FunctionButton fb){
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb){
        functionButtons.remove(fb);
    }

    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons){
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("=================================================");
    }
}
