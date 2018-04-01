package zealot.springframework.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import zealot.springframework.dependencyinjection.example_beans.FakeDAO;

@Configuration
@PropertySource("classpath:fakedao.properties")
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${fakedao.user}")
    String user;

    @Value("${fakedao.pass}")
    String passwd;

    @Value("${fakedao.url}")
    String url;

    @Bean
    public FakeDAO fakeDAOSource(){
        FakeDAO fakeDAO = new FakeDAO();
//        fakeDAO.setUrl(user);
        fakeDAO.setUrl(environment.getProperty("USER"));
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
