package br.com.letscode.aula01.controller;

import br.com.letscode.aula01.dto.ClientDTO;
import br.com.letscode.aula01.model.ClientModel;
import br.com.letscode.aula01.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/list")
    public List<ClientModel> getAllClients(){

        return this.clientService.getAllClients();
    }
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateClient( @PathVariable("id") long id, @RequestBody ClientModel client){
        this.clientService.updateClient(id, client);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createClient(@RequestBody ClientModel client){
        this.clientService.createClient(client);
    }
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteClient(@PathVariable("id") long id){
        this.clientService.deleteById(id);
    }
}







