package msaez.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msaez.InHelloApplication;
import msaez.domain.Hellod;

@Entity
@Table(name = "Hello_table")
@Data
//<<< DDD / Aggregate Root
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String hello;

    @PostPersist
    public void onPostPersist() {
        Hellod hellod = new Hellod(this);
        hellod.publishAfterCommit();
        // Get request from Hello
        //msaez.external.Hello hello =
        //    Application.applicationContext.getBean(msaez.external.HelloService.class)
        //    .getHello(/** mapping value needed */);

    }

    public static HelloRepository repository() {
        HelloRepository helloRepository = InHelloApplication.applicationContext.getBean(
            HelloRepository.class
        );
        return helloRepository;
    }
}
//>>> DDD / Aggregate Root
