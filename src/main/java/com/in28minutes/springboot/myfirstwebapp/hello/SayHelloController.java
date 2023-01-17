package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @GetMapping("say-hello")
    @ResponseBody()
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("say-hello-html")
    @ResponseBody()
    public String sayHelloHTML() {
        return """
                 <html>
                 <head>
                 <title>My first html page changed</title>
                 </head>
                 <body>My first html body
                 </body>
                 </html>
                 """;
    }

    @GetMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
