package cn.gaoyuexiang.docker.demo.about;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;

@RestController
@RequestMapping("about")
public class AboutController {

    @GetMapping(produces = "application/json")
    public Map about() {
        return of("name", "docker-demo",
                "info", "Practicing docker");
    }
}
