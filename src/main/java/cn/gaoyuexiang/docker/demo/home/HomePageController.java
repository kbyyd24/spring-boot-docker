package cn.gaoyuexiang.docker.demo.home;

import java.util.Date;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
public class HomePageController {

    @GetMapping()
    public Map home() {
        return ImmutableMap.of("Name", "Spring Boot Demo in Docker", "Now: ", new Date(System.currentTimeMillis()));
    }
}