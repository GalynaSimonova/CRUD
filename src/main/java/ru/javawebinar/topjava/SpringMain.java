package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.repository.mock.MockUserRepository;

import javax.swing.*;
import java.util.Arrays;

public class SpringMain {
    public static void main(Spring[] args){
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));
        MockUserRepository mockUserRepository = (MockUserRepository) appCtx.getBean("mockUserRepository");
        mockUserRepository = appCtx.getBean(MockUserRepository.class);
        appCtx.close();
//        UserAdminRest bean = bf.getBean(UserAdminRest.class);
//        bean.create(new User());
//        bean.delete(0);
//        bf.close();



    }

}
