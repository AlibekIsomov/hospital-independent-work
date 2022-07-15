package com.hospital.demo.Service.withoutDTO.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.hospital.demo.Entity.Role;
import com.hospital.demo.Entity.User;
import com.hospital.demo.Repository.UserRepository;
import com.hospital.demo.Service.withDTO.UserDTO;
import com.hospital.demo.Service.withoutDTO.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;

    @Override
    public List<User> getAll(String key) {
        // TODO Auto-generated method stub
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).get();
    }

    @Override
    public User create(User entity) {
        // TODO Auto-generated method stub
        if(entity.getId() == null){
            entity.setRole(Role.USER);
            entity.setRegVaqt(LocalDateTime.now());
            entity.setOxirgiTashrif(LocalDateTime.now());
            entity.setAktiv(true);
            entity.setParol(encoder.encode(entity.getParol()));
            return userRepository.save(entity);
        }
        throw new RuntimeException("id null bo'lsihi shart");
    }

    @Override
    public User update(User entity) {
        User u = userRepository.findById(entity.getId()).get();
        u.setIsm(entity.getIsm());
        u.setFamiliya(entity.getFamiliya());
        u.setRasm(entity.getRasm());
        return userRepository.save(u);
    }

    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub
        userRepository.delete(entity);

    }

    @Override
    public void deleteById(Long dataId) {
        // TODO Auto-generated method stub
        userRepository.deleteById(dataId);

    }

    @Override
    public Optional<User> getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public UserDTO getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth.getPrincipal() instanceof UserDetails){
            UserDetails userDetails = (UserDetails) auth.getPrincipal();
            User u = userRepository.findByLogin(userDetails.getUsername()).orElseThrow(()->  new RuntimeException("not found"));
            return new UserDTO(u);
        }
        throw new RuntimeException("not found");
    }
}
