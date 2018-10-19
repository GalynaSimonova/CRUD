package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.repository.mock.MockUserRepository;
import ru.javawebinar.topjava.web.user.UserRestController;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args){
        try{ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");}
        {
            System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
            //UserMealRestController adminController = appCtx.
            //
          //  adminController.delete(7);
        }

        MockUserRepository mockUserRepository = (MockUserRepository) appCtx.getBean("mockUserRepository");
        mockUserRepository = appCtx.getBean(UserRestController.class);
        appCtx.close();
    }

}
