package ru.javawebinar.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.LoggerWrapper;
import ru.javawebinar.model.User;
import ru.javawebinar.service.UserService;
import ru.javawebinar.web.meal.UserMealRestController;

import java.util.List;

@Controller
public class AdminUserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);
    @Autowired
    private UserService service;

    public List<User> getAll() {
        LOG.info("getAll");
        return service.getAll();
    }

    public User get(int id) {
        LOG.info("get" + id);
        return service.get(id);
    }


    public User create(User user) {
        LOG.info("create" + user);
        return service.save(user);
    }

    public void delete(int id) {
        LOG.info("delete ", id);
        service.delete(id);
    }


    public void update(User user) {
        LOG.info("update {}" + user);
        service.update(user);
    }

    public User getByMail(String email) {
        LOG.info("getByEmail " + email);
        return service.getByEmail(email);
    }
}
