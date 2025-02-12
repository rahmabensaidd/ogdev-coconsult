package tn.esprit.examen.OGDevs_CoConsult;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping("/hello-1")
    @PreAuthorize("hasRole('client_user')")
    public String hello(){
        return "hello from springboot and keycloack";
    }
    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2(){
        return "hello from springboot and keycloack - ADMIN";
    }
}
