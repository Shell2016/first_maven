package ru.michaelshell.service.service;

import ru.michaelshell.database.dao.UserDao;
import ru.michaelshell.database.entity.User;
import ru.michaelshell.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id).map(user -> new UserDto());
    }
}
