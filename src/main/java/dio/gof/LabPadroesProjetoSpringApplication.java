package dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados:
 * <ul>
 * <li>Spring Data JPA</li>
 * <li>Spring Web</li>
 * <li>H2 Database</li>
 * <li>Open Feign</li>
 * </ul>
 *
 * @author squoliver83
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
