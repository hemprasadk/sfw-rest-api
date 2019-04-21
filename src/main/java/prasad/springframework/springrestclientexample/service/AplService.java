package prasad.springframework.springrestclientexample.service;

import prasad.springframework.api.domains.Datum;
import prasad.springframework.api.domains.Users;

import java.util.List;

public interface AplService {

    List<Datum> getUsers(Integer limit);
}
