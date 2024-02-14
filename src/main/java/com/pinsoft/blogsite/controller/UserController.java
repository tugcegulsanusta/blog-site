package com.pinsoft.blogsite.controller;

import com.pinsoft.blogsite.entity.User;
import com.pinsoft.blogsite.repository.UserRepository;
import com.pinsoft.blogsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class UserController {
    //TODO @QueryMapping
    @Autowired
    UserService userService;
    @QueryMapping
    public Collection<User> users(){
        return userService.getAllUsers();
    }
    @QueryMapping
    public User findByUserName(String username){
        return userService.findByUserName(username);
    }

    //TODO @ShemaMapping

    //TODO @MutationMapping

    //TODO @SubscriptionMapping

    //TODO @GraphQLExceptionHandler
    /*
    public GraphQLError handle(BindException ex) {
		return GraphQLError.newError().errorType(ErrorType.BAD_REQUEST).message("...").build();
	}
     */
}
