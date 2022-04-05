package com.company.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandList = new ArrayList<Command>();

    public void takeCommand(Command command){
        commandList.add(command);
    }

    public void placeOrders(){
        for (Command command : commandList) {
            command.execute("Data");
        }
        commandList.clear();
    }
}
