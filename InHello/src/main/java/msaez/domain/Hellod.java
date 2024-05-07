package msaez.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msaez.domain.*;
import msaez.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;

    public Hellod(Hello aggregate) {
        super(aggregate);
    }

    public Hellod() {
        super();
    }
}
//>>> DDD / Domain Event
