package ru.javawebinar.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.LoggedUser;
import ru.javawebinar.LoggerWrapper;
import ru.javawebinar.model.User;
import ru.javawebinar.service.UserService;
import ru.javawebinar.web.meal.UserMealRestController;

@Controller
public class UserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);
    @Autowired
    private UserService service;

    public User get() {
        int id  = LoggedUser.id();
        LOG.info("get", id);
        return service.get(id);
    }

    public void delete() {
        int id  = LoggedUser.id();
        LOG.info("delete {}", id);
        service.delete(id);
    }


    public void update(User user) {
        int id  = LoggedUser.id();
        LOG.info("update {}", id);
        service.update(user);
    }
}
