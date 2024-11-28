package web.service;

import web.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final List<User> users = new ArrayList<User>();

    public UserServiceImpl(){
        users.add(new User("Ilgiz", "Sab", "ilgizsab@gmail.com"));
    }

    @Override
    public List<User> getUsers(Integer count){
        if (count == null || count >= users.size()) {
            return users;
        }
        return users.subList(0, count);
    }
}