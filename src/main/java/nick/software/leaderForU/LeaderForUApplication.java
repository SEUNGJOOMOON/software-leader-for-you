package nick.software.leaderForU;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "nick.software")
@MapperScan(basePackages = "nick.software")
public class LeaderForUApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LeaderForUApplication.class);
		app.addListeners(new ApplicationPidFileWriter());   // pid 를 작성하는 역할을 하는 클래스 선언
		app.run(args);
	}

}
