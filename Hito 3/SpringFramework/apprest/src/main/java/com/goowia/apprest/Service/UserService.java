package com.goowia.apprest.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{

    @Override
    public String getName(String name) {
        return "Mi primer servicio REST by:" + name;
    }
}
