package cn.gaoyuexiang.docker.demo.home;

import java.time.ZonedDateTime;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

import static java.time.ZoneId.of;

@RestController
public class HomePageController {

    private ZonedDateTime deployTime = ZonedDateTime.now(of("Asia/Shanghai"));

    @GetMapping()
    public Map home() {
        return ImmutableMap.of("Name", "Spring Boot Demo in Docker", "Deployed at: ", deployTime);
    }
}