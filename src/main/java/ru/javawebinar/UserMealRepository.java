package ru.javawebinar;

import ru.javawebinar.model.UserMeal;

import java.time.LocalDateTime;
import java.util.List;

public interface UserMealRepository {
    UserMeal save(UserMeal UserMeal, int userId);

    boolean delete(int id, int userId);


    UserMeal get(int id, int userId);

    List<UserMeal> getAll(int userId);

    void deleteAll(int userId);
    List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
