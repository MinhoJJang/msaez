package msaez.domain;

import java.util.*;
import lombok.*;
import msaez.domain.*;
import msaez.infra.AbstractEvent;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;
}
