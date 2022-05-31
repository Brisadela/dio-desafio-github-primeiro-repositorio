package dio.com.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class LabPadroeProjetoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroeProjetoJavaApplication.class, args);
	}

}
