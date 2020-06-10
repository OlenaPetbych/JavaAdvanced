package ua.lviv.logos.po;

import ua.lviv.logos.po.entity.User;
import ua.lviv.logos.po.repository.UserRepository;
import ua.lviv.logos.po.repository.UserRepositoryImpl;

import static ua.lviv.logos.po.ConnectionManager.createConnection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        UserRepository userRepository = new UserRepositoryImpl(createConnection());

//        User user = new User("Olenka","Petryshak",18);
//        userRepository.save(user);
//        System.out.println(user);
//        System.out.println(userRepository.findAll());
//        User newUser = new User(3,"Olenka","Petryshak",26);
//        userRepository.update(newUser);
        System.out.println(userRepository.findById(3));
//        userRepository.delete(1);
    }
}
