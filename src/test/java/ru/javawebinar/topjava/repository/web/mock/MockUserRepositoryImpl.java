package ru.javawebinar.topjava.repository.web.mock;

import org.springframework.stereotype.Repository;
import ru.javawebinar.LoggerWrapper;
import ru.javawebinar.UserRepository;
import ru.javawebinar.model.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Repository
public class MockUserRepositoryImpl implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepositoryImpl.class);

    @PostConstruct
    public void postConstruct(){
        LOG.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOG.info("PreDestroy");
    }

    @Override
    public boolean delete(int id) {
        LOG.info("Delete " + id);
        return id != 0;
    }

    @Override
    public User save(User user) {
        LOG.info("Save " + user);
        return user;
    }

    @Override
    public User get(int id){return null;}

    @Override
    public List<User> getAll(){return null;}

    @Override
    public User getByEmail(String email){return null;}


}
