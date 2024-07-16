package com.bookmyshow.demo.controllers;

import com.bookmyshow.demo.dtos.ResponseStatus;
import com.bookmyshow.demo.dtos.SignUpUserDtoResponse;
import com.bookmyshow.demo.dtos.SignUpUserRequestDto;
import com.bookmyshow.demo.models.User;
import com.bookmyshow.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public SignUpUserDtoResponse signUp(SignUpUserRequestDto request){
        User user = userService.signUp(request);
        return new SignUpUserDtoResponse(user.getId(),
                ResponseStatus.SUCCESS);
    }

    public boolean login(String email, String password){
        return userService.login(email, password);
    }
}
