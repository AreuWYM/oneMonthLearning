//package com.example.testprovider.service.impl;
//
//import com.example.testprovider.entity.User;
//import com.example.testprovider.repository.UserRepository;
//import com.example.testprovider.service.UserService;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public User getUserById(String id) {
//        return this.userRepository.findById(id).get();
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return this.userRepository.findAll();
//    }
//
//    @Override
//    public User addUser(User user) {
//        return this.userRepository.saveAndFlush(user);
//    }
//
//    @Override
//    public User updateUser(User user) {
//        return this.userRepository.saveAndFlush(user);
//    }
//
//    @Override
//    public void deleteUser(User user) {
//        this.userRepository.delete(user);
//    }
//
//    @Override
//    public void deleteUserById(String userId) {
//        this.userRepository.deleteById(userId);
//    }
//
//    @Override
//    public List<User> listUserNameLike(String name) {
//        return this.userRepository.findByNameLike(name);
//    }
//
//    @Override
//    public List<User> listUserByNameAndVolume(String name, int volume) {
//        return this.userRepository.findByNameAndId(name, volume);
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public void updateNameById(String name) {
//        User user = new User();
//        user.setName(name).setCreatedTime(new Date());
//
//        this.userRepository.saveAndFlush(user);
//        System.out.println("save id : " + user.getId());
//        if(true){throw new RuntimeException("mock exception!");}
//        this.userRepository.updateNameById("altered! "+ name, user.getId());
//        System.out.println("update id : "+ user.getId());
//    }
//}
//
