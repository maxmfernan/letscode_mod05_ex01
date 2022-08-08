package br.com.letscode.aula01.service;

import br.com.letscode.aula01.model.ClientModel;
import br.com.letscode.aula01.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients(){
        return this.clientRepository.findAll();
    }

    public Optional<ClientModel> getById(long id){
        return this.clientRepository.findById(id);
    }

    public void updateClient(long id, ClientModel newClient){
        if( clientRepository.findById(id).isPresent() ){
            ClientModel oldClient = clientRepository.getReferenceById(id);
            oldClient.setAge(newClient.getAge());
            oldClient.setName(newClient.getName());
            oldClient.setEmail(newClient.getEmail());
            oldClient.setVat(newClient.getVat());
            clientRepository.save(oldClient);
        }



    }
    public void createClient(ClientModel client){
        this.clientRepository.save(client);
    }
    public void deleteById(long id){
        this.clientRepository.deleteById(id);
    }
}
