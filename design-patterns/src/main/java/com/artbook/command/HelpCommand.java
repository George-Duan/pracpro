package com.artbook.command;

public class HelpCommand extends Command{

    private HelpHandler hhObj;


    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    @Override
    public void execute(){
        hhObj.display();
    }
}
