package ru.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.model.User;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
public interface UserDao extends JpaRepository<User, Long> {
}
