package com.medicine.kolan.dao;


import com.medicine.kolan.model.UserModel;
import com.medicine.kolan.model.UserModelRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao extends BaseDao{

    public List<UserModel> findAll() {
        String sql = """
               SELECT *
               FROM users
               WHERE 1 = 1;
           """;

        return getJdbcTemplate().query(sql, new UserModelRowMapper());
    }

}
