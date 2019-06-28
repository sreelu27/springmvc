package sree.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jasypt.util.password.StrongPasswordEncryptor;

@Configuration
public class CommonBeanConfig {

	@Bean
    public StrongPasswordEncryptor strongEncryptor(){
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        return encryptor;
    }
}
