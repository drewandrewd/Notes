package org.examle.todo;

import org.examle.todo.model.Lists;
import org.examle.todo.parser.CommandParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    public static Lists getList() {
        return new Lists();
    }

    public static CommandParser getParser() {
        return new CommandParser();
    }
}
