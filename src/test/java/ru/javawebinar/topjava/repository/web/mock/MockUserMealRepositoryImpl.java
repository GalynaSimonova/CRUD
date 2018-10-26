package ru.javawebinar.topjava.repository.web.mock;

import ru.javawebinar.LoggerWrapper;
import ru.javawebinar.UserMealRepository;
import ru.javawebinar.model.UserMeal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;
import java.util.List;

public class MockUserMealRepositoryImpl implements UserMealRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserMealRepositoryImpl.class);

    @PostConstruct
    public void postConstruct(){
        LOG.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOG.info("PreDestroy");
    }

    @Override
    public UserMeal save(UserMeal UserMeal, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return true;
    }

    @Override
    public UserMeal get(int id, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
