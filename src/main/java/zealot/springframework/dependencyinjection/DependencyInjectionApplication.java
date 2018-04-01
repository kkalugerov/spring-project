package zealot.springframework.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import zealot.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import zealot.springframework.dependencyinjection.controllers.MyController;
import zealot.springframework.dependencyinjection.controllers.PropertyInjectedController;
import zealot.springframework.dependencyinjection.controllers.GetterInjectedController;
import zealot.springframework.dependencyinjection.example_beans.FakeDAO;

@SpringBootApplication
//overrode the default behavior of spring boot
//@ComponentScan(basePackages = {"zealot.springframework.dependencyinjection.services",
//		"zealot.springframework.dependencyinjection"})
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");

        FakeDAO fakeDAO = applicationContext.getBean(FakeDAO.class);

        System.out.println(fakeDAO);

//        System.out.println(myController.hello());
//        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(GetterInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }
}
