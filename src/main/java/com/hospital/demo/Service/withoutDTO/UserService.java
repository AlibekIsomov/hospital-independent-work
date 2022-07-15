package com.hospital.demo.Service.withoutDTO;


import com.hospital.demo.Entity.User;
import com.hospital.demo.Service.withDTO.UserDTO;

import java.util.Optional;

public interface UserService extends CommonotherService<User> {
    Optional<User> getByLogin(String login);

    UserDTO getCurrentUser();
}
