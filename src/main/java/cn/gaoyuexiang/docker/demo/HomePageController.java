package cn.gaoyuexiang.docker.demo;

import java.util.Date;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
public class HomePageController {
    public Map home() {
        return ImmutableMap.of("Name", "Spring Boot Demo in Docker", 
        "Now: ", new Date(System.currentTimeMillis()));
    }
}