package tn.esprit.examen.OGDevs_CoConsult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@EnableScheduling
@SpringBootApplication
public class  OGDevs_CoConsult {

    public static void main(String[] args) {
        SpringApplication.run(OGDevs_CoConsult.class, args);
    }

}
