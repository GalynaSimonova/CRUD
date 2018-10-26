package ru.javawebinar.topjava.repository.web.mock;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.javawebinar.web.user.AdminUserRestController;

@ContextConfiguration("classpath:spring/spring-app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserAdminSpringMockTest {

    //public class UserAdminSpringMockTest {

        @Autowired
        private AdminUserRestController controller;

        @Test
        public void testDelete() throws Exception {
            controller.delete(7);
        }

        @Test//(expected = NotFoundException.class)
        public void testDeleteNotFound() throws Exception {
            controller.delete(0);
        }
    }