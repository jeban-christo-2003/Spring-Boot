package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Controller {

ArrayList<Student>list=new ArrayList();
    @GetMapping("/csrf")
    public CsrfToken csrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/student")
    public String  addStudent(@RequestBody Student student) {
        list.add(student);
      return "Added Student";

    }
    @GetMapping("/Student")
    public Student getStudent() {
        return list.getFirst();
    }

}
