package msaez.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msaez.domain.*;
import msaez.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;
    private String world;

    public Worlded(Hello aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
//>>> DDD / Domain Event
