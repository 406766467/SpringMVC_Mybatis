package com.sky.dao;



import com.sky.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserMapper {

	List<User> getAllUsers();

}
