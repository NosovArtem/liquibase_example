package com.nsv.soft.dev.lab.liquibase_example.conroller;

import com.nsv.soft.dev.lab.liquibase_example.model.User;
import com.nsv.soft.dev.lab.liquibase_example.service.MyService;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private Dotenv dotenv;

    private final MyService myService;

    public MyRestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/person")
    public String person() {
        Optional<User> byId = myService.getUsr(1L);
        String envVariableValue = dotenv.get("MY_VARIABLE");
        return envVariableValue;
    }

    @GetMapping("/car")
    public String car() {
        return "car";
    }

    @GetMapping("/passport")
    public String passport() {
        return "passport";
    }

    @GetMapping("/group")
    public String group() {
        return "group";
    }
}
