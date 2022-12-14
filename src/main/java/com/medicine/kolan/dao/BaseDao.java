package com.medicine.kolan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    protected JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

}
