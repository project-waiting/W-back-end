package waiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaitingApplication.class, args);
        System.out.println("서버 작동");
    }

}
