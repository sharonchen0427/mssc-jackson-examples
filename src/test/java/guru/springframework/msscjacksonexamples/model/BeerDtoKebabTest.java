package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }
//"beer_name":"beerName","beer_style":"Ale"..."created_date":"2021-08-29T22
}
