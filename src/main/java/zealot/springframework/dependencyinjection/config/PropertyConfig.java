package zealot.springframework.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import zealot.springframework.dependencyinjection.example_beans.FakeDAO;
import zealot.springframework.dependencyinjection.example_beans.FakeJmsBroker;

@Configuration
@PropertySources({
        @PropertySource("classpath:fakedao.properties"),
        @PropertySource("classpath:jms.properties")
})
//@PropertySource({"classpath:fakedao.properties","classpath:jms.properties}"})
public class PropertyConfig {

//    @Autowired
//    Environment environment;

    @Value("${fakedao.user}")
    String user;

    @Value("${fakedao.pass}")
    String passwd;

    @Value("${fakedao.url}")
    String url;

    @Value("${jms.username}")
    String username;

    @Value("${jms.password}")
    String password;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeDAO fakeDAOSource(){
        FakeDAO fakeDAO = new FakeDAO();
        fakeDAO.setUrl(user);
//        fakeDAO.setUrl(environment.getProperty("USER"));
        fakeDAO.setPassword(passwd);
        fakeDAO.setUrl(url);
        return fakeDAO;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker =  new FakeJmsBroker();
        fakeJmsBroker.setUsername(username);
        fakeJmsBroker.setPassword(password);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
