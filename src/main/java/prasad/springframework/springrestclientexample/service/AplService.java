package prasad.springframework.springrestclientexample.service;

import prasad.springframework.api.domains.Datum;
import prasad.springframework.api.domains.Users;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface AplService {

    List<Datum> getUsers(Integer limit);
    Flux<Datum> getUsers(Mono<Integer> limit);
}
