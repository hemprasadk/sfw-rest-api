package prasad.springframework.springrestclientexample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import prasad.springframework.api.domains.Datum;
import prasad.springframework.api.domains.Users;

import java.util.List;

@Service

public class AplServiceImpl implements AplService {

private final RestTemplate restTemplate;


private final String api_uri;

    public AplServiceImpl(RestTemplate restTemplate, @Value("${api.uri}") String api_uri) {
        this.restTemplate = restTemplate;
        this.api_uri = api_uri;
    }

    @Override
    public List<Datum> getUsers(Integer limit) {

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(api_uri).queryParam("limit",limit);

        Users users = restTemplate.getForObject(uriComponentsBuilder.toUriString(),Users.class);
        return users.getData();
    }
}
