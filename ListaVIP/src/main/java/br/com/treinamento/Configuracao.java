package br.com.treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Configuracao {

	/*Essas configurações são melhores quando inseridas no arquivo application.properties no resouce
	 * 
	 * @Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.postgresql.Driver");
	    dataSource.setUrl("jdbc:postgresql://localhost:5432/listavip");
	    dataSource.setUsername("listavipuser");
	    dataSource.setPassword("iniciar");
	    return dataSource;
	}*/
	
	public static void main(String args[]) {
		SpringApplication.run(Configuracao.class, args);
	}
	
}
