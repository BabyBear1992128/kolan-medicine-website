package com.medicine.kolan.service;

import com.medicine.kolan.dao.UserDao;
import com.medicine.kolan.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserDao userDao;

    public List<UserModel> findAll() {
        return userDao.findAll();
    }

}
