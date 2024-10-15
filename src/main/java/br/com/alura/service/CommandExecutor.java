package br.com.alura.service;

import java.io.IOException;

public class CommandExecutor {

    public void executeCommand(Command command) throws IOException, InterruptedException {
        command.execute();
    }
}
