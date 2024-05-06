package com.artbook.command;

public class MinimizeCommand extends Command{

    private WindowHandler whObj;

    public MinimizeCommand(){
        whObj = new WindowHandler();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}
