package msaez.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msaez.OutHelloApplication;
import msaez.domain.Worlded;

@Entity
@Table(name = "Hello_table")
@Data
//<<< DDD / Aggregate Root
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String world;

    @PostPersist
    public void onPostPersist() {
        Worlded worlded = new Worlded(this);
        worlded.publishAfterCommit();
    }

    public static HelloRepository repository() {
        HelloRepository helloRepository = OutHelloApplication.applicationContext.getBean(
            HelloRepository.class
        );
        return helloRepository;
    }
}
//>>> DDD / Aggregate Root
