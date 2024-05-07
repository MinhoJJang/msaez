package msaez.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OutHello", url = "${api.url.OutHello}")
public interface HelloService {
    @GetMapping(path = "/hellos")
    public List<Hello> getHello();

    @GetMapping(path = "/hellos/{id}")
    public Hello getHello(@PathVariable("id") Long id);
}
