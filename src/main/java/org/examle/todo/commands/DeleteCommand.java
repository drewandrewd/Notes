package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;
import org.examle.todo.Task;

import java.util.Scanner;

public class DeleteCommand extends CommandMain{

    @Override
    public String getCommandName() {
        return "delete";
    }

    @Override
    public String findId() {
        return Main.scanner.next();
    }

    @Override
    public void process() {
        int id = Integer.parseInt(findId());
        Lists.toDoList.remove(id);
        Lists.getLogger().debug( "remove " + id);
    }
}