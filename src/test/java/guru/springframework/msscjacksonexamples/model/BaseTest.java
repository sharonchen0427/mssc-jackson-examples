package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;


public class BaseTest {
    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("beerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .upc(12345L)
                .myLocalDate(LocalDate.now())
                .price(new BigDecimal("2.99"))
                .build();
    }
}
