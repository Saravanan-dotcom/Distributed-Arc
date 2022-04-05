package com.task.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/sportsAcademyServiceFallBack")
    public String userServiceFallBackMethod() {
        return "Sports Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/sportSubscribeServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Student Service is taking longer than Expected." +
                " Please try again later";
    }
}
