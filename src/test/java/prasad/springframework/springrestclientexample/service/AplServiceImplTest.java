package prasad.springframework.springrestclientexample.service;

import lombok.AllArgsConstructor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import prasad.springframework.api.domains.Datum;


import java.util.List;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AplServiceImplTest {

    @Autowired
    private AplService aplService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testgetUsers() {

        System.out.println(aplService);
        List<Datum> data = aplService.getUsers(3);

        assertEquals(4,data.size());
    }
}