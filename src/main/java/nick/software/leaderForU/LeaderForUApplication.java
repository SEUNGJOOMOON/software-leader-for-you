package nick.software.leaderForU;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.test")
@MapperScan(basePackages = "com.test.mapper")
public class LeaderForUApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaderForUApplication.class, args);
	}

}
