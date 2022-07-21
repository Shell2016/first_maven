package ru.michaelshell.service;

import ru.michaelshell.service.service.UserService;

public class AppRunner {

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUser(3L));
    }
}
