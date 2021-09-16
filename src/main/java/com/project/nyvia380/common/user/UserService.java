package com.project.nyvia380.common.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
//    private UserDaoImpl userRepository;

    public String printUserPageMessage(){
        return "This is Users/People Page!";
    }



}
