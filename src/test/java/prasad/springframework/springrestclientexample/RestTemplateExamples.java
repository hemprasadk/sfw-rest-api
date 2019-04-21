package prasad.springframework.springrestclientexample;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestTemplateExamples {
    public static final String API_ROOT = "https://api.predic8.de:443/shop";

    @Test
    public void getCatergory() throws Exception
    {
        String apiUrl = API_ROOT + "/categories/";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(apiUrl,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }
    @Test
    public void getCustomers() throws Exception
    {
        String apiUrl = API_ROOT + "/customers/";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(apiUrl,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }

    @Test
    public void  createCustomer() throws  Exception
    {
        String apiUrl = API_ROOT + "/customers/";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> postMap = new HashMap<>();

        postMap.put("firstname", "Joe");
        postMap.put("lastname", "Buck");

        JsonNode jsonNode = restTemplate.postForObject(apiUrl, postMap, JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());



    }
}
