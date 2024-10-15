package br.com.alura.service;

import java.io.IOException;

public interface Command {

    void execute() throws IOException, InterruptedException;
}
