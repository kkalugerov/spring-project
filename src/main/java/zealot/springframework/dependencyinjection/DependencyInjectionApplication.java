package zealot.springframework.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zealot.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import zealot.springframework.dependencyinjection.controllers.MyController;
import zealot.springframework.dependencyinjection.controllers.PropertyInjectedController;
import zealot.springframework.dependencyinjection.controllers.GetterInjectedController;
import zealot.springframework.dependencyinjection.example_beans.FakeDAO;
import zealot.springframework.dependencyinjection.example_beans.FakeJmsBroker;

@SpringBootApplication
@Configuration
//overrode the default behavior of spring boot
//@ComponentScan(basePackages = {"zealot.springframework.dependencyinjection.services",
//		"zealot.springframework.dependencyinjection"})
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");

        FakeDAO fakeDAO = applicationContext.getBean(FakeDAO.class);

        System.out.println(fakeDAO);

        FakeJmsBroker fakeJmsBroker = applicationContext.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());

//        System.out.println(myController.hello());
//        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(GetterInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }
}
