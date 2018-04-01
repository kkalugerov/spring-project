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
public class PropertyConfig {

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


}
