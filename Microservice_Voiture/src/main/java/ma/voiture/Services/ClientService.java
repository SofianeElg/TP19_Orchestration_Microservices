package ma.voiture.Services;

import ma.voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-client")
public interface ClientService {

    @GetMapping(path = "/client/{id}")
    Client clientById(@PathVariable("id") Long id);
}
