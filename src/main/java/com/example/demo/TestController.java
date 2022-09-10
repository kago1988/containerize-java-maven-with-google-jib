package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RequestMapping("/andreas")
@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final UserRepository userRepository;
    @PostMapping("/test")
    public String test(@RequestBody TestRequest testRequest, HttpServletRequest request) {
        log.info("I was here");
        log.info(testRequest.getFirstName());
        log.info("I was here 2");
        userRepository.save(User.builder().uuid(UUID.randomUUID().toString()).firstName(testRequest.getFirstName()).build());
        return "test";
    }
}
