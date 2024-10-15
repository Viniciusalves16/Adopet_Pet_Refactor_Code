package br.com.alura;

import br.com.alura.service.AbrigoService;
import br.com.alura.service.Command;
import br.com.alura.service.client.ClientHttpConfiguration;

import java.io.IOException;


public class ListarAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(clientHttpConfiguration);
            abrigoService.listarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
