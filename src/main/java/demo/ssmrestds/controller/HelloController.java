package demo.ssmrestds.controller;

import demo.ssmrestds.entity.HelloEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloEntity hello() {
        HelloEntity he = new HelloEntity();
        he.setMessage("Hello this is an Entity");
        return he;
    }
}
