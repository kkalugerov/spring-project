package zealot.springframework.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import zealot.springframework.dependencyinjection.example_beans.FakeDAO;

@Configuration
@PropertySource("classpath:fakedao.properties")
public class PropertyConfig {

    @Value("${fakedao.user}")
    String user;

    @Value("${fakedao.pass}")
    String passwd;

    @Value("${fakedao.url}")
    String url;

    @Bean
    public FakeDAO fakeDAOSource(){
        FakeDAO fakeDAO = new FakeDAO();
        fakeDAO.setUrl(user);
        fakeDAO.setPassword(passwd);
        fakeDAO.setUrl(url);
        return fakeDAO;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
