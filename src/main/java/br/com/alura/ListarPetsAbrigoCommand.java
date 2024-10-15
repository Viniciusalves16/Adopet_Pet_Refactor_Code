package br.com.alura;

import br.com.alura.service.Command;
import br.com.alura.service.PetService;
import br.com.alura.service.client.ClientHttpConfiguration;

import java.io.IOException;

public class ListarPetsAbrigoCommand implements Command {
    @Override
    public void execute() throws IOException, InterruptedException {

        try {
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConfiguration);
            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
